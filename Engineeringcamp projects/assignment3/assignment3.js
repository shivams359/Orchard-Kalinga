validateForm=()=>
 {
    var x = document.forms["myForm"]["firstname"].value;
    if (x == "") {
        alert("First Name must be filled out");
        return false;
    }
    x = document.forms["myForm"]["lastname"].value;
    if (x == "") {
        alert(" Last Nname must be filled out");
        return false;
    }
     x = document.forms["myForm"]["Address"].value;
    if (x == "") {
        alert("Address must be filled out");
        return false;
    }
     x = document.forms["myForm"]["City"].value;
    if (x == "") {
        alert("City must be filled out");
        return false;
    }
    x = document.forms["myForm"]["State"].value;
    if (x == "") {
        alert("State Name must be filled out");
        return false;
    }
    x = document.forms["myForm"]["Postal Code"].value;
    if (x == "") {
        alert("Postal Code must be filled out");
         return false;
    }
            if(x.length!=6){
            alert("Postal Code must be of 6 digits");
             return false;
        }
    x = document.forms["myForm"]["Country"].value;
    if (x == "") {
        alert("Country must be filled out");
        return false;
    }
    x = document.forms["myForm"]["Phone"].value;
    if (x == "") {
        alert("Phone must be filled out");
        return false;
    }
    x = document.forms["myForm"]["Fax"].value;
    if (x == "") {
        alert("Fax must be filled out");
        return false;
    }
    x = document.forms["myForm"]["Email"].value;
    if (x == "") {
        alert("Email must be filled out");
        return false;
    }
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
    
}