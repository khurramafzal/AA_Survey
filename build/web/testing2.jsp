<%-- 
    Document   : testing2
    Created on : 13-Nov-2013, 4:32:46 PM
    Author     : MAfzal
--%>


<%@page import="java.sql.*"%>
<%
String id[] =request.getParameterValues("quid"); 
if(id !=null) { 
for(int i=0;i<id.length;i++) { 
System.out.println(id[i]); 
} 
} 
String option[]= new String[5];
for(int i=0;i<5;i++){
option[i]=request.getParameter("radio"+i);
System.out.println(option[i]);
}
try{
Class.forName("com.mysql.jdbc.Driver"); 
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
Statement st=conn.createStatement();
for(int j=0;j<5;j++){
String optionValue=option[j];
String qid=id[j];
System.out.println("update question set phone='jhgfhg' where questionid=1");
st.executeUpdate("update question set options='"+optionValue+"' where questionid='"+qid+"'");
}

out.println("Inserted Successfully");
}
catch(Exception e){
out.println(e);
}
%>
