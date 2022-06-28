<%-- 
    Document   : customer_update
    Created on : Jun 25, 2022, 10:41:26 AM
    Author     : User
--%>

<%-- 
    Document   : createcustomer
    Created on : Jun 6, 2022, 10:52:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Update</title>
        <link rel="stylesheet" type="text/css" href="css/main.css" />
    </head>
    <body>
        <%
            String fullName = request.getParameter("fullName");
            String customerID = request.getParameter("customerID");
            String address = request.getParameter("address");
            String phoneNumber = request.getParameter("phoneNumber");
            String statusID = request.getParameter("statusID");
        %>
        <div>
            <div class="container-login100" style="background-image: url('images/bg-01.jpg') "</div>

            <form action="UpdateCustomerController" method="get">
                <h1 style="background-color: #ff6699;align-items: flex-start; font-size: 40px;margin-top:30px;border-radius: 10px;text-align: center;padding: 20px" >Cập Nhật Thông Tin Khách Hàng </h1></br>

                <div width="700" height="500" border="2" cellpaddixng="5" style="border-radius: 10px;background-color: #ff9999;max-width: 50rem;padding:20px;margin: 10px"></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Khách Hàng:</p><input type="text" name="customerID" placeholder="Mã Khách Hàng" value="<%= customerID%>" style="width: 700px;height: 30px;border-radius: 10px;border-color: #000;padding: 20px;background-color: #B0BED9" readonly="true"/></br>



                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Họ Và Tên:</p><input type="text" name="fullName" placeholder="Nhập Tên Món Đồ" value="<%= fullName%>" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Số Điện Thoại:</p><input type="text" name="phoneNumber" placeholder="Nhập Số Điện Thoại" value="<%= phoneNumber%>" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Địa Chỉ:</p><input type="text" name="address" placeholder="Nhập Mã Cửa Hàng" value="<%= address%>" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Tình trạng lưu trữ thông tin:
                        <select name="statusID" >
                            <option value="true" <%if ("true".equals(statusID)) {%> selected="selected" <%}%>>Còn lưu</option>
                            <option value="false" <%if ("false".equals(statusID)) {%> selected="selected" <%}%>>Đã xóa</option>
                        </select>    
                    </p>
                    <input type="submit" name="action" value="update" style="color:green;width: 700px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px"/>
                    

                </div>
            </form>
        </div>
    </body>
</html>

