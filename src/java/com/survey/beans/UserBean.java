package com.survey.beans;

/**
 * This class contains getter and setter methods 
 * to keep data.
 * 
 * @version 11/13/05
 * @author Khurram Afzal <khurramafzl@gmail.com>
 *  - Winter 2013 - Survey
 * 
 */

public class UserBean {


    private int questionID;
    private int ques_surid;
    private String ques_survey;
    private String question;
    private int surveyID;
    private String survey;
    private int ansID;
    private int answer;
    private int ques_optionID;
    private int graph_answer_numeric;
    private int graph_quesid;
    private int pie_graph1;
    private int pie_graph2;
    private int pie_graph3;
    private int pie_graph4;

    private String first_option;
     private String second_option;
      private String third_option;
       private String forth_option;


// getter and setter methods for questionID
       
    public int getquestionID() {
        return questionID;
    }

    public void setquestionID(int questionID) {
        this.questionID = questionID;
    }

// getter and setter methods for 
	
    public int getQues_SurID() {
        return ques_surid;
    }

    public void setQues_SurID(int ques_surid) {
        this.ques_surid = ques_surid;
    }

    // graph by question ID       
    public int getGraph_QuesID() {
        return graph_quesid;
    }

    public void setGraph_QuesID(int graph_quesid) {
        this.graph_quesid = graph_quesid;
    }

    public String getQues_Survey() {
        return ques_survey;
    }

    public void setQues_Survey(String ques_survey) {
        this.ques_survey = ques_survey;
    }

    public String getquestion() {
        return question;
    }

    public void setquestion(String question) {
        this.question = question;
    }

    public int getsurveyID() {
        return surveyID;
    }

    public void setsurveyID(int surveyID) {
        this.surveyID = surveyID;
    }

    public String getsurvey() {
        return survey;
    }

    public void setsurvey(String survey) {
        this.survey = survey;
    }

    public int getansID() {
        return ansID;
    }

    public void setansID(int ansID) {
        this.ansID = ansID;
    }

    public int getanswer() {
        return answer;
    }

    public void setanswer(int answer) {
        this.answer = answer;
    }

    public int get_ques_option_id() {
        return ques_optionID;
    }

    public void set_ques_option_id(int ques_optionID) {
        this.ques_optionID = ques_optionID;
    }

    public int get_ques_Graph_answer_numeric() {
        return graph_answer_numeric;
    }

    public void set_ques_graph_answer_numeric(int graph_answer_numeric) {
        this.graph_answer_numeric = graph_answer_numeric;
    }

    public int getpie_graph1() {
        return pie_graph1;
    }

    public void setpie_graph1(int pie_graph1) {
        this.pie_graph1 = pie_graph1;
    }
    
      public int getpie_graph2() {
        return pie_graph2;
    }

    public void setpie_graph2(int pie_graph2) {
        this.pie_graph2 = pie_graph2;
    }
      public int getpie_graph3() {
        return pie_graph3;
    }

    public void setpie_graph3(int pie_graph3) {
        this.pie_graph3 = pie_graph3;
    }
      public int getpie_graph4() {
        return pie_graph4;
    }
    public void setpie_graph4(int pie_graph4) {
        this.pie_graph4 = pie_graph4;
    }
    public String get_f_option() {
        return first_option;
    }
    public void set_f_option(String first_option) {
        this.first_option = first_option;
    }
    
        public String get_s_option() {
        return second_option;
    }
    public void set_s_option(String second_option) {
        this.second_option = second_option;
    }
    
        public String get_t_option() {
        return third_option;
    }
    public void set_t_option(String third_option) {
        this.third_option = third_option;
    }
    
        public String get_fo_option() {
        return forth_option;
    }
    public void set_fo_option(String forth_option) {
        this.forth_option = forth_option;
    }
    
}