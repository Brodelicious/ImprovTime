import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayComponent } from './display/display.component';
import { InsertComponent } from './insert/insert.component';



const routes: Routes = [
  {path: 'display', component: DisplayComponent},
  {path: 'insert', component: InsertComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
