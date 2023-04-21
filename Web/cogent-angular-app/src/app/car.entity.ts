export class CarEntity{

    brand:string;
    color:string;
    constructor(public _brand:string, public _color:string)
    {
        this.brand=_brand;
        this.color=_color;
    }
}