export class Employee{
    id:number;
    name:string;

    constructor(code:number, name:string){
        this.id=code;
        this.name=name;
    }

    showInfo(){
        console.log("emp id "+ this.id+ " name: "+ this.name);
    }
}

export class shape{
    shape:string;
    width:number;
    length:number;
    
    constructor(l:number, w:number, s:string)
    {
        this.shape=s;
        this.length=l;
        this.width=w;
    }

    calc(){
        if(this.shape=="r"){
            let a =this.length*this.width;
            console.log("Area of rec = " +a);

        }
        else{
            let a =this.length*this.width/2;

            console.log("Areaof tri  = " +a);

        }
    }


}