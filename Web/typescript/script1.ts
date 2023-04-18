export let age:number=20;
export class Emp{
    code:number;
    name:string;

    constructor(code:number, name:string){
        this.code=code;
        this.name=name;
    }

    display(){
        console.log("emp code "+ this.code+ " name: "+ this.name);
    }
}