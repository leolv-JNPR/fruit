<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>期果管理</title>
    
    <!-- Bootstrap -->
    <link href="ui-libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="ui-libs/kendoui/styles/kendo.common.min.css" rel="stylesheet">
    <link href="ui-libs/kendoui/styles/kendo.blueopal.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
  </head>
  <body>

            <div id="top" class="top-banner">
                <label class="logo">期果管理系统</label>
            </div>
            <div id="root">
                <div class="left-nav" id="nav_tree"></div>
                <div class="main-content" id="main"></div>
            </div>
  	<script type="text/javascript" src="ui-libs/jquery/jquery.min.js"></script>
  	<script type="text/javascript" src="ui-libs/kendoui/js/kendo.all.min.js"></script>
  	<script type="text/javascript" src="js/utils.js"></script>
  	<script type="text/javascript" src="js/main.js"></script>
  	<script type="text/javascript" src="js/task.js"></script>
  	<script>
  		$(function(){

            $('#root').height($(document).height() - $('#top').height());

            var splitter = $("#root").kendoSplitter({
                orientation: "horizontal",
                panes: [
                    { collapsible: true, size: "220px" },
                    { collapsible: false }
                ]
            }).data("kendoSplitter");

            initNavTree();


  		});
  	</script>
  </body>
</html>