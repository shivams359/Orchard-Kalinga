function calc()
{
	var n1 = parseInt(document.getElementById('firstnumber').value);
	var n2 = parseInt(document.getElementById('secondnumber').value);
	var e = parseInt(document.getElementById('Browsers').value);
	var result= document.getElementById("lblResult");
	if(e == 1){
		lblresult=n1+n2;
		console.log(lblresult);
	}
	else if(e == 2)
	{
		lblresult=n1-n2;
		console.log(lblresult);
	}
	else if(e==3)
	{
		lblresult=n1*n2;
		console.log(lblresult);
	}
	else
	{
		lblresult=n1/n2;
		console.log(lblresult);
	}
	result.innerHTML = lblresult;
}