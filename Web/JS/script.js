document.write("using external script.js ");
var bookid= 1234;
var bookName= "Java";
var bookPrice=6.0;

document.write("<br><center>book Id: "+bookid);
document.write("<br>book Name: "+bookName);
document.write("<br>book Price: "+bookPrice +"</center>");

function reverse(){

    var reversed=0
    var num=123;
    document.write("Before Reverse:" +num);

    if(num<=9){
        document.write("<br>reversed: "+num);
        return;
    }

    while(num>0){
       var last= num%10;
       reversed= reversed *10+last;
       num= Math.floor(num/10);

    }

    document.write("<br>reversed:" +reversed);

}

reverse();


var x=10;
var y=(x<20)?0:1;
document.write("<br>condtion operation :" + y);

class book{
    constructor(id, name, author){
        this.id=id;
        this.name=name;
        this.author=author;
    }
   

    display(){
        document.write("<br>id: " +this.id + " name: "+ this.name+ 
        " author: "+ this.author);
    }
}
book.prototype.year;
var book1= new book(1,"test","test", 1997);
book1.display();

obj= new Object();
obj.fn="a";
obj.ln="l";
obj.age=20;
obj.address="nyc";

with(obj){
    document.write("<br>");
    document.write(fn);
    document.write(ln );
}

a= new Array("a","b","c");
b=new Array("x","y","z");
c= new Array();
c=a.concat(b);

num= new Array(10,20,30,40,50);

for(i=0;i< num.length;i++){
    document.write("<br>"+num[i])
}

arr1= new Array(10,20,30);
arr2= new Array("a","b");
arr3= arr1.concat(arr2);

document.write("<br>"+arr3);
arr4= new Array(99,50,87,1,4,23);
document.write("<br>"+arr4.sort());

function mm(){
    mynum= new Array(10,20,30,40,50,99,1);
    min=99999;
    max=-1;


    for(i=0;i<mynum.length;i++){
        if(min>mynum[i]){
            min=mynum[i]
        }
        if(max<mynum[i]){
            max=mynum[i];
        }

    }
    document.write("<br>min: "+ min+ " max: "+max  )
    
}
mm();
var games= new Array("BoTW", "Digimon");

games.push("AC", "Pokemon");
var pokemon= games.pop();
games.unshift("GTA", "Fallout");
var gta= games.shift();

games.sort();
games.reverse();

var four= games.join(", ");

games.splice(1,2);
var two= games.join(", ");

document.write("<br>Pokemon? "+ pokemon );
document.write("<br>GTA? "+ gta +"\n");
document.write("<br>4? "+ four +"\n");

document.write("<br>2? "+ two +"\n");

function sum(a,b){
    s=a+b;
    return s;
}

function mult(a,b){
    s=a*b;
    return s;
}
function green(){
    document.body.style.backgroundColor="green";
}
function blue(){
    document.body.style.backgroundColor="blue";
}
function red(){
    document.body.style.backgroundColor="red";
}
function yellow(){
    document.body.style.backgroundColor="yellow";
}
function white(){
    document.body.style.backgroundColor="white";
}