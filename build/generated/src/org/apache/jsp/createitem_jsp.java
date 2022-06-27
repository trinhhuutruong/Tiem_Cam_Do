package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Order Page</title>\r\n");
      out.write("        <script>\r\n");
      out.write("            var loadFile = function (event) {\r\n");
      out.write("                var reader = new FileReader();\r\n");
      out.write("                reader.onload = function () {\r\n");
      out.write("                    var output = document.getElementById('output');\r\n");
      out.write("                    output.src = reader.result;\r\n");
      out.write("                };\r\n");
      out.write("                reader.readAsDataURL(event.target.files[0]);\r\n");
      out.write("            };// code display image upload\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            #imageOut{\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                padding-bottom: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            #output{\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 80px;            \r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String itemID = request.getParameter("itemID");
            String itemName = request.getParameter("itemName");
            String itemPic = request.getParameter("itemPic");
            String customerID = request.getParameter("customerID");
            String storeID = request.getParameter("storeID");
            String itemSendingDate = request.getParameter("itemSendingDate");
            String itemGettingDate = request.getParameter("itemGettingDate");
            String statusID = request.getParameter("statusID");
            String isKeep = request.getParameter("isKeep");
        
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('https://khoanh24.com/gallery/save3?code=k-img2018k-img04k-img20k-imghinh-nen-chu-de-kinh-te-tai-chinh-dep-cho-powerpoint-anh-25ad9448d242d5_0cf1524d33806e56ccc351a09df190batype-jpg') \"</div>\r\n");
      out.write("\r\n");
      out.write("            <form action=\"CreateItems\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <h1 style=\"background-color: #664d03;align-items: flex-start; font-size: 40px;margin-top:10px;border-radius: 10px;text-align: center;padding: 20px\" >Thông Tin Vật Phẩm </h1></br>\r\n");
      out.write("\r\n");
      out.write("                <div width=\"700\" height=\"500\" border=\"2\" cellpaddixng=\"5\" style=\"border-radius: 10px;background-color: #c0bffc;max-width: 50rem;padding:20px;margin: 10px\"></br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Tên Món Đồ:</p><input type=\"text\" name=\"itemName\" placeholder=\"Nhập Tên Món Đồ\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Hình ảnh:</p><input type=\"file\" name=\"itemPic\" accept=\"image\" onchange=\"loadFile(event)\" value=\"");
      out.print( itemPic);
      out.write("\" style=\"border: 1px solid #ccc;\r\n");
      out.write("                                                                                                            display: inline-block;\r\n");
      out.write("                                                                                                            padding: 6px 12px;\r\n");
      out.write("                                                                                                            cursor: pointer;width: 700px\"/></br>\r\n");
      out.write("                    <div id=\"imageOut\"><img id=\"output\" src=\"images/itemPic/");
      out.print( itemPic);
      out.write("\"/></div></br>\r\n");
      out.write("\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit; margin-top: 50px\">Mã Khách Hàng:</p><input type=\"text\" name=\"customeID\" placeholder=\"Mã Khách Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"></br>\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Mã Cửa Hàng:</p><input type=\"text\" name=\"storeID\" placeholder=\"Nhập Mã Cửa Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"></br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Ngày Cầm:</p><input type=\"date\" name=\"itemSendingDate\"  style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\r\n");
      out.write("                    <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Ngày Lấy:</p><input type=\"date\" name=\"itemGettingDate\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Tiếp\" style=\"color:green;width: 700px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px\"/>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
