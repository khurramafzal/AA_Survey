<%-- 
    Document   : Chart_testing
    Created on : 18-Nov-2013, 11:09:39 AM
    Author     : MAfzal
--%>
<%@ page import="java.util.*"%>
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<!doctype html>


<html>
    <head>
        <meta charset="utf-8" />

        <style>
            a.test {
                font-weight: bold;
            }
        </style>

        <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="../excanvas.js"></script><![endif]-->
        <script class="include" type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>



<link class="include" rel="stylesheet" type="text/css" hrf="css/jquery.jqplot.min.css" />
        

 <script type="text/javascript" src="js/shCore.min.js"></script>
    <script type="text/javascript" src="js/shBrushJScript.min.js"></script>
    <script type="text/javascript" src="js/shBrushXml.min.js"></script>
        
        <script class="include" type="text/javascript" src="js/jquery.jqplot.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasTextRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasAxisLabelRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.donutRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.pieRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.bubbleRenderer.min.js"></script>

        
          <script type="text/javascript" src="js/jquery.highchartTable.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

       

        <fieldset>
            <legend>ENTER SURVEY</legend>
            
         
            
            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <tr>
                            <th>Survey Id</th>
                        </tr>
                        <tr>
                            <%
                               String t = "";
                                           //         t = "["+temp+"]";
                    t =  "Heavy Industry,12,Retail,9,Light Industry,14,Out of home,16,Commuting,7,Orientation,9";
                                             //       System.out.println(t);

                   %>
                    </table>


                    <div><input id="id2" value="[
    ['Heavy Industry', 12],['Retail', 9], ['Light Industry', 14],
    ['Out of home', 16],['Commuting', 7], ['Orientation', 9]
  ]"/></div>
                     <pre class="code brush:js"></pre>
                </div>

            </div>
        </fieldset>     
      
        <div id="chart2" style="height:300px; width:500px;"></div>
        <pre class="code brush:js"></pre>
      
        <script class="code" type="text/javascript">
   
            
            var faq = new Array(2);

for (i=0; i < 3; i++)
    {
        faq[i]=new Array(2);
    }


faq[0][0] ='Industry';
faq[0][1] = 12;


faq[1][0] = 'Retail';
faq[1][1] = 2;


    alert(faq);    
 
    $(document).ready(function() {
                  


  var plot1 = jQuery.jqplot ('chart2', [faq]  ,
  
    {
      seriesDefaults: {
        // Make this a pie chart.
        renderer: jQuery.jqplot.PieRenderer,
        rendererOptions: {
          // Put data labels on the pie slices.
          // By default, labels show the percentage of the slice.
          showDataLabels: true
        }
      },
      legend: { show:true, location: 'e' }
    }
    
   
    
  ); 
});
        </script>

<script>
    $(document).ready(function() {
  $('table.highchart').highchartTable();
});
</script>

<table class="highchart" 
  data-graph-container=".. .. .highchart-container" 
  data-graph-type="column">
  <caption>Column example</caption>
  <thead>
    <tr>
      <th>Month</th>
      <th>Sales</th>
      <th>Benefits</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>January</td>
      <td>8000</td>
      <td>2000</td>
    </tr>
  

  
  </tbody>
</table>

   

<input type="button" value="test" />
<input type="submit" value="Jtest" />


<iframe src="http://techcrunch.com"></iframe>

</body>
</html>
