<%-- 
    Document   : Default
    Created on : 3-Dec-2013, 12:23:42 PM
    Author     : MAfzal
--%>

<%@ include file="../Includes/FusionCharts.jsp"%>
<HTML>
   <HEAD>
      <TITLE>FusionCharts - dataURL and Database Example</TITLE>
      <SCRIPT LANGUAGE="Javascript" SRC="../../FusionCharts/FusionCharts.js"></SCRIPT>
   </HEAD>
   <BODY>
      <%
      /*
      In this example, we show how to connect FusionCharts to a database 
      using dataURL method. In our other examples, we've used dataXML method
      where the XML is generated in the same page as chart. Here, the XML data
      for the chart would be generated in PieData.jsp.
      */
      
      /*
      To illustrate how to pass additional data as querystring to dataURL, 
      we've added an animate property, which will be passed to PieData.jsp. 
      PieData.jsp would handle this animate property and then generate the 
      XML accordingly.
      */
      
      /*For the sake of ease, we've used an Access database which contains two tables,
         which are linked to each other.
      */
      
      //Variable to contain dataURL
      String strDataURL="";
      
      //Set DataURL with animation property to 1
      //NOTE: It's necessary to encode the dataURL if you've added parameters  to it
      strDataURL = encodeDataURL("PieData.jsp?animate=1","false",response);
      
      //Create the chart - Pie 3D Chart with dataURL as strDataURL
      String chartCode= createChart("../../FusionCharts/Pie3D.swf",       
      strDataURL, "", "FactorySum", 600, 300, false, false);
      %> 
      <%=chartCode%> 
      <BR>
      <BR>
      <a href='../NoChart.html' target="_blank">Unable to see the chart above?</a>
   </BODY>
</HTML>