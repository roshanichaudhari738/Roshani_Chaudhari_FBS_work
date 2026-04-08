<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>

<style>
body{
    margin:0;
    padding:0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg,#667eea,#764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:35px;
    width:380px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

.form-group{
    margin-bottom:18px;
}

label{
    display:block;
    font-weight:600;
    margin-bottom:6px;
    color:#444;
}

input, select{
    width:100%;
    padding:10px;
    border-radius:8px;
    border:1px solid #ccc;
    outline:none;
    transition:0.3s;
    font-size:14px;
}

input:focus, select:focus{
    border-color:#764ba2;
    box-shadow:0 0 5px #764ba2;
}

.error{
    color:red;
    font-size:12px;
    margin-top:4px;
    display:block;
}

button{
    width:100%;
    padding:12px;
    background:#667eea;
    border:none;
    border-radius:8px;
    color:white;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
    margin-top:10px;
}

button:hover{
    background:#764ba2;
}

.link{
    text-align:center;
    margin-top:15px;
    font-size:14px;
}

.link a{
    text-decoration:none;
    color:#667eea;
    font-weight:600;
}
</style>

<%-- <script type="text/javascript" src="Js/signUp.js"></script>--%>

</head>
<body>

<div class="container">
    <h2>Sign Up</h2>

    <form  id="regform" method="post" action="signUp">

        <div class="form-group">
            <label>Name</label>
            <input type="text" id="un" name="userName" placeholder="Enter User Name" onblur="validateun()">
            <span id="unameerror" class="error"></span>
        </div>
        
        <div class="form-group">
            <label>Email</label>
            <input type="text" id="ue" name="userEmail" placeholder="Enter User Email" onblur="validateuemail()">
            <span id="uemailerror" class="error"></span>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" id="pass" name="password" placeholder="Enter Password" onblur="validatpass()">
            <span id="passerror" class="error"></span>
        </div>

        <button type="submit">Submit</button>
    </form>

    <div class="link">
        Already have an account? <a href="Signin.jsp">Sign In</a>
    </div>
</div>

</body>
</html>