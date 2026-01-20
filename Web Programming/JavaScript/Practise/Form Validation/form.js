function submitform()
{

    if(validate() && validPass() && validateemail() && validmobileno() && validateGender() && validsub())
    {
        document.getElementById("regform").submit();
    alert("Form Submitted Successfully")
    }
        
}

function validateGender()
{
    res=document.getElementsByName("gender") //return the list
    console.log(res);
    
    flag=false
    for(i=0;i<res.length;i++)
    {
        if(res[i].checked)
        {
            return flag= true
           // break
        }
    }
    return false
}

function validate()
{
    username=document.getElementById("username").value
    if(username.trim().length==0)
    {
        // alert("Please enter the username")
        document.getElementById("unameerror").innerHTML="Please enter the username"
        return false
    }
    else{
        document.getElementById("unameerror").innerHTML=""
        return true
    }
}

function upperCaseExist(password)
{
    for(i=0;i<password.length;i++)
    {
            if(password.charAt(i)>='A' && password.charAt(i)<='Z')
                return true
    }
    return false
}

function digitExist(password)
{
    for(i=0;i<password.length;i++)
    {
            if(password.charAt(i)>=0 && password.charAt(i)<=9)
                return true
    }
    return false
}

function symbolExist(password)
{
    for(i=0;i<password.length;i++)
    {
            if(password.charAt(i)>=0 && password.charAt(i)<=9)
                return true
    }
    return false
}

function validPass()
{
    password=document.getElementById("pass").value
    if(password.trim().length==0)
    {
        // alert("Please enter the username")
        document.getElementById("passerror").innerHTML="Please enter the Password" //this line are show the error 
        return false
    }
    else if(password.length<=8)
    {
        // alert("Please enter the username")
        document.getElementById("passerror").innerHTML="Please enter the at least 15 character"
        return false
    }
    else if(!upperCaseExist(password))
    {
        document.getElementById("passerror").innerHTML="Please enter one uppercase character"
        return false
    }
    else if(!digitExist(password))
    {
        document.getElementById("passerror").innerHTML="Please enter digit in password"
        return false
    }
    else if(!symbolExist(password))
    {
        document.getElementById("passerror").innerHTML="Please enter symbol in password"
        return false
    }
    else{
        document.getElementById("passerror").innerHTML=""
        return true
    }
    
}

function existSymbol()
{
   return email.includes("@gmail.com")
}

function validateemail()
{
    email=document.getElementById("email").value
    if(email.trim().length==0)
    {
        // alert("Please enter the username")
        document.getElementById("emailerror").innerHTML="Please enter the Email" //this line are show the error 
        return false
    }
    else if(!existSymbol())
    {
        document.getElementById("emailerror").innerHTML="Please enter the valid Email"
        return false
    }
    else{
        document.getElementById("emailerror").innerHTML=""
        return true
    }
}

function verifymobno(mobno)
{
    if(mobno.length==10)
    {
        return true
    }
    return false
}

function validmobileno()
{
     mobno=document.getElementById("mobno").value
    if(mobno.trim().length==0)
    {
        // alert("Please enter the username")
        document.getElementById("mobnoerror").innerHTML="Please enter the Mobile number" //this line are show the error 
        return false
    }
    else if(!verifymobno(mobno))
    {
        document.getElementById("mobnoerror").innerHTML="Please enter the 10 digit mobile number"
        return false
    }
    else{
        document.getElementById("mobnoerror").innerHTML=""
        return true
    }
}

function validsub()
{
    res=document.getElementsByClassName("subject")
    count=0;
    for(i=0;i<res.length;i++)
    {
        
        if(res[i].checked)
        {
            count++;
            console.log(count);
        }    
    }

    if(count==3)
    {
        document.getElementById("checkerror").innerHTML="Please select at least 3 subject"
        return false
    }
    else{
        document.getElementById("checkerror").innerHTML=""
        return true
    }
}