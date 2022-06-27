package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('https://khoanh24.com/gallery/save3?code=k-img2018k-img04k-img20k-imghinh-nen-chu-de-kinh-te-tai-chinh-dep-cho-powerpoint-anh-25ad9448d242d5_0cf1524d33806e56ccc351a09df190batype-jpg') \"</div>\r\n");
      out.write("\r\n");
      out.write("            <form action=\"CreateCustomer\" method=\"get\">\r\n");
      out.write("                <h1 style=\"background-color: #664d03; font-size: 50px;margin-top:20px;border-radius: 10px;text-align: center;padding: 20px; align-content: space-around\" >Tạo Mới Thông Tin Khách Hàng </h1></br>\r\n");
      out.write("                \r\n");
      out.write("                <div width=\"700\" height=\"500\" border=\"2\" cellpaddixng=\"5\" style=\"border-radius: 10px;background-color: #c0bffc;max-width: 50rem;padding:30px;margin-top: 50px\"></br>\r\n");
      out.write("                        <p style=\"font-size: 25px;border-radius: 10px;font-family: inherit\">Mã Khách Hàng:</p><input type=\"text\" name=\"customerID\" placeholder=\"Nhập Mã Khách Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;border-color: #000;padding: 20px;margin-bottom: 20px\"/></br>\r\n");
      out.write("                        <p style=\"font-size: 25px;border-radius: 10px;font-family: inherit\">Họ Và Tên:</p><input type=\"text\" name=\"fullName\" placeholder=\"Nhập Họ Và Tên:\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px;margin-bottom: 20px\"/></br>\r\n");
      out.write("                        <p style=\"font-size: 25px;border-radius: 10px;font-family: inherit\">Số Điện Thoại:</p><input type=\"text\" name=\"phoneNumber\" placeholder=\"Nhập Số Điện Thoại\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px;margin-bottom: 20px\"></br>\r\n");
      out.write("                        <p style=\"font-size: 25px;border-radius: 10px;font-family: inherit\">Địa Chỉ:</p><input type=\"text\" name=\"address\" placeholder=\"Nhập Mã Cửa Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px;margin-bottom: 20px\"></br>\r\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Tiếp\" style=\"color:green;width: 700px;background-color: threedshadow;border-radius: 10px ;text-align: center;background-color: threedface;margin-top: 20px;padding: 20px;font-size: 20px\"/>\r\n");
      out.write("                    \r\n");
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
