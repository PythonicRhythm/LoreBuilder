import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './about/about.component';
import { CharactersComponent } from './characters/characters.component';
import { ClassesComponent } from './classes/classes.component';
import { RacesComponent } from './races/races.component';
import { SocialComponent } from './social/social.component';
import { CampaignsComponent } from './campaigns/campaigns.component';
import { OneCharacterComponent } from './one-character/one-character.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    CharactersComponent,
    ClassesComponent,
    RacesComponent,
    SocialComponent,
    CampaignsComponent,
    OneCharacterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
