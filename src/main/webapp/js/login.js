function login(){
	var username = $("#username").val();
	var password = $("#password").val();
	if($.trim(username).length === 0){
		$("#message_box").html("请输入用户名");
		$("#message_box").show();
		return;
	}
	if($.trim(password).length === 0){
		$("#message_box").html("请输入密码");
		$("#message_box").show();
		return;
	}
	Fruit.RestClient.post({url:'j_spring_security_check', params:{j_username: username, j_password: password}}, 
			function(){console.log("log in")});
}