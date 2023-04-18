import { Component } from "@angular/core";

@Component({
    selector:'product',
    templateUrl:'./product.component.html'
})
export class ProductComponet
{
    productNo: number =1;
    productName:string="laptop";
    productProce:number =500;
   ImageUrl="data:image/jpeg;base64,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";
   name:string= "cogent infotech";
   
   message(){
        alert("Did you click me");
   }
}