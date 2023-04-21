export class User{
    
    id:number=0;
    name:string ='';
    age:number=0;
    salary:number=0;
    

  
    constructor(_name:string, _age:number, _salary:number){
        
        this.name=_name;
        this.age=_age;
        this.salary=_salary;

    }
}