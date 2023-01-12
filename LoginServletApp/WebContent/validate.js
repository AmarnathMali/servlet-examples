function myfun(){
	var uname = document.loginform.username.value;
	var pwd = document.loginform.password.value;
	
	if(uname==("")){
		alert("please enter username");
		return false;
	}
	if(pwd==("")){
		alert("please enter password");
		return false;
	}
    return true;
}