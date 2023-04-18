import { Component, Input, Output,EventEmitter } from "@angular/core";

@Component({
    selector:'deposit',
    templateUrl:'./deposit.component.html'
})
export class Deposit
{
    @Output()  
    valueChange = new EventEmitter();
    counter=0;
    valueChanged()   {
       this.counter = this.counter + 1;
       this.valueChange.emit(this.counter);
    }
    amount: number = 0;
  @Output() updateBalance: EventEmitter<number> = new EventEmitter();

  deposit() {
    this.updateBalance.emit(this.amount);
    this.amount = 0;
  }
}