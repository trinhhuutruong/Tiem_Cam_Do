drop database Q_ANT;
go
create database Q_ANT;
go
Use [Q_ANT];
go
create table tblAdmin(
adminID nvarchar(12) primary key,
fullName nvarchar(50) not null,
password nvarchar(20) not null
);
create table tblKey(
confirmKey nvarchar(8) primary key,
statusKey bit not null,
adminID nvarchar(12) foreign key references tblAdmin(adminID)
);
go
create table tblStaff(
staffID nvarchar(12) check (staffID not like '%[^0-9]%') primary key,
fullName nvarchar(50) not null,
password nvarchar(20) not null,
storeID INT,
statusID bit default 1
);
go
create table tblPawnShop(
storeID INT IDENTITY(1,1) primary key,
storeName nvarchar(20) not null,
storeAddress nvarchar(100) not null,
phoneNumber int not null,
managerID nvarchar(12) check (managerID not like '%[^0-9]%') foreign key references tblStaff(staffID),
confirmKey nvarchar(8) foreign key references tblKey(confirmKey),
statusID bit default 1
);
go 

CREATE TABLE tblCustomer 
(
customerID nvarchar(12) check (customerID not like '%[^0-9]%') PRIMARY KEY,
fullname nvarchar(50) not null,
phoneNumber int not null,
address nvarchar(100) not null,
statusID bit default 1
);

go

create table tblItem( 
        itemID           INT IDENTITY(1,1) primary key, 
        itemName         nvarchar(80) not null,
        itemPic          nvarchar(400) not null,
        customerID           nvarchar(12) foreign key references tblCustomer(customerID),
        storeID        int foreign key references tblPawnshop(storeID),
        itemSendingDate  Date not null,
        itemGettingDate  Date not null,
		statusID bit default 1,
		isKeep bit default 0
);
go

create table tblBill (
	billID INT IDENTITY(1,1) primary key,
	itemID INT foreign key references tblItem(itemID),
	pawnMoney money not null,
	numberDays int not null,
	interestRate float not null,
	billBeginDate DATE not null,
	staffID nvarchar(12) foreign key references tblStaff(staffID),
	returnMoney money default 0,
	statusID bit default 1
);

insert [tblAdmin] ([adminID], [fullName],[password]) values ('admin1','Admin','123456');
insert [tblAdmin] ([adminID], [fullName],[password]) values ('admin2','President','123456');
go
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('nAtEnAtE','true','admin1');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('hihihihi','true','admin1');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('idonknow','true','admin1');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('iloveyou','true','admin2');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('ihateyou','true','admin2');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('hello123','false','admin1');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('goodbyee','false','admin1');
Insert [tblKey] ([confirmKey],statusKey,adminID) values ('noyesno1','false','admin2');
go
Insert [tblStaff] ([staffID],[password],[fullName],storeID) values ('111111111111','123','John Le','');
Insert [tblStaff] ([staffID],[password],[fullName],storeID) values ('222222222222','123','Suzie Nguyen','');
Insert [tblStaff] ([staffID],[password],[fullName],storeID) values ('333333333333','123','Michale Jackson','');
Insert [tblStaff] ([staffID],[password],[fullName],storeID) values ('444444444444','123','Harry Potter','');
Insert [tblStaff] ([staffID],[password],[fullName],storeID)  values ('555555555555','123','John Cena','');
go
Insert [tblPawnShop] (storeName,storeAddress,phoneNumber,managerID,[confirmKey]) values ('Pawnbroker 1','100 Le Loi, District 1, HCM City','0912312312','111111111111','nAtEnAtE');
Insert [tblPawnShop] (storeName,storeAddress,phoneNumber,managerID,[confirmKey]) values ('The Pawnbroker','1 Do Xuan Hop, District 9, Thu Duc City','0913213213','222222222222','hihihihi');
Insert [tblPawnShop] (storeName,storeAddress,phoneNumber,managerID,[confirmKey]) values ('Lets Pawn','53 Hoang Xuan Nhi, District Tan Phu, HCM City','0909090909','333333333333','idonknow');
Insert [tblPawnShop] (storeName,storeAddress,phoneNumber,managerID,[confirmKey]) values ('Pawn Here','69 Bui Vien, District 1, HCM City','0987654321','444444444444','iloveyou');
Insert [tblPawnShop] (storeName,storeAddress,phoneNumber,managerID,[confirmKey]) values ('Pawnbroker store','25 Nguyen Gia Tri, District Binh Thanh, HCM City','0900101010','555555555555','ihateyou');

go
update tblStaff set storeID='1' where staffID='111111111111';
update tblStaff set storeID='2' where staffID='222222222222';
update tblStaff set storeID='3' where staffID='333333333333';
update tblStaff set storeID='4' where staffID='444444444444';
update tblStaff set storeID='5' where staffID='555555555555';
GO
insert [tblCustomer] (customerID,fullname,address,phoneNumber) values ('010101010101','Katty Phan','123 Le Van Viet, Distric 9, HCM City', '0123456789');
insert [tblCustomer] (customerID,fullname,address,phoneNumber) values ('020202020202','Sara Johnson','10 Pham Ngu Lao, Distric 5, HCM City', '0135792468');
insert [tblCustomer] (customerID,fullname,address,phoneNumber) values ('030303030303','Bille Ellish','50 Nguyen Hue, Distric 1, HCM City', '0120123012');
insert [tblCustomer] (customerID,fullname,address,phoneNumber) values ('040404040404','Leo Messi','90 Nguyen Trai, Distric 4, HCM City', '0165432178');
insert [tblCustomer] (customerID,fullname,address,phoneNumber) values ('050505050505','Donald Trump','100 Ho Xuan Huong, Distric 7, HCM City', '0161231239');
go
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Xe May SH','xe-may-SH.jpg','2021-12-22','2022-2-10', 'true','010101010101','1');
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Quat may','quat-may.jpg','2022-1-22','2022-2-5', 'true','010101010101','1');
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Dien thoai','dien-thoai.jpg','2022-2-25','2022-3-30', 'true','020202020202','1');
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Ipad mini','ipad-mini.jpg','2022-3-20','2022-4-10', 'true','030303030303','2');
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Laptop','laptop.jpg','2022-4-22','2022-5-10', 'true','040404040404','3');
Insert tblItem (itemName,itemPic,itemSendingDate,itemGettingDate,statusID,customerID,storeID) values ('Dong Ho','dong-ho.jpg','2022-4-25','2022-5-1', 'true','050505050505','4');

go

Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID,returnMoney) values ('2021-12-22','2.5','50000000','28','1','111111111111','1250000');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID) values ('2022-1-19','2.5','50000000','28','1','111111111111');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID) values ('2022-1-22','2.3','50000','14','2','111111111111');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID,returnMoney) values ('2022-2-25','2.5','10000000','28','3','111111111111','10250000');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID,returnMoney) values ('2022-3-20','2.4','12000000','21','4','222222222222','12288000');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID) values ('2022-4-22','2.4','20000000','21','5','333333333333');
Insert tblBill (billBeginDate,interestRate,pawnMoney,numberDays,itemID,staffID) values ('2022-4-25','2','2000000','7','6','444444444444');

go

SELECT * FROM tblAdmin;
SELECT * FROM tblKey;
SELECT * FROM tblStaff;
SELECT * FROM tblPawnShop;
SELECT * FROM tblCustomer;
SELECT * FROM tblItem;
SELECT * FROM tblBill;