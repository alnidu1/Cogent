import { Component , Input} from "@angular/core";
import { ItemEntity } from "./item.entity";


@Component({

    selector:'item-component',
    templateUrl:"./item.component.html"

})

export class ItemComponent
{

    @Input()
    item:ItemEntity;
    

    constructor()
    {
        console.log("Garage")
        this.item= new ItemEntity(10,"test",10);
    }
}