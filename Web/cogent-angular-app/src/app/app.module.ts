import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponet } from './product.componet';
import { FormsModule } from '@angular/forms';
import { CarComponet } from './car.component';
import { Garage } from './garage.component';

@NgModule({
  declarations: [
    AppComponent, ProductComponet, CarComponet, Garage
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
