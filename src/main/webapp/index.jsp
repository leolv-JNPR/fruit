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
  	<div class="login-panel panel panel-default">
	  <div class="panel-heading">
	    <h3 class="panel-title">登录</h3>
	  </div>
	  <div class="panel-body">
	  	<div class="container-fluid">
	  		<div class="row">
	  			<div class="col-md-12">
	  				<div class="alert alert-danger message-box" role="alert" id="message_box">...</div>
	  			</div>
	  		</div>
	  		<div class="row">
	  			<div class="col-md-4 text-right">用户名</div>
				<div class="col-md-8"><input type="text" name="username" id="username" class="k-textbox"></div>
	  		</div>
	  		<div class="row">
	  			<div class="col-md-4 text-right">密码</div>
				<div class="col-md-8"><input type="password" name="password" id="password" class="k-textbox"></div>
	  		</div>
	  		<div class="row">
	  			<div class="col-md-12 text-center"><button id="button">登 录</button></div>
	  		</div>
	  	</div>
	  </div>
	</div>
  	<script type="text/javascript" src="ui-libs/jquery/jquery.min.js"></script>
  	<script type="text/javascript" src="ui-libs/kendoui/js/kendo.all.min.js"></script>
  	<script type="text/javascript" src="js/utils.js"></script>
  	<script type="text/javascript" src="js/login.js"></script>
  	<script>
  		$(function(){
  			$("#button").kendoButton({
  				click: login
  			});
  		});
  	</script>
  </body>
</html>