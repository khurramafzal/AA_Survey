<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.survey.beans.UserBean"%>
<%@ page import="com.survey.dao.UserDao"%>
<%@ page import="java.util.*"%>
<html>
    <head>

        <%-- stype and script to keep the button with changed content   --%>
        <style>
            .selectBtn{height:60px;width:80px;
                       background-color:yellow;}
            #abc{background-color:gray;height:100%;width:60%;}
        </style>



        <script>
            content = document.getElementById('abc');

            function dx() {
                var Btn = document.createElement('button');
                Btn.type = 'button';
                Btn.className = 'selectBtn';
                Btn.innerHTML = 'Submit';
                Btn.onclick = function() {
                    this.innerHTML = 'Done';
                    sessionStorage.done = true;
                }
                if (sessionStorage.done) {
                    Btn.innerHTML = 'Done';
                }
                content.appendChild(Btn);
            }

            dx();
        </script>

        <%--end  --%>

        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.min.css">
        <link rel="stylesheet" href="css/user.css">
        <script src="found/jquery.js"></script>      
        <script src="found/custom.modernizr.js"></script>     
        <script src="found/foundation.min.js"></script>
        <script>$(document).foundation();</script> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  

        <header class="row">


            <div class="large-3 columns">
                <h1><img src="css/img/pmp_photosheet.png"></h1>
            </div>
            <div class="large-6 columns">
                <h1>SURVEY FORMS</h1>
            </div>
        </header>
        <ul class="breadcrumbs">         
            <%
                UserDao dao = new UserDao();
                List<UserBean> userList2 = dao.getAllsurvey();
            %>                            
            <li> <% for (UserBean user : userList2) {%>  </li>
            <li> <a href="UserHandlerSurvey?action=displayReq_Ques_User&surveyid=<%=user.getsurveyID()%>"><%=user.getsurvey()%></a></li> <% }%> </ul>
                <%
                    String uid = request.getParameter("surveyid");
                    String uid_ques = request.getParameter("quesid");
                    System.out.println(uid + uid_ques);
                    if (!(uid == null) || !(uid_ques == null)) {
                        int id = Integer.parseInt(uid);
                        List<UserBean> userList = dao.getAllQuesBysurvey(id);
                %>                     
        <div class="row">
            <div class="large-12 columns">

                <%  for (UserBean user : userList) {%>    
                <label style=" color:white;  font-size:30px; font-family: cursive;"><%=user.getQues_Survey()%></label>

                <ul class="inline-list">
                    <li> <a href="UserHandlerSurvey?action=insert_ans&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>&value=1" class="small button">Agree</a> </li>  
                    <li>   <a href="UserHandlerSurvey?action=insert_ans&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>&value=2" class="small button">Disagree</a>    </li> 
                    <li>  <a href="UserHandlerSurvey?action=insert_ans&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>&value=3" class="small button">strongly Agree</a>  </li> 
                    <li>  <a href="UserHandlerSurvey?action=insert_ans&quesid=<%=user.getquestionID()%>&surveyid=<%=user.getQues_SurID()%>&value=4" class="small button">Neutral</a>   </li> 
                </ul>
                
                

                <%     }%>

            </div>                     
            <%
                } else
                    out.println("ID Not Found");
            %>                              
        </div>   
    
        <!--   start footer section-->
        <footer class="row">

      
        </footer>
        <!--  end footer section-->


    </body>
</html>
