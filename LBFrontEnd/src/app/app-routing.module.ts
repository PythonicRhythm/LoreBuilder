import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CharactersComponent } from './characters/characters.component';

const routes: Routes = [
  {path: "", component: CharactersComponent, title: "Characters"},
  {path: "about", component: AboutComponent, title: "About"},
  {path: "characters", component: CharactersComponent, title: "Characters"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
