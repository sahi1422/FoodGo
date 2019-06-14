function validates(){
	var password=document.myform.password.value;

	if(password.length<8) {
		alert("Password must be at least 8 character long!");
		return false;
	}
	//else return true;
}