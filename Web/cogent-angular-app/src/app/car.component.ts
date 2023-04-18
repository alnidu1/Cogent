import { Input, Component } from "@angular/core";
import {CarEntity} from "./car.entity";

@Component({

    selector:'car-component',
    templateUrl:"./car.html"
})
export class CarComponet
{
    @Input()
    car:CarEntity;

    constructor()
    {
        console.log("Garage")
    }
}