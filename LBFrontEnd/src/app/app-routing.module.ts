import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CharactersComponent } from './characters/characters.component';
import { SocialComponent } from './social/social.component';
import { CampaignsComponent } from './campaigns/campaigns.component';

const routes: Routes = [
  {path: "", component: CharactersComponent, title: "Characters"},
  {path: "social", component: SocialComponent, title: "Social"},
  {path: "about", component: AboutComponent, title: "About"},
  {path: "characters", component: CharactersComponent, title: "Characters"},
  {path: "campaigns", component: CampaignsComponent, title: "Campaigns"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
