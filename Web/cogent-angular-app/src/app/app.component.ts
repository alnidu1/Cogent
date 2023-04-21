import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'cogent-angular-app';
  products=[] as any;

  ngOnInit():void{
    this.products=this.getProduct();
  }
  getProduct()
  {
    return[
      {'id':'1', 'title':'screwdriver', 'price':400, 'stock':100},
      {'id':'2', 'title':'nut', 'price':100, 'stock':1000},
      {'id':'3', 'title':'bolt', 'price':20, 'stock':1500},
      {'id':'4', 'title':'wrench', 'price':100, 'stock':200},
      {'id':'5', 'title':'hammer', 'price':340, 'stock':300}
      
    ]
  }
}
