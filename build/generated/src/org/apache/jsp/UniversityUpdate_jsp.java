package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UniversityUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Institute details</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"deshboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"studentdashboard.css\">\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            width:80%;\n");
      out.write("            margin:0px auto;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        table,tr,td,th{\n");
      out.write("            border:none;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            padding:8px 10px;\n");
      out.write("            width:40%;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            outline:none;\n");
      out.write("            font-size:16px;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            font-size:18px;\n");
      out.write("        }\n");
      out.write("        input:hover{\n");
      out.write("             box-shadow: 0px 0px 0px 2px skyblue;\n");
      out.write("            border-width: 0px;\n");
      out.write("        }\n");
      out.write("        input[type='submit']{\n");
      out.write("            width:80px;\n");
      out.write("            padding:10px 20px;\n");
      out.write("            position: relative;\n");
      out.write("            left:30%;\n");
      out.write("            top:10px;\n");
      out.write("        }\n");
      out.write("        input[type='submit']:hover{\n");
      out.write("            background-color: green;\n");
      out.write("            color:white;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        #detailList{\n");
      out.write("            position: relative;\n");
      out.write("            left:30%;\n");
      out.write("            color:blue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <style>#logout{\n");
      out.write("            position:absolute;\n");
      out.write("            left:90%;\n");
      out.write("            top:50px;\n");
      out.write("            border :2px solid black;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            padding:7px 15px;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            cursor: pointer;\n");
      out.write("            color:black;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        #logout:hover{\n");
      out.write("            background-color: black;\n");
      out.write("            color:white;\n");
      out.write("            text-decoration: underline;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("         span#ses{\n");
      out.write("            position:relative;\n");
      out.write("            top:50%;\n");
      out.write("            left:40%;\n");
      out.write("            color:blue;\n");
      out.write("            font-size:20px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("      </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     ");

        if(session.isNew()){
             out.println("<span id='ses'>Your Session Expired ,Please relogin !<span>");
             out.println("<a href='aicte.html' >Login page</a>");
             return ;
        }
    
      out.write("\n");
      out.write("    <a href='SessionExpire' id='logout' onclick='return check()'>logout</a>\n");
      out.write("          <script>\n");
      out.write("                 function check(){\n");
      out.write("                     let x= confirm(\"Are you sure ,do you want do logout\");\n");
      out.write("                     return x;\n");
      out.write("                 }\n");
      out.write("            </script>\n");
      out.write("    <div id=\"bg\">\n");
      out.write("        <div id=\"left\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <div id = \"smaldiv\">\n");
      out.write("                    <img src=\"logo.jpg\" alt=\"\">\n");
      out.write("                    <!-- <h2>J</h2> -->\n");
      out.write("                </div>\n");
      out.write("                <h4>AICTE</h4>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"leftHalf\">\n");
      out.write("                <div id=\"list\">\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"AdminDashboard.jsp\"><h5 id=\"dash\" >Home</h5></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"UniversityInfo.jsp\"><h5 id=\"dash\" >Institute Info</h5></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"UniversityUpdate.jsp\"><h5 id=\"dash\" >Add Institute detail</h5></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"AllStudents.jsp\"><h5 id=\"dash\" >Student detail</h5></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"downList\">\n");
      out.write("                    <img src=\"https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"center\">\n");
      out.write("           \n");
      out.write("            <div id=\"detailList\">\n");
      out.write("                <h2>Institute Information</h3>\n");
      out.write("            </div>\n");
      out.write("            <div><br>\n");
      out.write("                <form action='InstituteRegstraionServlet' method=\"post\">\n");
      out.write("                     <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter id\" name=\"id\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter your Institute name \" name=\"name\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <td><input required type=\"password\" min='8' placeholder=\"Password\" name=\"pwd\"> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter Address\" name=\"address\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>Postal code</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter Postal code\" name=\"postat_code\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>Region</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter Region\" name=\"region\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>State</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter State\" name=\"state\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>City</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter City\" name=\"city\"></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>Institute Type</th>\n");
      out.write("                        <td><input required type=\"text\" placeholder=\"Enter Unyversity type\" name=\"type\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Website</th>\n");
      out.write("                        <td><input type=\"text\" required placeholder=\"Enter Website\" name=\"website\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Contact No.</th>\n");
      out.write("                        <td><input type=\"text\" required placeholder=\"Enter contact No.\" name=\"contact\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Email Id</th>\n");
      out.write("                        <td><input required  type=\"email\" placeholder=\"Enter Email\" name=\"email\"></td>\n");
      out.write("                    </tr>        \n");
      out.write("                </table>\n");
      out.write("                    <input class='edit' type='submit' value='save'/>\n");
      out.write("                </form>    \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                <!-- <div id=\"about\">\n");
      out.write("                    <a href=\"#\">About US</a>\n");
      out.write("                    <a href=\"#\"> Help</a>\n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
