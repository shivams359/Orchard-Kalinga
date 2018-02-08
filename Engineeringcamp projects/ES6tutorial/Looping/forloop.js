
var myarray = [2,4,6,8,10];

console.log("for loop executing");

for(var index=0; index<myarray.length; index++)
{
    if(index==2)
    {
    console.log(myarray[index]);
    break;
    }
}


// for in loop
for( i in myarray)
{
    console.log(i);
}

//for of loop
for( index of myarray)
{
    console.log(index);
}

console.log("for loop executed");