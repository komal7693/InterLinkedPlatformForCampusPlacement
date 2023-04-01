package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAOClasses.StudentDAO;
import java.sql.*;

public final class GraphData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>University details</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"deshboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"studentdashboard.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"bg\">\n");
      out.write("        <div id=\"left\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <div id = \"smaldiv\">\n");
      out.write("                    <img src=\"logo.jpg\" alt=\"\">\n");
      out.write("                    <!-- <h2>J</h2> -->\n");
      out.write("                </div>\n");
      out.write("                <h4>Admin <span>Penal</span></h4>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"leftHalf\">\n");
      out.write("                <div id=\"list\">\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"home.html\"><h5 id=\"dash\" >Home</h5></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"Unyversity_detail.html\"><h5 id=\"dash\" >Institute Info</h5></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"details\">\n");
      out.write("                        <i id=\"dash\" class=\"ri-dashboard-fill\"></i>\n");
      out.write("                        <a href=\"student.html\"><h5 id=\"dash\" >Student detail</h5></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"downList\">\n");
      out.write("                    <img src=\"https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png\" alt=\"\">\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"center\">\n");
      out.write("            <nav>\n");
      out.write("                <div id=\"one\">\n");
      out.write("                    <i class=\"ri-search-line\"></i>\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\">\n");
      out.write("                </div>\n");
      out.write("                <div id=\"two\">\n");
      out.write("                    <i class=\"ri-notification-2-fill\"></i>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div id=\"detailList\">\n");
      out.write("                <h3>Institute Information</h3>\n");
      out.write("            </div>\n");
      out.write("            <div><br>\n");
      out.write("              <style>\n");
      out.write("  #chartdiv {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 500px;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Resources -->\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/index.js\"></script>\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/xy.js\"></script>\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/themes/Animated.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Chart code -->\n");
      out.write("<script>\n");
      out.write("  am5.ready(function () {\n");
      out.write("    // Create root element\n");
      out.write("    // https://www.amcharts.com/docs/v5/getting-started/#Root_element\n");
      out.write("    var root = am5.Root.new(\"chartdiv\");\n");
      out.write("\n");
      out.write("    // Set themes\n");
      out.write("    // https://www.amcharts.com/docs/v5/concepts/themes/\n");
      out.write("    root.setThemes([am5themes_Animated.new(root)]);\n");
      out.write("\n");
      out.write("    // Create chart\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/\n");
      out.write("    var chart = root.container.children.push(\n");
      out.write("      am5xy.XYChart.new(root, {\n");
      out.write("        panX: false,\n");
      out.write("        panY: false,\n");
      out.write("        wheelX: \"panX\",\n");
      out.write("        wheelY: \"zoomX\",\n");
      out.write("        layout: root.verticalLayout,\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("\n");
      out.write("    // Add legend\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/legend-xy-series/\n");
      out.write("    var legend = chart.children.push(\n");
      out.write("      am5.Legend.new(root, {\n");
      out.write("        centerX: am5.p50,\n");
      out.write("        x: am5.p50,\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("  \n");
      out.write("    // Data\n");
      out.write("    ");
  ServletContext sc=request.getServletContext(); 
      out.write("\n");
      out.write("    var data = [\n");
      out.write("      {\n");
      out.write("        year: \"2017\",\n");
      out.write("       ");
  
            int [] arr1= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2017"); 
         
      out.write("\n");
      out.write("        income: ");
      out.print( arr1[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr1[1] );
      out.write(",\n");
      out.write("      },\n");
      out.write("      {\n");
      out.write("        year: \"2018\",\n");
      out.write("//        ");
  
            int [] arr2= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2018"); 
         
      out.write("\n");
      out.write("       income: ");
      out.print( arr2[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr2[1] );
      out.write(",\n");
      out.write("      },\n");
      out.write("      {\n");
      out.write("        year: \"2019\",\n");
      out.write("        ");
 int [] arr3= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2019");
      out.write(" \n");
      out.write("       income: ");
      out.print( arr3[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr3[1] );
      out.write(",\n");
      out.write("      },\n");
      out.write("      {\n");
      out.write("        year: \"2020\",\n");
      out.write("        ");
 int [] arr4= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2020"); 
      out.write("\n");
      out.write("        income: ");
      out.print( arr4[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr4[1] );
      out.write(",\n");
      out.write("      },\n");
      out.write("      {\n");
      out.write("        year: \"2021\",\n");
      out.write("       ");
  int [] arr5= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2021"); 
      out.write(" \n");
      out.write("       income: ");
      out.print( arr5[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr5[1] );
      out.write(",\n");
      out.write("      },\n");
      out.write("      {\n");
      out.write("        year: \"2022\",\n");
      out.write("        ");
  
          
            int [] arr6= StudentDAO.getUnAndEmployedStudentYearWise((Connection)sc.getAttribute("conn"),"2022"); 
         
      out.write("\n");
      out.write("        income: ");
      out.print( arr6[0] );
      out.write(",\n");
      out.write("        expenses:");
      out.print( arr6[1] );
      out.write(",\n");
      out.write("      }\n");
      out.write("    ];\n");
      out.write("\n");
      out.write("    // Create axes\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/axes/\n");
      out.write("    var yAxis = chart.yAxes.push(\n");
      out.write("      am5xy.CategoryAxis.new(root, {\n");
      out.write("        categoryField: \"year\",\n");
      out.write("        renderer: am5xy.AxisRendererY.new(root, {\n");
      out.write("          inversed: true,\n");
      out.write("          cellStartLocation: 0.1,\n");
      out.write("          cellEndLocation: 0.9,\n");
      out.write("        }),\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("\n");
      out.write("    yAxis.data.setAll(data);\n");
      out.write("\n");
      out.write("    var xAxis = chart.xAxes.push(\n");
      out.write("      am5xy.ValueAxis.new(root, {\n");
      out.write("        renderer: am5xy.AxisRendererX.new(root, {}),\n");
      out.write("        min: 0,\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("\n");
      out.write("    // Add series\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/series/\n");
      out.write("    function createSeries(field, name) {\n");
      out.write("      var series = chart.series.push(\n");
      out.write("        am5xy.ColumnSeries.new(root, {\n");
      out.write("          name: name,\n");
      out.write("          xAxis: xAxis,\n");
      out.write("          yAxis: yAxis,\n");
      out.write("          valueXField: field,\n");
      out.write("          categoryYField: \"year\",\n");
      out.write("          sequencedInterpolation: true,\n");
      out.write("          tooltip: am5.Tooltip.new(root, {\n");
      out.write("            pointerOrientation: \"horizontal\",\n");
      out.write("            labelText: \"[bold]{name}[/]\\n{categoryY}: {valueX}\",\n");
      out.write("          }),\n");
      out.write("        })\n");
      out.write("      );\n");
      out.write("\n");
      out.write("      series.columns.template.setAll({\n");
      out.write("        height: am5.p100,\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      series.bullets.push(function () {\n");
      out.write("        return am5.Bullet.new(root, {\n");
      out.write("          locationX: 1,\n");
      out.write("          locationY: 0.5,\n");
      out.write("          sprite: am5.Label.new(root, {\n");
      out.write("            centerY: am5.p50,\n");
      out.write("            text: \"{valueX}\",\n");
      out.write("            populateText: true,\n");
      out.write("          }),\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      series.bullets.push(function () {\n");
      out.write("        return am5.Bullet.new(root, {\n");
      out.write("          locationX: 1,\n");
      out.write("          locationY: 0.5,\n");
      out.write("          sprite: am5.Label.new(root, {\n");
      out.write("            centerX: am5.p100,\n");
      out.write("            centerY: am5.p50,\n");
      out.write("            text: \"{name}\",\n");
      out.write("            fill: am5.color(0xffffff),\n");
      out.write("            populateText: true,\n");
      out.write("          }),\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      series.data.setAll(data);\n");
      out.write("      series.appear();\n");
      out.write("\n");
      out.write("      return series;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    createSeries(\"income\", \"Employeed\");\n");
      out.write("    createSeries(\"expenses\", \"UnEmployeed\");\n");
      out.write("\n");
      out.write("    // Add legend\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/legend-xy-series/\n");
      out.write("    var legend = chart.children.push(\n");
      out.write("      am5.Legend.new(root, {\n");
      out.write("        centerX: am5.p50,\n");
      out.write("        x: am5.p50,\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("\n");
      out.write("    legend.data.setAll(chart.series.values);\n");
      out.write("\n");
      out.write("    // Add cursor\n");
      out.write("    // https://www.amcharts.com/docs/v5/charts/xy-chart/cursor/\n");
      out.write("    var cursor = chart.set(\n");
      out.write("      \"cursor\",\n");
      out.write("      am5xy.XYCursor.new(root, {\n");
      out.write("        behavior: \"zoomY\",\n");
      out.write("      })\n");
      out.write("    );\n");
      out.write("    cursor.lineY.set(\"forceHidden\", true);\n");
      out.write("    cursor.lineX.set(\"forceHidden\", true);\n");
      out.write("\n");
      out.write("    // Make stuff animate on load\n");
      out.write("    // https://www.amcharts.com/docs/v5/concepts/animations/\n");
      out.write("    chart.appear(1000, 100);\n");
      out.write("  }); // end am5.ready()\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- HTML -->\n");
      out.write("<div id=\"chartdiv\"></div>\n");
      out.write("                <!-- <div id=\"about\">\n");
      out.write("                    <a href=\"#\">About US</a>\n");
      out.write("                    <a href=\"#\"> Help</a>\n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
