
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.survey.handler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import com.survey.dbconnection.ConnectionProvider;
import com.survey.handler.UserHandler;

/**
 *
 * @author MAfzal
 */
public class UserHandlerSurvey extends HttpServlet {

    private static String Insert_Ques = "/add_ques.jsp";
    private static String Record_Ques = "/admin.jsp";
    private static String Update_Ques = "/update_admin.jsp";
    private static String Insert_Survey = "/addsurvey.jsp";
    private static String Record_Survey = "/displaysurvey.jsp";
    private static String Update_Survey = "/editsurvey.jsp";
    private static String display_ques_byID = "/displayQuestion.jsp";
    private static String disQuesOnUser = "/userDisplay.jsp";
    private static String disQuesOnGraph = "/graph_display.jsp";
     private static String disQuesOption = "/addQuesOptions.jsp";
     
    private UserDao dao;

    public UserHandlerSurvey() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = "";
        String uId = request.getParameter("surveyid");
        String action = request.getParameter("action");
        String uId_ques = request.getParameter("quesid");

// Insert Survey ---------------------------------------------------------------
// -----------------------------------------------------------------------------        
        if (!((uId) == null) && action.equalsIgnoreCase("insert")) {
            //   int id = Integer.parseInt(uId);
            UserBean user = new UserBean();
            //      user.setsurveyID(id);
            user.setsurvey(request.getParameter("Survey"));
            dao.addSurvey(user);
            redirect = Insert_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
            System.out.println("Record Added Successfully");
        } 

// Re direct to addsurvey.jsp --------------------------------------------------
// -----------------------------------------------------------------------------        
        else if (action.equalsIgnoreCase("addsurveyPage")) {

            redirect = Insert_Survey;
            
// Re direct to addsurvey.jsp --------------------------------------------------
// -----------------------------------------------------------------------------            
        } else if (action.equalsIgnoreCase("add_quesPage")) {
            redirect = Insert_Ques;
        } 

//Delete the survey ------------------------------------------------------------   
// -----------------------------------------------------------------------------
        else if (action.equalsIgnoreCase("delete")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
             dao.removeAns(uid);
            dao.removeQuesbySID(uid);
            dao.removeSurvey(uid);
            redirect = Record_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
            System.out.println("Record Deleted Successfully");
        } 
        
// Re direct to editsurvey.jsp -------------------------------------------------
// -----------------------------------------------------------------------------        
        
        else if (action.equalsIgnoreCase("editform")) {
            redirect = Update_Survey;
        } 
        
// Update the Survey -----------------------------------------------------------
// -----------------------------------------------------------------------------        
        else if (action.equalsIgnoreCase("edit")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            user.setsurvey(request.getParameter("Survey"));
            dao.editSurvey(user);
            request.setAttribute("addsurvey", user);
            redirect = Record_Survey;
            System.out.println("Record updated Successfully");
        } 
// Display The Questions with respect to the survey selected -------------------           
// -----------------------------------------------------------------------------
        else if (action.equalsIgnoreCase("displayReq_Ques")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = display_ques_byID;
            System.out.println("Record updated Successfully");
        } 
// USER PAGE -------Display The Questions with respect to the survey selected -------------------           
// -----------------------------------------------------------------------------
        else if (action.equalsIgnoreCase("displayReq_Ques_User")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = disQuesOnUser;
            System.out.println("Record updated Successfully");
        }         
        
        
// USER PAGE -------Display The Questions FOR GRAPH with respect to the survey selected -------------------           
// -----------------------------------------------------------------------------
        else if (action.equalsIgnoreCase("displayReq_Ques_Graph")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = disQuesOnGraph;
            System.out.println("Record updated Successfully");
        }                 
        
// USER PAGE -------Display The Questions FOR GRAPH with respect to the survey selected -------------------           
// -----------------------------------------------------------------------------
        else if (action.equalsIgnoreCase("displayReq_Graph_")) {
            String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setquestionID(uid);
            dao.getAllGraphbyQuesId(uid);
            redirect = disQuesOnGraph;
            System.out.println("Record updated Successfully");
        }                         
// Re direct to displaysurvey.jsp ----------------------------------------------        
// -----------------------------------------------------------------------------        
        else if (action.equalsIgnoreCase("listUser")) {
            redirect = Record_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
        } 
        
// HANDLER FOR QUESTIONS  ------------------------------------------------------
// Insert the questions  -------------------------------------------------------
// -----------------------------------------------------------------------------        
        
