import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { User } from "./user";
import { HttpClient } from "@angular/common/http";


@Injectable({
    providedIn:'root'
})

export class UserService
{
    private url="http://localhost:8080/api/user";

    constructor(private http:HttpClient){

    }

    readAll():Observable<User[]>{
        return this.http.get<User[]>(`${this.url}`);
    }

    createUser(user:User):Observable<User>{
        return this.http.post<User>(`${this.url}`, user);
    }

    updatedUser(user:User):Observable<User>{
        return this.http.put<User>(`${this.url}/${user.id}`,user);
    }

    deleteUser(id:number):Observable<any>{
        return this.http.delete(`${this.url}/${id}`,{responseType:'text'})
    }
}