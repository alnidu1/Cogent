import { Injectable } from "@angular/core";

@Injectable({
    providedIn:'root'
})

export class AppService{
    constructor(){

    }

    getData(){
        return "this is service";
    }

    getProduct()
    {
      return[
        {'id':'1', 'title':'screwdriver', 'price':400, 'stock':100},
        {'id':'2', 'title':'nut', 'price':101, 'stock':1000},
        {'id':'3', 'title':'bolt', 'price':20, 'stock':1500},
        {'id':'4', 'title':'wrench', 'price':90, 'stock':200},
        {'id':'5', 'title':'hammer', 'price':340, 'stock':300},
        {'id':'6', 'title':'saw', 'price':400, 'stock':100},
        {'id':'7', 'title':'screw', 'price':60, 'stock':1000},
        {'id':'8', 'title':'nail', 'price':20, 'stock':1500},
        {'id':'9', 'title':'nail-2', 'price':30, 'stock':200},
        {'id':'10', 'title':'drill', 'price':1230, 'stock':200}
  
        
      ]
    }

    
}