import { Component } from '@angular/core';
import { Login } from './login';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'template-form';

  model:Login;
  constructor(){
    this.model= new Login(12345, "password123", true);
    
  }

  
  onSubmit(loginform:any){
    alert("id: "+loginform.value.id+ " password:" + loginform.value.password);
    console.log(loginform.value);
  }
}
