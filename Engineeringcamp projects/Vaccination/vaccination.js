var button = document.getElementById("save");
button.addEventListener('click', function () {
    var x = document.getElementById("fullname");
    if (x.value == "") {
        alert("please enter your name")
        return false;
    }
    var y = document.getElementById("bday");
    if (y.value == "") {
        alert("please enter your DOB")
        return false;
    }
    if (y.value != "" && x.value!= ""){
        alert("Child's detail have been saved successfully");
        window.location.assign("vaccination.html");
    }
})
