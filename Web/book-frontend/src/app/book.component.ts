import { Component } from "@angular/core";
import { BookService } from "./book.service";
import { OnInit } from "@angular/core";
import { Book } from "./Book";

@Component({
    selector: 'book',
    templateUrl: './book.component.html',
})

export class BookComponent implements OnInit{
    
    books:Book[];
    constructor(private service:BookService){
        this.books=[];
    }

    ngOnInit():void{
        this.service.readAll().subscribe((data)=>{
          this.books=data;
        });
    
    }
      
}
