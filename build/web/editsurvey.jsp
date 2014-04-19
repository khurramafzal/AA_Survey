<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<html>
<head>
          <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script> 
        <link rel="stylesheet" href="css/admin.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>

<%
UserBean user = new UserBean();

UserDao dao = new UserDao();
%>
<form method="POST" action='UserHandlerSurvey' name="frmEditUser"><input
type="hidden" name="action" value="edit" /> <%
String uid = request.getParameter("surveyid");
if (!((uid) == null)) {
int id = Integer.parseInt(uid);
user = dao.getSurveyById(id);
%>
    <h2>update here</h2>
<table width="500" align="left">
<tr>
<td>Survey ID</td>
<td><input type="text" name="surveyid" readonly="readonly"
value="<%=user.getsurveyID()%>"></td>
</tr>
<tr>
<td>Survey Name</td>
<td><input type="text" name="Survey" value="<%=user.getsurvey()%>"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update" /></td>
</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>