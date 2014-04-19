package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import java.util.*;

public final class userDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .selectBtn{height:60px;width:80px;\n");
      out.write("                       background-color:yellow;}\n");
      out.write("            #abc{background-color:gray;height:100%;width:60%;}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            content = document.getElementById('abc');\n");
      out.write("\n");
      out.write("            function dx() {\n");
      out.write("                var Btn = document.createElement('button');\n");
      out.write("                Btn.type = 'button';\n");
      out.write("                Btn.className = 'selectBtn';\n");
      out.write("                Btn.innerHTML = 'Submit';\n");
      out.write("                Btn.onclick = function() {\n");
      out.write("                    this.innerHTML = 'Done';\n");
      out.write("                    sessionStorage.done = true;\n");
      out.write("                }\n");
      out.write("                if (sessionStorage.done) {\n");
      out.write("                    Btn.innerHTML = 'Done';\n");
      out.write("                }\n");
      out.write("                content.appendChild(Btn);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            dx();\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/user.css\">\n");
      out.write("        <script src=\"found/jquery.js\"></script>      \n");
      out.write("        <script src=\"found/custom.modernizr.js\"></script>     \n");
      out.write("        <script src=\"found/foundation.min.js\"></script>\n");
      out.write("        <script>$(document).foundation();</script> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("\n");
      out.write("        <header class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"large-3 columns\">\n");
      out.write("                <h1><img src=\"css/img/pmp_photosheet.png\"></h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"large-6 columns\">\n");
      out.write("                <h1>SURVEY FORMS</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <ul class=\"breadcrumbs\">         \n");
      out.write("            ");

                UserDao dao = new UserDao();
                List<UserBean> userList2 = dao.getAllsurvey();
            
      out.write("                            \n");
      out.write("            <li> ");
 for (UserBean user : userList2) {
      out.write("  </li>\n");
      out.write("            <li> <a href=\"UserHandlerSurvey?action=displayReq_Ques_User&surveyid=");
      out.print(user.getsurveyID());
      out.write('"');
      out.write('>');
      out.print(user.getsurvey());
      out.write("</a></li> ");
 }
      out.write(" </ul>\n");
      out.write("                ");

                    String uid = request.getParameter("surveyid");
                    String uid_ques = request.getParameter("quesid");
                    System.out.println(uid + uid_ques);
                    if (!(uid == null) || !(uid_ques == null)) {
                        int id = Integer.parseInt(uid);
                        List<UserBean> userList = dao.getAllQuesBysurvey(id);
                
      out.write("                     \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"large-12 columns\">\n");
      out.write("\n");
      out.write("                ");
  for (UserBean user : userList) {
      out.write("    \n");
      out.write("                <label style=\" color:white;  font-size:30px; font-family: cursive;\">");
      out.print(user.getQues_Survey());
      out.write("</label>\n");
      out.write("\n");
      out.write("                <ul class=\"inline-list\">\n");
      out.write("                    <li> <a href=\"UserHandlerSurvey?action=insert_ans&quesid=");
      out.print(user.getquestionID());
      out.write("&surveyid=");
      out.print(user.getQues_SurID());
      out.write("&value=1\" class=\"small button\">Agree</a> </li>  \n");
      out.write("                    <li>   <a href=\"UserHandlerSurvey?action=insert_ans&quesid=");
      out.print(user.getquestionID());
      out.write("&surveyid=");
      out.print(user.getQues_SurID());
      out.write("&value=2\" class=\"small button\">Disagree</a>    </li> \n");
      out.write("                    <li>  <a href=\"UserHandlerSurvey?action=insert_ans&quesid=");
      out.print(user.getquestionID());
      out.write("&surveyid=");
      out.print(user.getQues_SurID());
      out.write("&value=3\" class=\"small button\">strongly Agree</a>  </li> \n");
      out.write("                    <li>  <a href=\"UserHandlerSurvey?action=insert_ans&quesid=");
      out.print(user.getquestionID());
      out.write("&surveyid=");
      out.print(user.getQues_SurID());
      out.write("&value=4\" class=\"small button\">Neutral</a>   </li> \n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");
     }
      out.write("\n");
      out.write("\n");
      out.write("            </div>                     \n");
      out.write("            ");

                } else
                    out.println("ID Not Found");
            
      out.write("                              \n");
      out.write("        </div>   \n");
      out.write("    \n");
      out.write("        <!--   start footer section-->\n");
      out.write("        <footer class=\"row\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("        </footer>\n");
      out.write("        <!--  end footer section-->\n");
      out.write("\n");
      out.write("\n");
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
