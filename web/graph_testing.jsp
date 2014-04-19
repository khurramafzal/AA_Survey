<%-- 
    Document   : graph_testing
    Created on : 21-Nov-2013, 3:20:54 PM
    Author     : MAfzal
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link class="include" rel="stylesheet" type="text/css" href="css/jquery.jqplot.min.css" />
        <script type="text/javascript" src="js/shCore.min.js"></script>
        <script type="text/javascript" src="js/shBrushJScript.min.js"></script>
        <script type="text/javascript" src="js/shBrushXml.min.js"></script>

        <script class="include" type="text/javascript" src="js/jquery.jqplot.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasTextRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.canvasAxisLabelRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.donutRenderer.min.js"></script>
        <script class="include" type="text/javascript" src="js/jqplot.pieRenderer.min.js"></script>
        <script type="text/javascript" src="js/jqplot.bubbleRenderer.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            //UserBean user = new UserBean();
            UserDao dao = new UserDao();
            List<UserBean> userList = dao.getAllansForGraph();
            //Iterator<UserBean> itr = userList.iterator();

            List<UserBean> userList_sur = dao.getAllsurvey();

        %>   

        <fieldset>
            <legend>ENTER SURVEY</legend>

            <div class="row collapse">
                <div class="large-12 columns">
                    <table border="1">
                        <tr>

                        </tr>
                        <tr>
                            <%

                                String str = "";
                            
                                for (UserBean user : userList) {
                                  
                                    str = str + Integer.toString(user.get_ques_option_id());
                                    System.out.println(str);
                                    str = str + "," + "";
                                    System.out.println(str);

                      
                                }

                            %>

                        <tr>
                    </table>        
                    <div><input id="id1" value="<%=str%>"/></div>
                    <pre class="code brush:js"></pre>
                </div>

            </div>
        </fieldset>     

        <div id="chart1" style="height:300px; width:500px;"></div>
        <pre class="code brush:js"></pre>

        <script class="code" type="text/javascript">
            $(document).ready(function() {

                var abc = $("#id1").val();
                var arr = new Array();
                arr = abc.split(",");
                var plot2 = $.jqplot('chart1', [arr], {
                    // Give the plot a title.
                    title: 'Plot With Options',
                    // You can specify options for all axes on the plot at once with
                    // the axesDefaults object.  Here, we're using a canvas renderer
                    // to draw the axis label which allows rotated text.
                    axesDefaults: {
                        labelRenderer: $.jqplot.CanvasAxisLabelRenderer
                    },
                    // An axes object holds options for all axes.
                    // Allowable axes are xaxis, x2axis, yaxis, y2axis, y3axis, ...
                    // Up to 9 y axes are supported.
                    axes: {
                        // options for each axis are specified in seperate option objects.
                        xaxis: {
                            label: "X Axis",
                            // Turn off "padding".  This will allow data point to lie on the
                            // edges of the grid.  Default padding is 1.2 and will keep all
                            // points inside the bounds of the grid.
                            pad: 0
                        },
                        yaxis: {
                            label: "Y Axis"
                        }
                    }
                });
            });
        </script>


    </body>
</html>
