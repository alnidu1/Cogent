import { Component } from "@angular/core";
import { ItemEntity } from "./item.entity";

@Component({

    selector:'itemlist',
    templateUrl:"./itemlist.component.html"
})

export class ItemList{
    public ilist:Array<ItemEntity>;

    constructor(){
        var phone:ItemEntity= new ItemEntity(1, "Phone", 999);
        var laptop:ItemEntity= new ItemEntity(2, "Laptop", 1999);
        var car:ItemEntity= new ItemEntity(3, "Car", 29999);
        var ps5:ItemEntity= new ItemEntity(4, "PS5",700);
        var food:ItemEntity= new ItemEntity(5, "Food", 10);

        this.ilist=[phone, laptop, car,ps5,food];
    }
}