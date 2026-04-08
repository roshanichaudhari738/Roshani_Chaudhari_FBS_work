<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>

<style>
body{
    margin:0;
    padding:0;
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg,#ff9966,#ff5e62);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:40px;
    width:350px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
    text-align:center;
}

h2{
    margin-bottom:20px;
    color:#333;
}

input,select{
    width:100%;
    padding:12px;
    margin:10px 0;
    border-radius:8px;
    border:1px solid #ccc;
    outline:none;
    transition:0.3s;
}

input:focus{
    border-color:#ff5e62;
    box-shadow:0 0 5px #ff5e62;
}

button{
    width:100%;
    padding:12px;
    background:#ff9966;
    border:none;
    border-radius:8px;
    color:white;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

button:hover{
    background:#ff5e62;
}

.link{
    margin-top:15px;
    font-size:14px;
}

.link a{
    text-decoration:none;
    color:#ff5e62;
}
</style>
<%-- <script type="text/javascript" src="signIn.js"></script>--%>
</head>
<body>

<div class="container">
    <h2>Sign In</h2>
    <form action="log" method="post">
    <input type="hidden" id="id" name="id">
       UserName <input type="text" id="un" name="userName" placeholder="Username" onblur="validateun()">
        <span id="unameerror" class="error"></span>
        <br><br>
       Password <input type="password" id="pass" name="password" placeholder="Password" onblur="validatpass()">
        <span id="passerror" class="error"></span>
        <button type="submit">Submit</button>
    </form>

    <div class="link">
        Don't have an account? <a href="Signup.jsp">Sign Up</a>
    </div>
</div>

</body>
</html>