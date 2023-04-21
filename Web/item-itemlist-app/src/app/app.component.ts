import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { PostService } from './post.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'item-itemlist-app';
  num:number=0;

  products=[] as any;
  showMessage=true;
  productName="Cricket Bat";
  productPrice=999;
  data:any;
  companyName="Cogent University"
  
  posts:any;
  /*
  constructor(private service:AppService)
  {

  }
  */

  /*
  ngOnInit():void{
    this.products=this.service.getProduct();
    this.data=this.service.getData();

  }
*/

  items:item[]=[
    {name:'one', val:1},
    {name:'two', val:2},
    {name:'three', val:3},
    {name:'four', val:4},
    {name:'five', val:5},
    {name:'six', val:6},
    {name:'seven', val:7},
    

  ];

  s_one:string='one';
  s_two:string='One';
  s_three:string='One';
  s_four:string='One';


  constructor(private service:PostService)
  {

  }

  ngOnInit():void{
    this.service.getPost().subscribe((response)=>{
      this.posts=response;
    });

  }
  
}


class item{
  name:string;
  val:number;

  constructor(n:string,v:number ){
    this.name=n;
    this.val=v;
  }
}