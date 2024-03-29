package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestZurb_005fButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8 ]>    <html class=\"ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--> <html lang=\"en\"> <!--<![endif]-->\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\" />\n");
      out.write("<meta name=\"keywords\" content=\"radioactive buttons, rgba buttons, CSS3 buttons, animated css buttons\" />\n");
      out.write("<meta name=\"description\" content=\"Create killer button focus effects using some very simple RGBa colors and -webkit-animations.\" />\n");
      out.write("<meta name=\"author\" content=\" ZURB, inc.\" />\n");
      out.write("<meta name=\"copyright\" content=\"ZURB, inc. Copyright (c) 2013\" />\n");
      out.write("<meta name=\"verify-v1\" content=\"FIGJ61mNGm8gsksgklVzG71j7+Q0u6zTDF+VE9vA/8k=\" />\n");
      out.write("\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"57x57\" href=\"/playground/assets/apple-icons/touch-icon-iphone-3f3895def3415bfad416a685b18fee58.png\" />\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"/playground/assets/apple-icons/touch-icon-ipad-136c9ebf8ee95c15c2f2b90c352a79d5.png\" />\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"/playground/assets/apple-icons/touch-icon-iphone-retina-13c692143ce333fd6d78493286554dd7.png\" />\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"/playground/assets/apple-icons/touch-icon-ipad-retina-9da8ffb990fc87d37116717b54594d0f.png\" />\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/playground/assets/icons/favicon-e5ac853a9c2c9b29b308830a597cfa42.ico\">\n");
      out.write("\n");
      out.write("    <title>Radioactive Buttons with RGBa and Animations | Playground from ZURB</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      var categoryId = null;\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <link href=\"/playground/assets/application-454cd6bceaebb1d6efd280d1849b4280.css\" media=\"screen\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"/playground/assets/foundicons-5bb0c000ab78d795f62f4a83ac4cf31f.css\" media=\"screen\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"/playground/assets/vendor/custom.modernizr-8b14e1bab48835cc3f6679272cc68047.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'UA-2195009-2']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\t_gaq.push(['b._setAccount', 'UA-2195009-29']);\n");
      out.write("\t_gaq.push(['b._trackPageview']);\n");
      out.write("\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <meta content=\"authenticity_token\" name=\"csrf-param\" />\n");
      out.write("<meta content=\"9qSfFGZeT09AEU24U/8+iGS2553dgv5LIf9pIXZHqEg=\" name=\"csrf-token\" />\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"off-canvas hide-extras antialiased dark-page\">\n");
      out.write("\n");
      out.write("  <section role=\"main\" class=\"body\">\n");
      out.write("\n");
      out.write("  <!-- Mobile nav header -->\n");
      out.write("  <div class=\"row show-for-small offcanvas-toggle\">\n");
      out.write("    <div class=\"large-12 columns\">\n");
      out.write("      <a class=\"sidebar-button\" id=\"sidebarButton\" href=\"#sidebar\">\n");
      out.write("        <h4>ZURB Playground</h4>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- /Mobile nav header -->\n");
      out.write("\n");
      out.write("  <!-- University topbar -->\n");
      out.write("  <nav class=\"top-bar hide-for-small\">\n");
      out.write("    <ul>\n");
      out.write("      <!-- Title Area -->\n");
      out.write("      <li class=\"name\">\n");
      out.write("        <h1><a class=\"university\" href=\"http://www.zurb.com/university\">ZURB <strong>University</strong></a></h1>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"toggle-topbar\"><a href=\"#\"></a></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <section>\n");
      out.write("      <!-- Right Nav Section -->\n");
      out.write("      <ul class=\"right\">\n");
      out.write("        <li><a href=\"http://zurb.com/university/courses\">Courses</a></li>\n");
      out.write("        <li class=\"has-dropdown\">\n");
      out.write("          <a href=\"http://zurb.com/university/library\">Library</a>\n");
      out.write("          <ul class=\"dropdown\">\n");
      out.write("            <li><a href=\"http://patterntap.com\">Pattern Tap</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/word\">Word</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/responsive\">Responsive</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/playground\">Playground</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/quips\">Quips</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/friday15\">Friday 15</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://zurb.com/university/community\">Community</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://www.zurb.com/jobs\">Job Board</a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </section>\n");
      out.write("  </nav>\n");
      out.write("  <!-- University topbar -->\n");
      out.write("\n");
      out.write("  <!-- Desktop header/nav -->\n");
      out.write("  <div class=\"transparent  header hide-for-small\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"large-7 columns logo\">\n");
      out.write("        <h2><a href=\"/playground/\">Playground</a></h2>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"large-5 columns\">\n");
      out.write("        <ul class=\"navigation\">\n");
      out.write("          <li class=\"\"><a href=\"/playground/\">Home</a></li>\n");
      out.write("          <li class=\"\"><a href=\"/playground/about\">About</a></li>\n");
      out.write("          <li class=\"\"><a href=\"/playground/graduates\">Graduates</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- /Header/nav -->\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  .transparent.header {\n");
      out.write("    background: #333;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] {\n");
      out.write("    background: #333;\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h1 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h2 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  section[role=\"main\"] h3 {\n");
      out.write("    color: #fff;\n");
      out.write("  }\n");
      out.write("  .button {\n");
      out.write("    margin-right: 0.5em;\n");
      out.write("    border-radius: 4px;\n");
      out.write("  }\n");
      out.write("  ol {\n");
      out.write("    margin-left: 2em;\n");
      out.write("  }\n");
      out.write("  div#sidebarAd.cleanslate {\n");
      out.write("    background: #444 !important;\n");
      out.write("    color: #fff !important;\n");
      out.write("  }\n");
      out.write("  div#sidebarAd.cleanslate .ad-sponsor {\n");
      out.write("    color: #ccc !important;\n");
      out.write("  }\n");
      out.write("  .zurb-footer-top {\n");
      out.write("    background: #222;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  @-webkit-keyframes bigAssButtonPulse {\n");
      out.write("\t  from { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }\n");
      out.write("\t  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 50px #91bd09; }\n");
      out.write("\t  to { background-color: #749a02; -webkit-box-shadow: 0 0 25px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes greenPulse {\n");
      out.write("\t  from { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #91bd09; -webkit-box-shadow: 0 0 18px #91bd09; }\n");
      out.write("\t  to { background-color: #749a02; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes bluePulse {\n");
      out.write("\t  from { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #2daebf; -webkit-box-shadow: 0 0 18px #2daebf; }\n");
      out.write("\t  to { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes redPulse {\n");
      out.write("\t  from { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #e33100; -webkit-box-shadow: 0 0 18px #e33100; }\n");
      out.write("\t  to { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes magentaPulse {\n");
      out.write("\t  from { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #a9014b; -webkit-box-shadow: 0 0 18px #a9014b; }\n");
      out.write("\t  to { background-color: #630030; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes orangePulse {\n");
      out.write("\t  from { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #ff5c00; -webkit-box-shadow: 0 0 18px #ff5c00; }\n");
      out.write("\t  to { background-color: #d45500; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t@-webkit-keyframes orangellowPulse {\n");
      out.write("\t  from { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t  50% { background-color: #ffb515; -webkit-box-shadow: 0 0 18px #ffb515; }\n");
      out.write("\t  to { background-color: #fc9200; -webkit-box-shadow: 0 0 9px #333; }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\ta.button {\n");
      out.write("\t\t-webkit-animation-duration: 2s;\n");
      out.write("\t\t-webkit-animation-iteration-count: infinite; \n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.green.button { -webkit-animation-name: greenPulse; -webkit-animation-duration: 3s; }\n");
      out.write("\t.blue.button { -webkit-animation-name: bluePulse; -webkit-animation-duration: 4s; }\n");
      out.write("\t.red.button { -webkit-animation-name: redPulse; -webkit-animation-duration: 1s; }\n");
      out.write("\t.magenta.button { -webkit-animation-name: magentaPulse; -webkit-animation-duration: 2s; }\n");
      out.write("\t.orange.button { -webkit-animation-name: orangePulse; -webkit-animation-duration: 3s; }\n");
      out.write("\t.orangellow.button { -webkit-animation-name: orangellowPulse; -webkit-animation-duration: 5s; }\n");
      out.write("\t\n");
      out.write("\t.wall-of-buttons { text-align: center; margin-top: 2em; margin-bottom: 2em; }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div id=\"radioactive-buttons-page\" class=\"dark-code\">\n");
      out.write("\n");
      out.write("<!-- Page header -->\n");
      out.write("<div class=\"row project-header\">\n");
      out.write("\t<div class=\"large-8 columns\">\n");
      out.write("\t\t<h1>Radioactive Buttons</h1>\n");
      out.write("\t\t<p class=\"lead\">Create awesome looking and engaging buttons by using CSS animations to give them all that radioactive feel.</p>\n");
      out.write("\t\t<p><small>Note: Demo works best in Safari 4.x and Chrome and, um, not so much in Firefox 3.5.</small></p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"large-4 columns\">\n");
      out.write("\t\t<script id=\"ZURBsmallAd\" data-orientation=\"\" src=\"http://www.zurb.com/ads/ZURBsmallAd.js?url=http%3A%2F%2Fwww.graphicstock.com%2Fx%2F446TB\"></script>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- /Header -->\n");
      out.write("\n");
      out.write("<!-- Wall of Buttons -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"large-12 columns wall-of-buttons\">\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a class=\"magenta button\">Hi ho, Silver!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"green button\">Look at me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t\t<a class=\"blue button\">Click me!</a>\n");
      out.write("\t\t<a class=\"red button\">I'm Glowing!</a>\n");
      out.write("\t\t<a class=\"orange button\">Call to Action</a>\n");
      out.write("\t\t<a class=\"orangellow button\">Got clicks?</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- /Wall of Buttons -->\n");
      out.write("\n");
      out.write("<!-- How-to -->\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"large-6 columns\">\n");
      out.write("\t\t<h2>This Is How We Do It</h2>\n");
      out.write("\n");
      out.write("\t\t<p>Using CSS animations in Safari, we're able to turn an otherwise ordinary button into a glowing, radioactive mess of awesome. Don't see the radioactive above? Be sure you're in Safari before getting underway.</p>\n");
      out.write("\n");
      out.write("\t\t<p>For each button, we specify three things:</p>\n");
      out.write("\n");
      out.write("\t\t<ol>\n");
      out.write("\t\t\t<li>Animation name (we'll show this later)</li>\n");
      out.write("\t\t\t<li>Animation duration</li>\n");
      out.write("\t\t\t<li>And the number of times it repeats (iteration count)</li>\n");
      out.write("\t\t</ol>\n");
      out.write("\n");
      out.write("\t\t<p>You can see how these come together on the right. The CSS calls a pre-defined animation you create, assigns it a duration, and tells it how long to repeat. Pretty sweet, right?</p>\n");
      out.write("\n");
      out.write("\t\t<p>To make it work, we first specify all our button styles (done in our global styles for ZURB.com) and then we added the shadows. Now, in the animation, we switch from a box-shadow that matches the background color to the color of the button to give it the glowing effect.</p>\n");
      out.write("\n");
      out.write("\t\t<p>And when we add in the animations, bam! Radioactive buttons.</p>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"large-6 columns\">\n");
      out.write("\t\t<h3>1. Create Your Animation</h3>\n");
      out.write("<div class='css'><div class=\"CodeRay\">\n");
      out.write("  <div class=\"code\"><pre>\n");
      out.write("<span class=\"directive\">@-webkit-keyframes</span> <span class=\"type\">greenPulse</span> {\n");
      out.write("  <span class=\"key\">from</span> { <span class=\"key\">background-color</span>: <span class=\"color\">#749a02</span>; <span class=\"key\">-webkit-box-shadow</span>: <span class=\"float\">0</span> <span class=\"float\">0</span> <span class=\"float\">9px</span> <span class=\"color\">#333</span>; }\n");
      out.write("  <span class=\"float\">50%</span> { <span class=\"key\">background-color</span>: <span class=\"color\">#91bd09</span>; <span class=\"key\">-webkit-box-shadow</span>: <span class=\"float\">0</span> <span class=\"float\">0</span> <span class=\"float\">18px</span> <span class=\"color\">#91bd09</span>; }\n");
      out.write("  <span class=\"key\">to</span> { <span class=\"key\">background-color</span>: <span class=\"color\">#749a02</span>; <span class=\"key\">-webkit-box-shadow</span>: <span class=\"float\">0</span> <span class=\"float\">0</span> <span class=\"float\">9px</span> <span class=\"color\">#333</span>; }\n");
      out.write("}</pre></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t<h3>2. And Then Cue It Up</h3>\n");
      out.write("<div class='css'><div class=\"CodeRay\">\n");
      out.write("  <div class=\"code\"><pre><span class=\"type\">a</span><span class=\"class\">.green</span><span class=\"class\">.button</span> {\n");
      out.write("  <span class=\"key\">-webkit-animation-name</span>: <span class=\"value\">greenPulse</span>;\n");
      out.write("  <span class=\"key\">-webkit-animation-duration</span>: <span class=\"float\">2s</span>;\n");
      out.write("  <span class=\"key\">-webkit-animation-iteration-count</span>: <span class=\"value\">infinite</span>;\n");
      out.write("}</pre></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- /How-to-->\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div class=\"large-12 columns\">\n");
      out.write("\t\t<p><small>Copyright ZURB, freely available for distribution under the MIT license.</small></p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <section class=\"project-related\">\n");
      out.write("  <div>\n");
      out.write("    <h2>Similar Playground experiments</h2>\n");
      out.write("\n");
      out.write("    <a href=\"/playground/sliding-vinyl\" class=\"project-related-item\">\n");
      out.write("      <div>\n");
      out.write("        <img alt=\"Vinyl\" src=\"/playground/uploads/project/thumb/30/vinyl.jpg\" />\n");
      out.write("        <h3>Sliding Vinyl with CSS3</h3>\n");
      out.write("      </div>\n");
      out.write("    </a>\n");
      out.write("    <a href=\"/playground/pizza-pie-charts\" class=\"project-related-item\">\n");
      out.write("      <div>\n");
      out.write("        <img alt=\"Thumb\" src=\"/playground/uploads/project/thumb/60/thumb.jpg\" />\n");
      out.write("        <h3>Pizza Pie Charts</h3>\n");
      out.write("      </div>\n");
      out.write("    </a>\n");
      out.write("    <a href=\"/playground/inline-form-labels\" class=\"project-related-item\">\n");
      out.write("      <div>\n");
      out.write("        <img alt=\"Inline form labels\" src=\"/playground/uploads/project/thumb/24/inline-form-labels.jpg\" />\n");
      out.write("        <h3>Inline Form Labels</h3>\n");
      out.write("      </div>\n");
      out.write("    </a>\n");
      out.write("    <a href=\"/playground/osx-dock\" class=\"project-related-item\">\n");
      out.write("      <div>\n");
      out.write("        <img alt=\"Osx dock\" src=\"/playground/uploads/project/thumb/28/osx-dock.jpg\" />\n");
      out.write("        <h3>Recreating the OS X Dock</h3>\n");
      out.write("      </div>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\" zurb-footer-top bg-blue\">\n");
      out.write("\n");
      out.write("    <!-- Mobile footer nav -->\n");
      out.write("    <ul class=\"mobile-footer-nav\">\n");
      out.write("      <li class=\"\"><a href=\"/playground/\">Home</a></li>\n");
      out.write("      <li class=\"\"><a href=\"/playground/about\">About</a></li>\n");
      out.write("      <li class=\"\"><a href=\"/playground/graduates\">Graduates</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- /Mobile footer nav -->\n");
      out.write("\n");
      out.write("    <!-- Property footer (top) -->\n");
      out.write("    <div class=\"row property\">\n");
      out.write("      <!-- Site info -->\n");
      out.write("      <div class=\"large-4 columns\">\n");
      out.write("        <div class=\"property-info\">\n");
      out.write("        <h3><a href=\"/playground/\">Playground</a></h3>\n");
      out.write("          <p>ZURB Playground is the home for creative product design tools and experiments by the design and engineering teams here at <a href=\"http://zurb.com\">ZURB</a>. We create tools, implementation examples, and other interesting projects that help people design for people.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- /Site info -->\n");
      out.write("\n");
      out.write("      <div class=\"large-8 columns\">\n");
      out.write("        <div class=\"row collapse\">\n");
      out.write("          <!-- University links -->\n");
      out.write("          <div class=\"large-4 columns\">\n");
      out.write("            <div class=\"learn-links\">\n");
      out.write("              <h4>Want more?</h4>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"http://zurb.com/university/foundation-intro\">Foundation Training</a></li>\n");
      out.write("                <li><a href=\"http://zurb.com/university/courses\">Courses</a></li>\n");
      out.write("                <li><a href=\"http://zurb.com/responsive\">Responsive</a></li>\n");
      out.write("                <li><a href=\"http://patterntap.com\">PatternTap</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- /University links -->\n");
      out.write("\n");
      out.write("          <!-- Contact -->\n");
      out.write("          <div class=\"large-4 columns\">\n");
      out.write("            <div class=\"support-links\">\n");
      out.write("              <h4 class=\"hide-for-small\">Talk to us</h4>\n");
      out.write("              <p>Got an interesting experiment to share? Email us at <a href=\"mailto:university@zurb.com\">university@zurb.com</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- /Contact -->\n");
      out.write("\n");
      out.write("          <!-- Newsletter -->\n");
      out.write("          <div class=\"large-4 columns\">\n");
      out.write("            <div class=\"connect-links\">\n");
      out.write("              <h4 class=\"hide-for-small\">Stay in touch</h4>\n");
      out.write("              <p>Get monthly updates from ZURB in your inbox. Read our <a href=\"http://zurb.com/news\">latest news &amp; buzz.</a></p>\n");
      out.write("              <a href=\"http://zurb.com/news\" class=\"small button\">Get ZURBnews!</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- /Newsletter -->\n");
      out.write("        </div> \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /Property footer -->\n");
      out.write("\n");
      out.write("    <!-- ZURB links -->\n");
      out.write("    <div class=\"row global\">\n");
      out.write("      <div class=\"large-3 small-6 columns\">\n");
      out.write("        <a href=\"http://zurb.com/studios\" class=\"footer-link-block services\">\n");
      out.write("          <span class=\"title\">Studios</span>\n");
      out.write("          <span>Helping more than 200 startups succeed since 1998.</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"large-3 small-6 columns\">\n");
      out.write("        <a href=\"http://foundation.zurb.com/\" class=\"footer-link-block foundation\">\n");
      out.write("          <span class=\"title\">Foundation</span>\n");
      out.write("          <span>The most advanced front-end framework in the world.</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"large-3 small-6 columns\">\n");
      out.write("        <a href=\"http://zurb.com/apps\" class=\"footer-link-block apps\">\n");
      out.write("          <span class=\"title\">Products</span>\n");
      out.write("          <span>Prototype, iterate and collect feedback on your products.</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"large-3 small-6 columns\">\n");
      out.write("        <a href=\"http://zurb.com/university\" class=\"footer-link-block expo\">\n");
      out.write("          <span class=\"title\">University</span>\n");
      out.write("          <span>Ideas, thoughts and design resources shared with you.</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /ZURB links -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- ZURB footer -->\n");
      out.write("  <div class=\"zurb-footer-bottom\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"large-4 push-8 columns\">\n");
      out.write("        <ul class=\"home-social\">\n");
      out.write("            <li><a href=\"http://www.twitter.com/ZURB\" class=\"twitter\"></a></li>\n");
      out.write("            <li><a href=\"http://www.facebook.com/ZURB\" class=\"facebook\"></a></li>\n");
      out.write("            <li><a href=\"/contact\" class=\"mail\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"large-8 pull-4 columns\">\n");
      out.write("          <a href=\"http://www.zurb.com\" class=\"zurb-logo regular\"></a>\n");
      out.write("          <ul class=\"zurb-links\">\n");
      out.write("            <li><a href=\"http://zurb.com/about\">About</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/blog\">Blog</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/news\">News<span class=\"show-for-medium-up\"> &amp; Events</span></a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/contact\">Contact</a></li>\n");
      out.write("            <li><a href=\"http://zurb.com/sitemap\">Sitemap</a></li>\n");
      out.write("         </ul>\n");
      out.write("         <p class=\"copyright\">© 1998?2013 ZURB, Inc. All rights reserved.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- /ZURB footer -->\n");
      out.write("  <div id=\"myModal\" class=\"reveal-modal\">\n");
      out.write("    <h1>Reveal Modal Goodness</h1>\n");
      out.write("    <p class=\"lead\">This is a default modal in all its glory, but any of the styles here can easily be changed in the CSS.</p>\n");
      out.write("    <p>This is just a simple modal with the default styles, but any type of content can live in here. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis sem vel enim eleifend tristique. Etiam tincidunt faucibus pharetra. </p>\n");
      out.write("    <a class=\"close-reveal-modal\">×</a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"reveal-modal-bg\"></div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Mobile nav sidebar -->\n");
      out.write("  <section id=\"sidebar\" role=\"complementary\">\n");
      out.write("\n");
      out.write("    <!-- This is the apps main navigation -->         \n");
      out.write("    <div class=\"main-menu\">\n");
      out.write("      <h6>Playground</h6>\n");
      out.write("      <nav id=\"sideMenu\" role=\"navigation\">\n");
      out.write("        <ul id=\"sideMainNav\" class=\"nav-bar\">\n");
      out.write("          <li><a href=\"/playground/\" title=\"Playground Home\">Home</a></li>\n");
      out.write("          <li><a href=\"/playground/about\" title=\"About Playground\">About</a></li>\n");
      out.write("          <li><a href=\"/playground/graduates\" title=\"Playground Graduates\">Graduates</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <!-- These links will vary depending on what app it is -->  \n");
      out.write("    <div class=\"more-goodness\">   \n");
      out.write("      <h6>More ZURB Goodness</h6>\n");
      out.write("      <nav role=\"navigation\">\n");
      out.write("        <ul id=\"sideMainNav\" class=\"nav-bar goodness\">\n");
      out.write("          <li><a href=\"http://zurb.com/university/foundation-intro\">Foundation Training</a></li>\n");
      out.write("          <li><a href=\"http://zurb.com/university/courses\">Product Design Courses</a></li>\n");
      out.write("          <li><a href=\"http://zurb.com/apps\">ZURB Apps</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <!-- These links will be the same across all of our proprties & apps -->\n");
      out.write("    <div class=\"zurb-links\">    \n");
      out.write("      <ul class=\"top\">\n");
      out.write("        <li class=\"logo\"><a href=\"http://zurb.com\"><img alt=\"Zurb logo dark\" src=\"/playground/assets/zurb-logo-dark-9a0c70362753b6f66fff589e0694be5e.png\" /></a></li>\n");
      out.write("        <li><a href=\"http://zurb.com/about\">About</a></li>\n");
      out.write("        <li><a href=\"http://zurb.com/blog\">Blog</a></li>\n");
      out.write("        <li><a href=\"http://zurb.com/contact\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"pillars\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://www.zurb.com/studios\" class=\"footer-link-block services\">\n");
      out.write("            <span class=\"title\">Studios</span>\n");
      out.write("            <span>Helping startups win since '98.</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://foundation.zurb.com/\" class=\"footer-link-block foundation\">\n");
      out.write("            <span class=\"title\">Foundation</span>\n");
      out.write("            <span>World's most advanced responsive framework.</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://zurb.com/apps\" class=\"footer-link-block apps\">\n");
      out.write("            <span class=\"title\">ZURB Apps</span>\n");
      out.write("            <span>Tools to rapidly prototype and iterate.</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://zurb.com/university\" class=\"footer-link-block expo\">\n");
      out.write("            <span class=\"title\">University</span>\n");
      out.write("            <span>Online training for smarter product design.</span>\n");
      out.write("          </a>\n");
      out.write("        </li> \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- /Mobile nav -->\n");
      out.write("  <script src=\"/playground/assets/application-33285803af8fb0638f18b56d23239b09.js\"></script>\n");
      out.write("  <script src=\"/playground/assets/jquery.offcanvas-c6deb341926c97e94c30e9e268a52ea1.js\"></script>\n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
