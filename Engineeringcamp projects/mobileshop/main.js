var btnGoAhead = document.getElementById("check");
btnGoAhead.addEventListener('click', function () {
    if (document.getElementById("apple").checked == true) {
        mx4.style.display = "none";
        me4.style.display = "none";
        lk9.style.display = "none";
        gs6.style.display = "none";
        lpp.style.display = "none";
        sz3.style.display = "none";
        n.style.display = "none";
        mg2.style.display = "none"; 
        mz2.style.display = "none";                     
    }
});
btnGoAhead.addEventListener('click', function () {
    if (document.getElementById("nokia").checked == true) {
         ip4.style.display = "none";
          ip5.style.display = "none";
        mx4.style.display = "none";
        me4.style.display = "none";
        lk9.style.display = "none";
        gs6.style.display = "none";
        lpp.style.display = "none";
        sz3.style.display = "none";
        mg2.style.display = "none"; 
        mz2.style.display = "none";                     
    }
});
btnGoAhead.addEventListener('click', function () {
    if (document.getElementById("samsung").checked == true) {
         ip4.style.display = "none";
          ip5.style.display = "none";
        mx4.style.display = "none";
        me4.style.display = "none";
        lk9.style.display = "none";
        gs6.style.display = "block";
        lpp.style.display = "none";
        sz3.style.display = "block";
        mg2.style.display = "none"; 
        mz2.style.display = "none"; 
        n.style.display = "none";                    
    }
});
btnGoAhead.addEventListener('click', function () {
    if (document.getElementById("lenovo").checked == true) {
         ip4.style.display = "none";
          ip5.style.display = "none";
        mx4.style.display = "none";
        me4.style.display = "none";
        lk9.style.display = "block";
        gs6.style.display = "none";
        lpp.style.display = "block";
        sz3.style.display = "none";
        mg2.style.display = "none"; 
        mz2.style.display = "none"; 
        n.style.display = "none";                    
    }
});
btnGoAhead.addEventListener('click', function () {
    if (document.getElementById("motorola").checked == true) {
         ip4.style.display = "none";
          ip5.style.display = "none";
        mx4.style.display = "block";
        me4.style.display = "block";
        lk9.style.display = "none";
        gs6.style.display = "none";
        lpp.style.display = "none";
        sz3.style.display = "none";
        mg2.style.display = "block"; 
        mz2.style.display = "block"; 
        n.style.display = "none";                    
    }
});
 var btnuncheckall = document.getElementById("uncheck");
 btnuncheckall.addEventListener('click', function () {
      if (btnuncheckall ) {
          window.location.assign("mobileshop.html")
      }
 })