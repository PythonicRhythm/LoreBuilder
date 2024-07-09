import { Component, OnInit } from '@angular/core';
import { TitleService } from '../title.service';

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrl: './characters.component.css'
})
export class CharactersComponent implements OnInit{

  constructor(private titleServ: TitleService) {}

  ngOnInit() {
    this.titleServ.setTitle('Characters');
  }
}
