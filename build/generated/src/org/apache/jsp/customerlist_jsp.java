package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CustomerDAO;
import dto.CustomerDTO;
import java.util.List;

public final class customerlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("        <title>Thông tin khách hàng</title>\r\n");
      out.write("        <!-- Favicon icon -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("        <!-- Custom Stylesheet -->\r\n");
      out.write("        <link href=\"./plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"> \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader start\r\n");
      out.write("        ********************-->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <div class=\"loader\">\r\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader end\r\n");
      out.write("        ********************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <div id=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Nav header start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <!--            <div class=\"nav-header\">\r\n");
      out.write("                            <div class=\"brand-logo\">\r\n");
      out.write("                                <a href=\"index.html\">\r\n");
      out.write("                                    <b class=\"logo-abbr\"><img src=\"images/logo.png\" alt=\"\"> </b>\r\n");
      out.write("                                    <span class=\"logo-compact\"><img src=\"./images/logo-compact.png\" alt=\"\"></span>\r\n");
      out.write("                                    <span class=\"brand-title\">\r\n");
      out.write("                                        <img src=\"images/logo-text.png\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Nav header end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Header start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Header end ti-comment-alt\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                <nav class=\"w3-sidebar w3-bar-block w3-small w3-hide-small w3-center\">\r\n");
      out.write("                    <!-- Avatar image in top left corner -->\r\n");
      out.write("                    <img src=\"images/imagesSWP.jpg\" style=\"width:100%\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"Bill\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\r\n");
      out.write("                        <i class=\"fa fa-file w3-xxlarge\"></i>\r\n");
      out.write("                        <p>Hóa đơn</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"customerlist.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-black\">\r\n");
      out.write("                        <i class=\"fa fa-user w3-xxlarge\"></i>\r\n");
      out.write("                        <p>Thông tin khách hàng</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("ư\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#photos\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\r\n");
      out.write("                        <i class=\"fa fa-dollar w3-xxlarge\"></i>\r\n");
      out.write("                        <p>Thống kê lợi nhuận</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"itemlist.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hover-black\">\r\n");
      out.write("                        <i class=\"fa fa-cart-plus w3-xxlarge\"></i>\r\n");
      out.write("                        <p>Thông tin món đồ</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("\r\n");
      out.write("                <!--            <div class=\"row page-titles mx-0\">\r\n");
      out.write("                                <div class=\"col p-md-0\">\r\n");
      out.write("                                    <ol class=\"breadcrumb\">\r\n");
      out.write("                                        <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Dashboard</a></li>\r\n");
      out.write("                                        <li class=\"breadcrumb-item active\"><a href=\"javascript:void(0)\">Home</a></li>\r\n");
      out.write("                                    </ol>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>-->\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div id =\"header_title_table\">\r\n");
      out.write("                                        <h4 class=\"card-title\">Thông tin khách hàng</h4>\r\n");
      out.write("                                        <input id=\"create_customer\" type=\"submit\" name=\"action\" onclick=\"location.href = 'createcustomer.jsp'\" value=\"Thông tin khách hàng\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        ");

                                            CustomerDAO dao = new CustomerDAO();
                                            List<CustomerDTO> cusList = dao.getAllCus();
                                            if (cusList != null) {
                                        
      out.write("\r\n");
      out.write("                                        <table class=\"table table-striped table-bordered zero-configuration\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Họ và tên</th>\r\n");
      out.write("                                                    <th>CMND</th>\r\n");
      out.write("                                                    <th>Địa chỉ</th>\r\n");
      out.write("                                                    <th>Điện thoại</th>\r\n");
      out.write("                                                    <th></th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                ");

                                                    for (CustomerDTO cus : cusList) {
                                                
      out.write("\r\n");
      out.write("                                            <form action=\"CustomerController\">\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print( cus.getFullname());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( cus.getCustomerID());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( cus.getAddress());
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( cus.getPhoneNumber());
      out.write("</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"customerID\" value=\"");
      out.print( cus.getCustomerID());
      out.write("\"/>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"fullname\" value=\"");
      out.print( cus.getFullname());
      out.write("\"/>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"address\" value=\"");
      out.print( cus.getAddress());
      out.write("\"/>\r\n");
      out.write("                                                        <input type=\"hidden\" name=\"phoneNumber\" value=\"");
      out.print( cus.getPhoneNumber());
      out.write("\"/>\r\n");
      out.write("                                                        <input type=\"submit\" name=\"action\" value=\"Cập nhật\" style=\"border-radius: 10px;padding: 5px;background-color: #f7f70c\"/>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                            ");
 } 
      out.write("\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("\r\n");
      out.write("                                            <!--                                        <tfoot>\r\n");
      out.write("                                                                                        <tr>\r\n");
      out.write("                                                                                            <th>Name</th>\r\n");
      out.write("                                                                                            <th>Position</th>\r\n");
      out.write("                                                                                            <th>Office</th>\r\n");
      out.write("                                                                                            <th>Age</th>\r\n");
      out.write("                                                                                            <th>Start date</th>\r\n");
      out.write("                                                                                            <th>Salary</th>\r\n");
      out.write("                                                                                        </tr>\r\n");
      out.write("                                                                                    </tfoot>-->\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                        ");
 }
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- #/ container -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Footer start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <!--                <p>Copyright &copy; Designed & Developed by <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a> 2018</p>-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Footer end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Scripts\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <script src=\"plugins/common/common.min.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/settings.js\"></script>\r\n");
      out.write("        <script src=\"js/gleek.js\"></script>\r\n");
      out.write("        <script src=\"js/styleSwitcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
