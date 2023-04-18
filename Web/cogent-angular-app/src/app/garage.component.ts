import { Component } from "@angular/core";
import { CarEntity } from "./car.entity";

@Component({
    selector:'garage',
    templateUrl:'./garage.component.html'

})
export class Garage
{
    public car:Array<CarEntity>;
    constructor(){
        var car1:CarEntity= new CarEntity("honda", "red");
        var car2:CarEntity= new CarEntity("lexus", "silver");
        var car3:CarEntity= new CarEntity("toyota", "blue");

        this.car= [car1,car2,car3];

    }

}