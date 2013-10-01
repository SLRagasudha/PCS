
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to PCS</title>
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<!-- start header -->
<div id="header">
	<div id="logo">
		<h1><span>Predictable</span>ConvergentSolutions</h1>
	</div>
	<div id="menu">
		<ul>
			<li><a href="index.html">Home</a></li>
			<li><a href="#">About us</a></li>
			<li><a href="Login.html">Login</a></li>
			<li><a href="#">Contact us</a></li>
		</ul>
	</div>
	
</div>
<!-- end header -->
<div id="wrapper">
	<!-- start page -->
	<div id="page">
		
            <!--- Validations--->
            
<script  language='javascript'>
function CheckAndSubmit()
 {
 //for firstname
if(form.name.value=="" || form.name.value.length<6)
    {
        alert("Please enter Firstname, length should greater than 6");
		form.name.focus();
		return false;
	}
	var regexLetter = /^[a-zA-Z]+$/;
     if(!regexLetter.test(form.name.value)){
         alert('Enter a valid first name');
         form.name.focus();
         return false;
}
//for lastname
if(form.last.value=="" || form.last.value.length<6)
    {
        alert("Please enter Lastname, length should greater than 6");
		form.last.focus();
		return false;
	}
	var regex= /^[a-zA-Z]+$/;
     if(!regex.test(form.last.value)){
         alert('Enter a valid Last name');
         form.last.focus();
         return false;
}
// for gender
if ( ( form.Male.checked == false )&&( form.Female.checked == false ) ) 
{
alert ( "Enter a valid character ‘m’ or ‘M’ or ‘f’ or ‘F’" ); 
return false;
}
	//for emailid
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(form.email.value)) {
       alert("Enter Valid  Email-id");
	   form.id.focus();
      return false;
     }
//for password
if(form.password.value=="" || form.password.value.length<6)
	{
		alert("Please enter password, length should greater than 6");
		form.password.focus();
		return false;
	}
	 var reg2 = /^[a-zA-Z0-9]+$/;
	if(!reg2.test(form.password.value))
	{
		alert("password must contain letters,numbers!");
		form.password.focus();
		return false;
	}
//for retype password
var t=form.password.value;
if(t!=form.repassword.value)
{
 alert("password worng.RetypePassword");
 form.repassword.focus();
 return false;
 }
//for secretquestion
 if(form.question.value=="")
    {
        alert(" Please Enter Your question");
		form.question.focus();
		return false;
	}
//for answer
  if(form.answer.value==""){
        error = "Enter answer for secret question";
    } 
}
</script>
		<!-- start content -->
    <div id="content">
            <div class="padding1">
    <form name="form" method="get" action="./Registration">
  <table>
  <tbody>
  <tr>
  <td><label for="name">First Name : </label> </td>
  <td><input id="name" maxlength="45" name="name" type="text" /> <br><br> </td>
  </tr>
  <tr>
  <td><label for="last">Last Name :</label> </td>
  <td><input id="last" maxlength="45" name="last" type="text" /> <br><br></td>
  </tr>
  <tr>
  <td><label for="gender">Gender :</label></td>
  <td><INPUT TYPE=radio NAME="gender" value="Female" > <font><B>Female</B>&nbsp;&nbsp;<INPUT TYPE=radio NAME="gender" value="Male" ><font> <B>Male</B><br><br></td>
  </tr>
  <tr>
  <td><label for="email">Email Id :</label></td>
  <td><input id="email" maxlength="45" name="email" type="text" /><br><br></td>
  </tr>
  <tr>
  <td><label for="password">Password :</label></td>
  <td><input id="password" maxlength="45" name="password" type="password" /><br><br></td>
  </tr>
  <tr>
  <td><label for="repassword">Retype Password :</label><br><br></td>
  <td><input id="repassword" maxlength="45" name="repassword" type="password" /><br><br></td>
  </tr>
  <tr>
  <td><label for="question">Secret Question : </label></td>
  <td><input id="question" maxlength="100" name="question" type="text" /><br><br></td>
  </tr>
  <tr>
  <td><label for="answer">Answer : </label></td>
  <td><input id="answer" maxlength="100" name="answer" type="text" /><br><br></td>
  </tr>
  <tr>
  <tr>
<td><input type="image" src="images/submitbutton.png" alt="submit button"></td>
<td><input type="image" src="images/resetimage.png" alt="reset button"></td>
</tr>&nbsp;<br><br></td>
  </tr>
  </tbody></table>
  </form>
            </div>
    </div>
		<!-- end content -->
		
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end page -->
</div>
<div id="footer">
	<p class="copyright">&copy;&nbsp;&nbsp;2013 All Rights Reserved &nbsp;&bull;&nbsp; Design by MSIT JNTU</p>
</div>
<div align=center></div></body>
</html>
