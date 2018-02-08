<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style>
  .top{
  padding-top: 100px;}
  .header{
  background-color: white;
  padding: 15px;
   }
   
  </style>
  
</head>
<body>
<title>usersignup</title>
<script>
function validate(){
    var phoneno =  /^[7 8 9][0-9]{9}$/;  
    if(!(document.f.phone.value.match(phoneno)))  
    {   
       alert("Not a valid Phone Number"); 
       document.f.phone.value.match="";
       return false;  
    }  
    if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(document.f.email.value)))  
    {    
      alert("You have entered an invalid email address!")  ;
      document.f.email.value="";
      return (false) ;
    }   
    
if(document.f.password.value!=document.f.confirmpassword.value){
alert("New Password and Confirm Password should be same! Re-enter confirm-password!");
document.f.confirm.value="";
return false;
}

return true;
}
</script>
</head>
<body>
<div class="container">
  <center>
  <div class ="top">
  <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">SignUp</button>
  </div>
  </center>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
     <center>
 <div class = "formsign">
<form name = "f" action="add" onsubmit="return validate()">
<legend>Signup Form</legend>
 <div class="header">
<select name="role">
      <option value="">Select your Role/Roles</option>
      <option selected>Admin</option>
      <option>Investors</option>
      <option >Advisors</option>
    </select><br><br>
    <form>
 <input type="text" name="name" placeholder="name" required><br><br>
 <input type="text" name="phone" placeholder="phone"><br><br>
 <input type="email" name="email" placeholder="email"><br><br>
<input type="password" name="password" placeholder="password"><br><br>
<input type="password" name="confirmpassword" placeholder="confirmpassword"><br><br>
</form>
   <input type="submit" class="btn btn-success btn-lg" value="signup" > 
   </div> 
  
    </div>
 </form>
  </center>
</div>
</body>
</html>