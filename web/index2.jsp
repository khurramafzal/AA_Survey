<%-- 
    Document   : index2
    Created on : 3-Dec-2013, 2:44:05 PM
    Author     : MAfzal
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="robots" content="noindex,nofollow"/>
<title>Programmers sample guide, help is on the way</title>
<link rel="stylesheet" type="text/css"  href="/extjs/resources/css/ext-all.css">
<script type="text/javascript" src="/extjs/ext-all-debug.js"></script>
<script type="text/javascript" src="../resources/scripts/chart.js"></script>
</head>
 
<body>
<div id="allContent">
<%
String chartType = request.getParameter("chartType");
if(chartType == null){
 chartType = "bar";
}
%>
<input type="hidden" id="chartType" name="chartType" value="<%= chartType %>">
 
<div id="myExample">
</div> 
</div>       
</body>
</html>