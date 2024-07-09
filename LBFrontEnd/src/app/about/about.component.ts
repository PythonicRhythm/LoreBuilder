import { Component, OnInit } from '@angular/core';
import { TitleService } from '../title.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent implements OnInit{

  constructor(private titleServ: TitleService) {}

  ngOnInit() {
    this.titleServ.setTitle("About");
  }
}
