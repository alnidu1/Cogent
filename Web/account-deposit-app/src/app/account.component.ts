
import { Component} from "@angular/core";

@Component({
    selector:'account',
    templateUrl:'./account.component.html'
})
export class Account
{

  displayCounter(count: any)   {
     console.log(count);
  }
  balance:number=0;

  updateBalance(amount: number) {
    this.balance += amount;
    console.log(this.balance);
  }

}
