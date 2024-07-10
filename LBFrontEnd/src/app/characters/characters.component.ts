import { Component, OnInit } from '@angular/core';
import { TitleService } from '../title.service';
import { DBfetchService } from '../dbfetch.service';

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrl: './characters.component.css'
})
export class CharactersComponent implements OnInit{

  characters:any;

  constructor(private titleServ: TitleService, private dbfetchServ: DBfetchService) {}

  ngOnInit() {
    this.titleServ.setTitle('Characters');
    this.getUserCharacters();
  }

  getUserCharacters() {
    this.characters = this.dbfetchServ.grabUserCharacters();
  }
}
