var id=1;
var name="iphone";
var price=900.00;

document.write("<center ><font size= 5px; color=blue> Product ID: "+ id);
document.write("<br>Product Name: "+ name);
document.write("<br>Product Price: "+ price+"</center></p>");

var global="global var";

function f1(){
    var x=10;
    var y=20;
    document.write("x is:" +x);
    document.write("y is:" +y);
    document.write("global is:" +global);


}

function f2(){
    var a=10;
    var b=20;
    document.write("a is:" +a);
    document.write("b is:" +b);
    document.write("global is:" +global);


}

f1();
f2();