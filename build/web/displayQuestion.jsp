<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <head>
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <script></script>
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
    <link rel="stylesheet" href="css/admin.css">
        <script>$(document).foundation();</script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
//UserBean user = new UserBean();

UserDao dao = new UserDao();

%>
<form method="POST" action='UserHandlerSurvey' name="frmEditUser"><input
type="hidden" name="action" value="displayReq_Ques" /> <%
String uid = request.getParameter("surveyid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
//user = dao.getQuesBySurveyId(id);

List<UserBean> userList = dao.getAllQuesBysurvey(id);

%>


<h2>Display Question of selected survey</h2>
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <thead>
                        <tr>
                            <th width="100">Survey Id</th>
                            <th width="400">Questions</th>
                            <th width="100">Update</th>
                            <th width="100">Delete</th>

                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <%
                                /*while(itr.hasNext())
                                 {
                                 System.out.println(user.getId());*/
                                for (UserBean user : userList) {
                            %>
                            <td><%=user.getQues_SurID()%></td>
                            <td><%=user.getQues_Survey()%></td>
                            <td><a
                                    href="UserHandlerSurvey?action=editform_ques&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>">Update</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=delete_ques&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>" >Delete</a></td>
                                    
                            
                            
                        </tr>
                        <%
                            }
                        
                        %>
                        </tbody>
                    </table>
                     </div>

               

            
            </div>

     
                    
                      <div class="button-bar2">
            <a href="UserHandlerSurvey?action=displaySurvey" class="button">Back to Survey</a>
        </div>
                    <%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>