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
        <title>Questions</title>
    </head>
    <body>
        
         <%@include file="header.jsp" %>
        <form method="POST" action='UserHandlerSurvey' name="frmAddUser"><input
                type="hidden" name="action" value="insert" />
            <h2>Add New Survey</h2>
            <table width="400" align="left">
                <tr>
                    <td>Survey ID</td>
                    <td><input type="hidden" name="surveyid" /></td>
                </tr>
                <tr>
                    <td>Survey</td>
                    <td><input type="text" name="Survey" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
    <div class="button-bar3"><a href="UserHandlerSurvey?action=listUser" class="button">View-All-Records</a></div>
 
<%-- for testing purpose of merging display with the add --%>


        <%
            //UserBean user = new UserBean();
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllsurvey();
            //Iterator<UserBean> itr = userList.iterator();
%>

<h1>   ENTER SURVEY</h1>
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <thead>
                        <tr>
                            <th width="200">Survey Id</th>
                            <th width="400">Surveys</th>
                            <th width="100">Display</th>
                            <th width="100">Add</th>
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
                            <td><%=user.getsurveyID()%></td>
                            <td><%=user.getsurvey()%></td>
                            
                            
                            <td><a
                                    href="UserHandlerSurvey?action=displayReq_Ques&surveyid=<%=user.getsurveyID()%>">Display</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=add_quesPage&surveyid=<%=user.getsurveyID()%>">Add</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=editform&surveyid=<%=user.getsurveyID()%>">Update</a></td>
                            <td><a
                                    href="UserHandlerSurvey?action=delete&surveyid=<%=user.getsurveyID()%>">Delete</a></td>

                            

                        </tr>
                        <%
                            }

                        %>
                        </tbody>
                    </table>


                </div>




            </div>

      
        <div class="button-bar">
            <a href="UserHandlerSurvey?action=addsurveyPage" class="button">Add User</a>
        </div>


    </body>
</html>
