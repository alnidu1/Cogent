import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home-user',
  templateUrl: './home-user.component.html',
  styleUrls: ['./home-user.component.css']
})
export class HomeUserComponent implements OnInit{

  users: User[];
  model:User;
  showForm:boolean=false;


  constructor(private userService:UserService){
      this.users=[];
      this.model= new User('',0,0);
  }

  ngOnInit(): void {
      this.loadUser();
  }

  loadUser(){
    this.userService.readAll().subscribe(users=>{
      this.users=users;
    })
  }

  addUser(loginform:any): void {
    const newUser = new User(loginform.value.name, loginform.value.age, loginform.value.salary);
    console.log(loginform.value.name +" "+ loginform.value.age+" "+loginform.value.salary );
    console.log(User)
    this.userService.createUser(newUser)
      .subscribe(
        response => {
          console.log(response);
          this.loadUser();
        },
        error => {
          console.log(error);
        });
  }

  editUser(user:User){
    console.log(user.id +""+ user.name);
    this.userService.updatedUser(user).subscribe(()=>
      {
        this.loadUser();
      }
    );
  }

  deleteUser(user:User){
    this.userService.deleteUser(user.id).subscribe(()=>
    {
      this.loadUser();
    }
    );
  }

  toggle(){
    this.showForm=!this.showForm;
  }

  

}
