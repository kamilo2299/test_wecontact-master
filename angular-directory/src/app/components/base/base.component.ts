import { Component, OnInit, Input } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

//Entities
import { Contact } from '../../entities/contact';
//Service
import { DirectoryService } from '../../services/directory/directory.service';

@Component({
  selector: 'app-base',
  templateUrl: './base.component.html',
  styleUrls: ['./base.component.css']
})
export class BaseComponent implements OnInit {

  title:string = "weContact";
  description:string ="Manage your contacts";
  menu:boolean=true;
  contacts:Contact[];

  constructor(
      public route: ActivatedRoute,
      public router: Router,
      private directoryService:DirectoryService,
    ) {
    }
  ngDoCheck(){
  }
  ngOnInit() {
    this.directoryService.getContacts()
      .subscribe(response => {
        this.contacts = response;
    });
  }
  setShow(show:boolean){
    this.menu=show;
  }
}
