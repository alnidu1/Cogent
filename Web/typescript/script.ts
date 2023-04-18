function area(l:number, w:number,shape:string){

    if(shape==="r"){
        return l*w;
    }

    return l*w/2;

}

let r=area(10,4,"r");
let t=area(10,4,"t");


interface Shape{
    l:number,
    w:number,
    area:()=>number;
}

const tri:Shape={
    l:10,
    w:20,
    area:()=> this.w*this.l
    
}

class Person{
    fn:string="";
    ln:string="";
   

    get():string{
        return this.fn+" "+this.ln;
    }

}



class Employee extends Person{
    designation:string="";
}

const e= new Employee();
e.fn="test";
e.ln="case";
e.designation="1";
console.log(e.get());
console.log(e);
