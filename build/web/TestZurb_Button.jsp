<%-- 
    Document   : TestZurb_Button
    Created on : 19-Nov-2013, 9:30:33 AM
    Author     : MAfzal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>

 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Survey</title>


    <script>
      var categoryId = null;
    </script>

    <link href="button_js/application-454cd6bceaebb1d6efd280d1849b4280.css" media="screen" rel="stylesheet" />
    <link href="button_js/foundicons-5bb0c000ab78d795f62f4a83ac4cf31f.css" media="screen" rel="stylesheet" />
    <script src="button_js/vendor/custom.modernizr-8b14e1bab48835cc3f6679272cc68047.js"></script>
    
    


  </head>

  <body class="off-canvas hide-extras antialiased dark-page">

  <section role="main" class="body">

  <!-- Mobile nav header -->
  <div class="row show-for-small offcanvas-toggle">
    <div class="large-12 columns">
      <a class="sidebar-button" id="sidebarButton" href="#sidebar">
        <h4>ZURB Playground</h4>
      </a>
    </div>
  </div>


  <style type="text/css">
  .transparent.header {
    background: #333;
  }
  section[role="main"] {
    background: #333;
    color: #fff;
  }
  section[role="main"] h1 {
    color: #fff;
  }
  section[role="main"] h2 {
    color: #fff;
  }
  section[role="main"] h3 {
    color: #fff;
  }
  .button {
    margin-right: 0.5em;
    border-radius: 4px;
  }
  ol {
    margin-left: 2em;
  }
  div#sidebarAd.cleanslate {
    background: #444 !important;
    color: #fff !important;
  }
  div#sidebarAd.cleanslate .ad-sponsor {
    color: #ccc !important;
  }
  .zurb-footer-top {
    background: #222;
  }

  @-webkit-keyframes bigAssButtonPulse {
	  from { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }
	  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 50px #91bd09; }
	  to { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }
	}

	@-webkit-keyframes greenPulse {
	  from { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 18px #91bd09; }
	  to { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }
	}

	@-webkit-keyframes bluePulse {
	  from { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #2daebf; -webkit-box-shadow: 0 0 18px #2daebf; }
	  to { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }
	}

	@-webkit-keyframes redPulse {
	  from { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #e33100; -webkit-box-shadow: 0 0 18px #e33100; }
	  to { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }
	}

	@-webkit-keyframes magentaPulse {
	  from { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #a9014b; -webkit-box-shadow: 0 0 18px #a9014b; }
	  to { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }
	}

	@-webkit-keyframes orangePulse {
	  from { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #ff5c00; -webkit-box-shadow: 0 0 18px #ff5c00; }
	  to { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }
	}

	@-webkit-keyframes orangellowPulse {
	  from { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #ffb515; -webkit-box-shadow: 0 0 18px #ffb515; }
	  to { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }
	}

	a.button {
		-webkit-animation-duration: 2s;
		-webkit-animation-iteration-count: infinite; 
	}
	
	.green.button { -webkit-animation-name: greenPulse; -webkit-animation-duration: 3s; }
	.blue.button { -webkit-animation-name: bluePulse; -webkit-animation-duration: 4s; }
	.red.button { -webkit-animation-name: redPulse; -webkit-animation-duration: 1s; }
	.magenta.button { -webkit-animation-name: magentaPulse; -webkit-animation-duration: 2s; }
	.orange.button { -webkit-animation-name: orangePulse; -webkit-animation-duration: 3s; }
	.orangellow.button { -webkit-animation-name: orangellowPulse; -webkit-animation-duration: 5s; }
	
	.wall-of-buttons { text-align: center; margin-top: 2em; margin-bottom: 2em; }
</style>

<div id="radioactive-buttons-page" class="dark-code">



<!-- Wall of Buttons -->
<div class="row">
	<div class="large-12 columns wall-of-buttons">
		<a class="green button">Look at me!</a>
		<a class="blue button">Click me!</a>
		<a class="magenta button">Hi ho, Silver!</a>
		<a class="green button">Look at me!</a>
		<a class="red button">I'm Glowing!</a>
		<a class="magenta button">Hi ho, Silver!</a>
		
		<a class="orange button">Call to Action</a>
		<a class="magenta button">Hi ho, Silver!</a>
		<a class="green button">Look at me!</a>
		<a class="orangellow button">Got clicks?</a>
		<a class="blue button">Click me!</a>
		<a class="red button">I'm Glowing!</a>
		<a class="blue button">Click me!</a>
		
		<a class="magenta button">Hi ho, Silver!</a>
		<a class="orangellow button">Got clicks?</a>
		<a class="red button">I'm Glowing!</a>
		<a class="orange button">Call to Action</a>
		<a class="green button">Look at me!</a>
		<a class="orangellow button">Got clicks?</a>
		<a class="red button">I'm Glowing!</a>

		<a class="blue button">Click me!</a>
		<a class="orangellow button">Got clicks?</a>
		<a class="blue button">Click me!</a>
		<a class="red button">I'm Glowing!</a>
		<a class="orange button">Call to Action</a>
		<a class="orangellow button">Got clicks?</a>
	</div>
</div>
<!-- /Wall of Buttons -->




</div>

 


 
  
  
  <div class="reveal-modal-bg"></div>
  </section>


  <script src="button_js/application-33285803af8fb0638f18b56d23239b09.js"></script>
  <script src="button_js/jquery.offcanvas-c6deb341926c97e94c30e9e268a52ea1.js"></script>
  
  </body>
</html>
