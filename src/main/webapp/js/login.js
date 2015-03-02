function login(){
	var username = $('#username').val();
	var password = $('#password').val();
	if($.trim(username).length === 0){
		$('#message_box').html('请输入用户名');
		$('#message_box').show();
		return;
	}
	if($.trim(password).length === 0){
		$('#message_box').html('请输入密码');
		$('#message_box').show();
		return;
	}
	Fruit.RestClient.post({url:'j_spring_security_check', params:{j_username: username, j_password: password}}, 
		function(){

		},function(){

            if(arguments[0].status === 401){
                /** login failed **/
                $('#message_box').html('用户名密码错误');
                $('#message_box').show();
                return;
            } else if (arguments[0].status === 200){
                /** login success **/
                window.location.replace('main.jsp');
            }
        });
}