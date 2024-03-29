<%-- 
    Document   : testing_jquery4u
    Created on : 27-Nov-2013, 10:57:45 AM
    Author     : MAfzal
--%>

<!-- Copyright 2011 jQuery4u.com -->
<!DOCTYPE html>
<html>
<title>jQuery Function Demo - jQuery4u.com</title>
<head>
    <script src="http://www.jquery4u.com/function-demos/js/jquery-1.6.4.min.js"></script>
    <script src="http://www.jquery4u.com/scripts/function-demos-script.js"></script>
    <script src="http://www.jquery4u.com/scripts/jquery.sparkline.min.js"></script>
 
    <script type="text/javascript">
 
    var JQFUNCS =
    {
        runFunc:
        {
            /* ------------------------------ slice Demo ------------------------------ */
            "slice":
            {
                run: function(id)
                {
                    var trs = $('#'+id+' table tr'), selectedRow = 0;
                    $('#'+id+' button').live('click', function(e)
                    {
                        e.preventDefault();
                        trs.css("background", "");
                        selectedRow = (selectedRow == 5) ? 1 : selectedRow += 1;
                        trs.slice(selectedRow, selectedRow+1).css("background", "orange");
                        var slices = trs.slice(selectedRow, selectedRow+1).text().trim().replace(/\s/g, "");
                        $('#sparklinesExample').html(slices[0]+','+slices[1]+','+slices[2]);
                        $('#sparklinesExample').sparkline('html', { type: 'pie', height: '9.0em' });
                    });
                },
 
                reset: function(id)
                {
                    $('#'+id).hide();
                }
            }
        }
    }
 
    </script>
 
    <style type="text/css" media="screen">
        .demoarea {
 
        }
    </style>
 
</head>
<body>
 
<h3>Demo: Using .slice() to perform actions on a subset of elements.</h3>
<p><a href="#" id="slice-demobtn" class="demobtn btn actionr">Run Demo</a> <a href="#" id="slice-codebtn" class="codebtn btn actionr">View Code</a> <a href="#" id="slice-resetbtn" class="resetbtn btn actionr" style="display: none;">Reset</a></p>
<div class="demoarea" id="slice" style="border:1px solid orange; padding:25px;height: 280px;width: 550px;">
    <div style="width:300px;float:left;">
<table border="1">
<tr>
<th>Slice 1</th>
<th>Slice 2</th>
<th>Slice 3</th>
</tr>
<tr><td>1</td><td>1</td><td>1</td></tr>
<tr><td>1</td><td>2</td><td>3</td></tr>
<tr><td>1</td><td>4</td><td>2</td></tr>
<tr><td>7</td><td>3</td><td>0</td></tr>
<tr><td>3</td><td>6</td><td>1</td></tr>
</table>
<button class="btn">Slice Me!</button>
    </div>
    <div style="width:150px; display:inline-block; height: 160px;font-size:16px;color:blue;margin: 50px;">
        <span id="sparklinesExample"></span>
    </div>
</div>
 
</body>
</html>