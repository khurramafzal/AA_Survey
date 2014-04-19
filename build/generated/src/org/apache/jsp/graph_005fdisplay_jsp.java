package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import java.util.*;

public final class graph_005fdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.min.css\">\n");
      out.write("        <script src=\"found/jquery.js\"></script>      \n");
      out.write("        <script src=\"found/custom.modernizr.js\"></script>     \n");
      out.write("        <script src=\"found/foundation.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]><script language=\"javascript\" type=\"text/javascript\" src=\"../excanvas.js\"></script><![endif]-->\n");
      out.write("\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("        <link class=\"include\" rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.jqplot.min.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shCore.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shBrushJScript.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/shBrushXml.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jquery.jqplot.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasTextRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.canvasAxisLabelRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.donutRenderer.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"js/jqplot.pieRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.bubbleRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.barRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.categoryAxisRenderer.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jqplot.pointLabels.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            //  alert(faq);    \n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("                var t1 = parseInt($(\"#id1\").val());\n");
      out.write("                var t2 = parseInt($(\"#id2\").val());\n");
      out.write("                var t3 = parseInt($(\"#id3\").val());\n");
      out.write("                var t4 = parseInt($(\"#id4\").val());\n");
      out.write("                //  alert(t1);\n");
      out.write("\n");
      out.write("                var faq = new Array(2);\n");
      out.write("                for (i = 0; i < 4; i++)\n");
      out.write("                {\n");
      out.write("                    faq[i] = new Array(2);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                faq[0][0] = 'good';\n");
      out.write("                faq[0][1] = t1;\n");
      out.write("                // alert(\"---------\" + $(\"#id3\").val());\n");
      out.write("\n");
      out.write("                faq[1][0] = 'very good';\n");
      out.write("                faq[1][1] = t2;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                faq[2][0] = 'very bad';\n");
      out.write("                faq[2][1] = t3;\n");
      out.write("\n");
      out.write("                faq[3][0] = 'bad';\n");
      out.write("                faq[3][1] = t4;\n");
      out.write("                //  var data =  $(\"#id2\").val();\n");
      out.write("\n");
      out.write("                // var data = [\n");
      out.write("                //   ['Heavy Industry', 12],['Retail', 9], ['Light Industry', 14],\n");
      out.write("                //   ['Out of home', 16],['Commuting', 7], ['Orientation', 9]\n");
      out.write("                // ];\n");
      out.write("                var plot1 = jQuery.jqplot('chart2', [faq],\n");
      out.write("                        {\n");
      out.write("                            seriesDefaults: {\n");
      out.write("                                // Make this a pie chart.\n");
      out.write("                                renderer: jQuery.jqplot.PieRenderer,\n");
      out.write("                                rendererOptions: {\n");
      out.write("                                    // Put data labels on the pie slices.\n");
      out.write("                                    // By default, labels show the percentage of the slice.\n");
      out.write("                                    showDataLabels: true\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            legend: {show: true, location: 'e'}\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            });\n");
      out.write("        </script>    \n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>$(document).foundation();</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            //UserBean user = new UserBean();
            UserDao dao = new UserDao();
            //   UserDao dao2 = new UserDao();
            List<UserBean> userList2 = dao.getAllsurvey();
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"large-4 columns\">\n");
      out.write("                <h2 >SURVEY FORMS</h2>\n");
      out.write("                <hr />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("                                       \n");
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>ENTER SURVEY</legend>\n");
      out.write("            <div class=\"row collapse\">\n");
      out.write("                <div class=\"large-12 columns\">\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Surveys</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                                /*while(itr.hasNext())
                                 {
                                 System.out.println(user.getId());*/
                                for (UserBean user : userList2) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <td> ");
      out.print(user.getsurvey());
      out.write("</td>\n");
      out.write("                            <td><a\n");
      out.write("                                    href=\"UserHandlerSurvey?action=displayReq_Ques_Graph&surveyid=");
      out.print(user.getsurveyID());
      out.write("\">Display</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }

                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </fieldset>                     \n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section-container auto\" data-section data-options=\"deep_linking: true;\">\n");
      out.write("                <section class=\"active\">\n");
      out.write("                    <p class=\"title\" data-section-title><a href=\"#panel1\">Cat 1</a></p>\n");
      out.write("                    <div class=\"content\" data-slug=\"panel1\" data-section-content>\n");
      out.write("                        <form>\n");
      out.write("\n");
      out.write("                            ");

                                String uid = request.getParameter("surveyid");
                                String uid_ques = request.getParameter("quesid");
                                System.out.println(uid + uid_ques);

                                if (!(uid == null) || !(uid_ques == null)) {
                                    int id = Integer.parseInt(uid);
//user = dao.getQuesBySurveyId(id);
                                    List<UserBean> userList = dao.getAllQuesBysurvey(id);

                            
      out.write("\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend>ENTER QUESTIONS</legend>\n");
      out.write("                                <div class=\"row collapse\">\n");
      out.write("                                    <div class=\"large-2 columns\">\n");
      out.write("                                        <label class=\"inline\">Question 1</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"large-7 columns\">\n");
      out.write("\n");
      out.write("                                        <table border=\"1\">\n");
      out.write("                                            <tr>\n");
      out.write("\n");
      out.write("                                            </tr>             \n");
      out.write("                                            <tr>\n");
      out.write("                                                ");

                                                    /*while(itr.hasNext())
                                                     {
                                                     System.out.println(user.getId());*/
                                                    for (UserBean user : userList) {
                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                ");
      out.write("         \n");
      out.write("                                                <td>");
      out.print(user.getQues_Survey());
      out.write("</td>\n");
      out.write("                                                <td>  <a href=\"UserHandlerSurvey?action=displayReq_Graph_&quesid=");
      out.print(user.getquestionID());
      out.write("&surveyid=");
      out.print(user.getQues_SurID());
      out.write("\" class=\"small button\">Option 1</a> </td>\n");
      out.write("\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                }

                                            
      out.write("\n");
      out.write("                                        </table>      \n");
      out.write("                                    </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                } else
                                    out.println("ID Not Found");
                            
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section-container auto\" data-section data-options=\"deep_linking: true;\">\n");
      out.write("                <section class=\"active\">\n");
      out.write("                    <p class=\"title\" data-section-title><a href=\"#panel1\">Cat 1</a></p>\n");
      out.write("                    <div class=\"content\" data-slug=\"panel1\" data-section-content>\n");
      out.write("                        <form>\n");
      out.write("\n");
      out.write("                            ");

                                String uid_G = request.getParameter("quesid");
                                //          String uid_ques_G = request.getParameter("quesid");
                                //    System.out.println(uid_G);


                                if (!(uid_G == null)) {
                                    int id = Integer.parseInt(uid_G);

                                    //      List<UserBean> userList_G = dao.getAllQuesBysurvey(id);

// For graphs from UserDao.java class
                                    UserBean pieUserBean1 = new UserBean();
                                    UserBean pieUserBean2 = new UserBean();
                                    UserBean pieUserBean3 = new UserBean();
                                    UserBean pieUserBean4 = new UserBean();


                                    System.out.println("id is :  " + id);
                                    pieUserBean1 = dao.data_pieChart_option1(id);
                                    pieUserBean2 = dao.data_pieChart_option2(id);
                                    pieUserBean3 = dao.data_pieChart_option3(id);
                                    pieUserBean4 = dao.data_pieChart_option4(id);

                                    //  int pieInt =  pieUserBean.get_ques_Graph_answer_numeric();
                                    String pie1 = Integer.toString(pieUserBean1.getpie_graph1());
                                    String pie2 = Integer.toString(pieUserBean2.getpie_graph2());
                                    String pie3 = Integer.toString(pieUserBean3.getpie_graph3());
                                    String pie4 = Integer.toString(pieUserBean4.getpie_graph4());





                                    //        System.out.println("pie is :  "+pieUserBean.getpie_graph1());
                                    //           System.out.println("pie is :  "+pieUserBean.getpie_graph2());

                                    List<UserBean> userList_G = dao.getGraphbyQuesID(id);

                            
      out.write("\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend>ENTER QUESTIONS</legend>\n");
      out.write("                                <div class=\"row collapse\">\n");
      out.write("                                    <div class=\"large-2 columns\">\n");
      out.write("                                        <label class=\"inline\">Question 1</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"large-7 columns\">\n");
      out.write("\n");
      out.write("                                        <table border=\"1\">\n");
      out.write("                                            <tr>\n");
      out.write("\n");
      out.write("                                            </tr>             \n");
      out.write("                                            <tr>\n");
      out.write("                                                ");

                                                    String str = "";
                                                    String str1 = "";

                                                    int test1 = 16;
                                                    int test2 = 12;

                                                    for (UserBean user : userList_G) {

                                                        str = str + Integer.toString(user.get_ques_Graph_answer_numeric());
                                                        System.out.println(str);
                                                        str = str + "," + "";
                                                        System.out.println(str);
                                                    }
                                                    System.out.println("userList_G.size------------" + userList_G.size());
                                                    String t = "";
                                                    String temp = "";
                                                    String temp2 = "";
                                                    int i = 0;
                                                    for (UserBean user : userList_G) {

                                                        //              str = Integer.toString(user.getquestionID());
                                                        str1 = Integer.toString(user.get_ques_Graph_answer_numeric());
                                                        temp2 = "['" + str + "'," + str1 + "]";
                                                        temp = temp + temp2 + ",";

                                                        System.out.println(str);
                                                        System.out.println(str1);



                                                    }
                                                    t = "[" + str1 + "]";
                                                    //         t = "["+temp+"]";
                                                    //   t =  "[['Heavy Industry', 12],['Retail', 9], ['Light Industry', 14],    ['Out of home', 16],['Commuting', 7], ['Orientation', 9]];";
                                                    System.out.println(t);

                                                
      out.write("\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div><input  id=\"id1\" value=\"");
      out.print(pie1);
      out.write("\"/></div>\n");
      out.write("                                        <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("                                        <div><input  id=\"id2\" value=\"");
      out.print(pie2);
      out.write("\"/></div>\n");
      out.write("                                        <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("                                        <div><input  id=\"id3\" value=\"");
      out.print(pie3);
      out.write("\"/></div>\n");
      out.write("                                        <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("                                        <div><input  id=\"id4\" value=\"");
      out.print(pie4);
      out.write("\"/></div>\n");
      out.write("                                        <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                            </fieldset>\n");
      out.write("\n");
      out.write("                            <div id=\"chart1\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("                            <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"chart2\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("                            <pre class=\"code brush:js\"></pre>\n");
      out.write("\n");
      out.write("                            <div id=\"chart3\" style=\"height:300px; width:500px;\"></div>\n");
      out.write("                            <pre class=\"code brush:js\"></pre>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"#\" class=\"button alert round disabled\">SUBMIT</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            ");

                                } else
                                    out.println("ID Not Found");
                            
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
