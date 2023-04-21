import { HttpClient } from "@angular/common/http";
import { Book } from "./Book";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn:'root'
})

export class BookService
{
    private url="http://localhost:8080/api/books";

    constructor(private http:HttpClient){

    }

    readAll():Observable<Book[]>{
        return this.http.get<Book[]>(`${this.url}`);
    }
}