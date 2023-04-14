
class Book{
    constructor(title, author, price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    displayInfo(){
        document.write(" <br>title: "+ this.title);
        document.write("<br>author: "+this.author);
        document.write("<br>price: "+this.price);

    }
}
    
var book1= new Book("test1", "tester1", 1) ;
    
var book2= new Book("test2", "tester2", 2) ;

book1.displayInfo();
book2.displayInfo();