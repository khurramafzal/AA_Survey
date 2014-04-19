<%-- 
    Document   : testing
    Created on : 13-Nov-2013, 4:31:45 PM
    Author     : MAfzal
--%>

<%@page import="java.sql.*"%>
<html>
<form method="post" action="testing2.jsp">
<table>
<%
Class.forName("com.mysql.jdbc.Driver"); 
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","");
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select * from question");
int i=0;
while(rs.next()){ 
%>
<tr><td><%=rs.getString(2)%></td>
<td><input type="hidden" name="quid" value="<%=rs.getString(1)%>"><td><input type="radio" value="Poor" name="radio<%=i%>"/>Poor</td><td><input type="radio" value="Average" name="radio<%=i%>"/>Average</td><td><input type="radio" value="Good" name="radio<%=i%>"/>Good</td></tr>
<% i++;
}
%>
<tr><td><input type="Submit" value="Submit"></td></tr>
</table>
</form>
</html>


