str=""
calcisymbol="+-/*"
inp=document.getElementById("inp")

function submitValue(value)
{
    
    inputstring=inp.value
    len=inputstring.length
    if(calcisymbol.includes(inputstring.charAt(len-1))&&calcisymbol.includes(value))
    {
        console.log("in if inp str "+inputstring);
        console.log("in if"+inputstring.charAt(len-1));
        console.log("in if str "+str);
        
        
        alert("Invalid")
    }
    else{
            str=str+value
    // console.log("str is ",str); string concat
    
    inp.value=str //updated string is display in input box
    console.log(str);
    }
    
    
}

function evaluate1()
{
    if(calcisymbol.includes(inp.value.charAt(inp.value.length-1)))
    {
        console.log("Invalid");
        
    }
    else{
            res=eval(str)
        str=res
        document.getElementById("inp").value=str
    }
    
}

function clearScreen()
{
    str=""
    inp.value=str
}

function clear1()
{
//    alert("clear called");
    str = str.slice(0, -1);
    console.log("after slice:", str);

    inp.value=str
}