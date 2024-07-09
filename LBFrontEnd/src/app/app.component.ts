import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TitleService } from './title.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  pageTitle:any;

  constructor(private titleServ: TitleService){}

  ngOnInit() {
      this.titleServ.getTitle().subscribe(title => this.pageTitle = title);
  }

  setPageTitle(title:any) {
    this.pageTitle = title;
  }
}