        else if (!((uId) == null) && action.equalsIgnoreCase("insert_ques")) {
            //   int id = Integer.parseInt(uId_ques);
            int id2 = Integer.parseInt(request.getParameter("surveyid"));
            UserBean user = new UserBean();
            //              user.setquestionID(id);
            user.setsurveyID(id2);
            user.setquestion(request.getParameter("Question"));
            dao.addQues(user);
            redirect = Insert_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Added Successfully");

        } 
        
// HANDLER FOR QUESTIONS  ------------------------------------------------------
// Insert the questions  -------------------------------------------------------
// -----------------------------------------------------------------------------        
        
        else if (!((uId) == null) && action.equalsIgnoreCase("add_options")) {
      
            int id2 = Integer.parseInt(request.getParameter("quesid"));
            UserBean user = new UserBean();
          
            user.setquestionID(id2);
            user.set_f_option(request.getParameter("f_option"));
            user.set_s_option(request.getParameter("s_option"));
            user.set_t_option(request.getParameter("t_option"));
            user.set_fo_option(request.getParameter("fo_option"));
            dao.addOptions(user);
            redirect = Insert_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Added Successfully");

        }         
// HANDLER FOR Answers  --------------------------------------------------------
// Insert the Answers  ---------------------------------------------------------
// -----------------------------------------------------------------------------        
        
        else if (action.equalsIgnoreCase("insert_ans")) {
            
            int id = Integer.parseInt(request.getParameter("quesid"));
            int id2 = Integer.parseInt(request.getParameter("value"));
            UserBean user = new UserBean();
            user.setquestionID(id);
            user.setanswer(id2);
            dao.addAnswer(user);
            redirect = disQuesOnUser;
            request.setAttribute("answers", dao.getAllanswers());
            System.out.println("Record Added Successfully");
            
// Delete the questions  -------------------------------------------------------
// -----------------------------------------------------------------------------            
 

        } else if (action.equalsIgnoreCase("delete_ques")) {
            String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);
            dao.removeAns(uid);
            dao.removeQues(uid);
            redirect = display_ques_byID;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Deleted Successfully");

        } 
        
// Delete the questions  -------------------------------------------------------
// -----------------------------------------------------------------------------            
 
// Re direct to addQuesOption.jsp  ----------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("addQuesOption")) {
            redirect = disQuesOption;

        } 

         
// Re direct to update_admin.jsp  ----------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("editform_ques")) {
            redirect = Update_Ques;

        } 
// Re direct to displaysurvey.jsp  ----------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("displaySurvey")) {
            redirect = Record_Survey;

        }         
// Re direct to displaysurvey.jsp  ----------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("displayQuestions")) {
            redirect = Record_Survey;

        }                
// Update the question  --------------------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("edit_ques")) {
            String userId = request.getParameter("quesid");
            String surveyid = request.getParameter("surveyid");
            int surveyId = Integer.parseInt(surveyid);
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setquestionID(uid);
            user.setsurveyID(surveyId);
            user.setquestion(request.getParameter("Question"));
            dao.editQues(user);
            request.setAttribute("add_ques", user);
            redirect = display_ques_byID;
            System.out.println("Record updated Successfully");
        } 
        
// Re direct to admin.jsp  -----------------------------------------------------
// -----------------------------------------------------------------------------         
        else if (action.equalsIgnoreCase("listUser_ques")) {
            redirect = Record_Ques;
            request.setAttribute("question", dao.getAllQues());
        } 

//------------------------------------- end question handler -------------------
// -----------------------------------------------------------------------------        
// RE DIRECT TO ADD_QUES.JSP  --------------------------------------------------
         
        else {
            redirect = Insert_Ques;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}