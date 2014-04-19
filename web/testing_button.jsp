<%-- 
    Document   : testing_button
    Created on : 2-Dec-2013, 11:31:05 AM
    Author     : MAfzal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        
        <style>
.selectBtn{height:60px;width:80px;
  background-color:yellow;}
#abc{background-color:gray;height:100%;width:60%;}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id='abc'></div>
        
        
        <script>
content = document.getElementById('abc');

function dx(){
  var Btn = document.createElement('button');
  Btn.type = 'button';
  Btn.className = 'selectBtn';
  Btn.innerHTML = 'Submit';
  Btn.onclick = function() {
    this.innerHTML='Done';
    sessionStorage.done = true;
  }
  if (sessionStorage.done) {
    Btn.innerHTML = 'Done';
  }
  content.appendChild(Btn);   
}

dx();
</script>
<script>
    $("#tabs").tabs({
    create: function(event, ui){
        $(this).tabs({'select': $(this).find("ul").index($(this).find('a[href="' + window.location.hash + '"]').parent())});
    },
    activate: function(event, ui){
        window.location.hash = $(ui.newTab[0]).find('a[href^="#Tab"]').attr("href");
    }
});
</script>
<a href="javascript:location.reload();">Reload page</a>
<div id="tabs">
<ul id="ulid" class="tabs">
    <li> 
        <a href="#Tab1" id="newsdtls" class="dtls">Text 1</a>
    </li>
    <li>    
        <a href="#Tab2" id="anndtls" class="dtls">Text 2</a>
    </li>
    <li>    
        <a href="#Tab3" class="dtls">Text 3</a>
    </li>
    <li>    
        <a href="#Tab4" id="imgsdtls" class="dtls">Text 4</a>
    </li>
    <li>    
        <a href="#Tab5" id="movieMakingdtls" class="dtls">Text 5</a>
    </li>
    <li>    
        <a href="#Tab6" id="tradeInfodtls" class="dtls">Text 6</a>
    </li>
</ul>
<div id="Tab1">Content 1</div>
<div id="Tab2">Content 2</div>
<div id="Tab3">Content 3</div>
<div id="Tab4">Content 4</div>
<div id="Tab5">Content 5</div>
<div id="Tab6">Content 6</div>
</div>  



<ul id="ulid" class="">
        <li class="">
            <a href="#tab=one" id="one" class="active">text1</a>
        </li>
        <li>
            <a href="#tab=two" id="two" class="">text2</a>
        </li>
        <li>
            <a href="#tab=three" id="three" class="">text3</a>
        </li>
        <li>
            <a href="#tab=four" id="four" class="">text4</a>
        </li>
        <li>
            <a href="#tab=five" id="five" class="">text5</a>
        </li>
        <li>
            <a href="#tab=six" id="six"  class="">text6</a>
        </li>
    </ul>

<script>
function parseHashBangArgs(aURL) {

aURL = aURL || window.location.href;

var vars = {};
var hashes = aURL.slice(aURL.indexOf('#') + 1).split('&');

for(var i = 0; i < hashes.length; i++) {
   var hash = hashes[i].split('=');

   if(hash.length > 1) {
       vars[hash[0]] = hash[1];
   } else {
      vars[hash[0]] = null;
   }      
}

return vars;
}
</script>

<script>
    $('ul#ulid li a').click(function(){
    $('li a').removeClass('active');
    $(this).addClass('active');
});

var selectedTab = parseHashBangArgs(window.location.href).tab;
if(selectedTab){
    $('li a').removeClass('active');
    $('#'+selectedTab).addClass('active');
}
    </script>
    </body>
</html>
