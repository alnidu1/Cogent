import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { CareerComponent } from './career/career.component';
import { NoPageFoundComponent } from './no-page-found/no-page-found.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'home', component:HomeComponent},
  {path:'contact', component:ContactComponent},
  {path:'about', component:AboutComponent},
  {path:'career', component:CareerComponent},
  {path:'product', component:ProductComponent},
  {path:'**', component:NoPageFoundComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
