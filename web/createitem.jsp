<%-- 
    Document   : createitem
    Created on : Jun 23, 2022, 12:27:01 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
        <script>
            var loadFile = function (event) {
                var reader = new FileReader();
                reader.onload = function () {
                    var output = document.getElementById('output');
                    output.src = reader.result;
                };
                reader.readAsDataURL(event.target.files[0]);
            };// code display image upload
        </script>
        <style>
            #imageOut{
                margin: auto;
                position: absolute;
                float: left;
                width: 150px;
                height: 80px;
                padding-bottom: 50px;
            }
            #output{
                width: 150px;
                height: 80px;            
            }
        </style>
    </head>
    <body>
        <%
            String itemID = request.getParameter("itemID");
            String itemName = request.getParameter("itemName");
            String itemPic = request.getParameter("itemPic");
            String customerID = request.getParameter("customerID");
            String storeID = request.getParameter("storeID");
            String itemSendingDate = request.getParameter("itemSendingDate");
            String itemGettingDate = request.getParameter("itemGettingDate");
            String statusID = request.getParameter("statusID");
            String isKeep = request.getParameter("isKeep");
        %>
        <div>
            <div class="container-login100" style="background-image: url('https://khoanh24.com/gallery/save3?code=k-img2018k-img04k-img20k-imghinh-nen-chu-de-kinh-te-tai-chinh-dep-cho-powerpoint-anh-25ad9448d242d5_0cf1524d33806e56ccc351a09df190batype-jpg') "</div>

            <form action="CreateItems" method="post" enctype="multipart/form-data">
                <h1 style="background-color: #664d03;align-items: flex-start; font-size: 40px;margin-top:10px;border-radius: 10px;text-align: center;padding: 20px" >Thông Tin Vật Phẩm </h1></br>

                <div width="700" height="500" border="2" cellpaddixng="5" style="border-radius: 10px;background-color: #c0bffc;max-width: 50rem;padding:20px;margin: 10px"></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Tên Món Đồ:</p><input type="text" name="itemName" placeholder="Nhập Tên Món Đồ" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Hình ảnh:</p><input type="file" name="itemPic" accept="image" onchange="loadFile(event)" value="<%= itemPic%>" style="border: 1px solid #ccc;
                                                                                                            display: inline-block;
                                                                                                            padding: 6px 12px;
                                                                                                            cursor: pointer;width: 700px"/></br>
                    <div id="imageOut"><img id="output" src="images/itemPic/<%= itemPic%>"/></div></br>

                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit; margin-top: 50px">Mã Khách Hàng:</p><input type="text" name="customeID" placeholder="Mã Khách Hàng" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Cửa Hàng:</p><input type="text" name="storeID" placeholder="Nhập Mã Cửa Hàng" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Ngày Cầm:</p><input type="date" name="itemSendingDate"  style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Ngày Lấy:</p><input type="date" name="itemGettingDate" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>


                    <input type="submit" name="action" value="Tiếp" style="color:green;width: 700px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px"/>

                </div>
            </form>
        </div>
    </body>
</html>
