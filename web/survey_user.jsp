<%-- 
    Document   : survey_user
    Created on : 31-Oct-2013, 10:17:40 AM
    Author     : MAfzal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


<!--        <link rel="stylesheet" href="foundation/css/foundation.css">
        <link rel="stylesheet" href="foundation/css/foundation.min.css">
        <link rel="stylesheet" href="foundation/css/foundation.normalize.css">
        <link rel="stylesheet" href="foundation/css/style.css">

        <script src="foundation/js/vendor/jquery.js"></script>        
        <script src="foundation/js/vendor/custom.modernizr.js"></script>
        <script src="foundation/js/foundation.min.js"></script>  -->

<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/foundation.min.css">

  <script src="found/jquery.js"></script>      
  <script src="found/custom.modernizr.js"></script>     
  <script src="found/foundation.min.js"></script>

<script>$(document).foundation(); </script>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <div class="row">
<div class="large-4 columns">
<h2 >SURVEY FORMS</h2>
<hr />
</div>
</div>

        <div class="container">

            <div class="section-container auto" data-section data-options="deep_linking: true;">
                <section class="active">
                    <p class="title" data-section-title><a href="#panel1">category 1</a></p>
                    <div class="content" data-slug="panel1" data-section-content>
                        <form>
                             <fieldset>
                                  <legend>ENTER QUESTIONS</legend>
                            <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 1</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question1" placeholder="enter question1">
                                </div>
                                
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                 
                                     <select id="customDropdown1" class="medium">
                                      <option>AGREE</option>
                                      <option>DISAGREE</option>
                                      <option>STRONGLY AGREE</option>
                                      <option>NEUTRAL</option>
                                  </select>
                                 </label>
                                   </div>
                            </div>
                            <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline"> Question 2</label>
                                </div>
                                <div class="large-7 columns">
                                    <input type="text" id="question2" placeholder="enter question2">
                                </div>
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                       <select id="customDropdown1" class="medium">
                                             <option>AGREE</option>
                                      <option>DISAGREE</option>
                                    <option>STRONGLY AGREE</option>
                                  <option>NEUTRAL</option>
                                  </select>
                                 </label>
                                   </div>
                            </div>
                            <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline"> Question 3</label>
                                </div>
                                <div class="large-7 columns">
                                    <input type="text" id="question3" placeholder="enter question3">
                                </div>
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                       <select id="customDropdown1" class="medium">
                                             <option>AGREE</option>
                                      <option>DISAGREE</option>
                                    <option>STRONGLY AGREE</option>
                                  <option>NEUTRAL</option>
                                  </select>
                                 </label>
                                   </div>
                            </div>
     <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 4</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question4" placeholder="enter question4">
                                </div>
                                
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                       <select id="customDropdown1" class="medium">
                                             <option>AGREE</option>
                                      <option>DISAGREE</option>
                                    <option>STRONGLY AGREE</option>
                                  <option>NEUTRAL</option>
                                  </select>
                                 </label>
                                   </div>
                            </div>
     <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 5</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question5" placeholder="enter question5">
                                </div>
                                
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                       <select id="customDropdown1" class="medium">
                                             <option>AGREE</option>
                                      <option>DISAGREE</option>
                                    <option>STRONGLY AGREE</option>
                                  <option>NEUTRAL</option>
                                  </select>
                                 </label>
                                   </div>
                            </div>
                                                      </fieldset>
                            <div class="row">
                                <a href="#" class="button alert round disabled">SUBMIT</a>
                            </div>
                        </form>
                    </div>
                </section>
                <section>
                    <p class="title" data-section-title><a href="#panel2">category 2</a></p>
                    <div class="content" data-slug="panel2" data-section-content>
                        <div class="section-container auto" data-section data-options="deep_linking: true;">
                            <section class="active" data-section-region>
                                <p class="title" data-section-title><a href="#panel2nested1">sub category 1</a></p>
                                <div class="content" data-slug="nested1" data-section-content>
                                    <form>
                                        <fieldset>
                                             <legend>UPLOAD PICTURES</legend>
                                        <div class="row collapse">
                                            <div class="large-2 columns">
                                                <label class="inline"><img src="../img/demos/demo1.png"></label>
                                            </div>
                                            <div class="large-7 columns">
                                                <input type="text" id="yourName" placeholder="enter question1">
                                            </div>
                                            <div class="large-2 columns">
                                                 <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                            </div>
                                        </div>
                                       
                                        </fieldset>
                                        <div class="row">
                                            <a href="#" class="button alert round disabled">SUBMIT</a>
                                        </div>
                                    </form>
                                </div>
                            </section>
                            <section data-section-region>
                                <p class="title" data-section-title><a href="#panel2nested2">sub category  2</a></p>
                                <div class="content" data-slug="panel2nested2" data-section-content>
                                    <form>
                                         <fieldset>
                                             <legend>UPLOAD PICTURES</legend>
                                        <div class="row collapse">
                                            <div class="large-2 columns">
                                                <label class="inline"><img src="../img/demos/demo1.png"></label>
                                            </div>
                                            <div class="large-7 columns">
                                                <input type="text" id="yourName" placeholder="enter question1">
                                            </div>
                                            <div class="large-2 columns">
                                                 <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                            </div>
                                        </div>
                                       
                                        </fieldset>
                                        <div class="row">
                                            <a href="#" class="button alert round disabled">SUBMIT</a>
                                        </div>
                                    </form>
                                </div>
                            </section>
                            <div data-section-region class="section">
                                <p class="title" data-section-title><a href="#panel2nested3">sub category  3</a></p>
                                <div class="content" data-slug="panel2nested3" data-section-content>
                                    <form>
                                        <fieldset>
                                             <legend>UPLOAD PICTURES</legend>
                                        <div class="row collapse">
                                            <div class="large-2 columns">
                                                <label class="inline"><img src="../img/demos/demo1.png"></label>
                                            </div>
                                            <div class="large-7 columns">
                                                <input type="text" id="yourName" placeholder="enter question1">
                                            </div>
                                            <div class="large-2 columns">
                                                 <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                            </div>
                                        </div>
                                       
                                        </fieldset>
                                        <div class="row">
                                            <a href="#" class="button alert round disabled">SUBMIT</a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <div data-section-region class="section">
                    <p class="title" data-section-title><a href="#panel3">category 3</a></p>
                    <div class="content" data-slug="panel3" data-section-content>
                        <form>
                            <fieldset>
                                <legend>ENTER QUESTIONS</legend>
                             <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 1</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question1" placeholder="enter question1">
                                </div>
                                
                                <div class="large-2 columns">
                                  <label for="customDropdown1" class="inline">
                                  <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                        </label>
                                   </div>
                            </div>
                            <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline"> Question 2</label>
                                </div>
                                <div class="large-7 columns">
                                    <input type="text" id="question2" placeholder="enter question2">
                                </div>
                                <div class="large-2 columns">
                                   <label for="customDropdown1" class="inline">
                                  <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                        </label>
                                   </div>
                            </div>
                            <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline"> Question 3</label>
                                </div>
                                <div class="large-7 columns">
                                    <input type="text" id="question3" placeholder="enter question3">
                                </div>
                                <div class="large-2 columns">
                                 <label for="customDropdown1" class="inline">
                                  <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                        </label>
                                   </div>
                            </div>
     <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 4</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question4" placeholder="enter question4">
                                </div>
                                
                                <div class="large-2 columns">
                                   <label for="customDropdown1" class="inline">
                                  <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                        </label>
                                   </div>
                            </div>
     <div class="row collapse">
                                <div class="large-2 columns">
                                    <label class="inline">Question 5</label>
                                 </div>
                                
                                <div class="large-7 columns">
                                    <input type="text" id="question5" placeholder="enter question5">
                                </div>
                                
                                <div class="large-2 columns">
                                    <label for="customDropdown1" class="inline">
                                  <div class="small-2 switch medium round">

                                                <input id="d" name="switch-d" type="radio" checked>
                                                <label for="d" class="success button" onclick="">yes</label>

                                                <input id="d1" name="switch-d" type="radio">
                                                <label for="d1" class="small alert button" onclick="">no</label>

                                                <span> </span>
                                            </div>
                                        </label>
                                   </div>
                            </div>
                            </fieldset>
                            <div class="row">
                                <a href="#" class="button alert round disabled">SUBMIT</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
