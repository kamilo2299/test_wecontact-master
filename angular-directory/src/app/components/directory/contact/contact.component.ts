import { Component, OnInit, Input  } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

//entity
import { Contact } from '../../../entities/contact';

//service
import { DirectoryService } from '../../../services/directory/directory.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  @Input() contact: Contact;
  modify:boolean=false;
  constructor(
    private route: ActivatedRoute,
    public router: Router,
    private location: Location,
    private directoryService: DirectoryService
  ){ }

  ngOnInit() {
    window.scrollTo(0, 0);
    this.getContact();
  }
  getContact(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.directoryService.getContact(id)
      .subscribe(response => {
        this.contact = response;
      });
  }
  cancel(){
    this.goBack();
  }
  goBack(): void {
   this.location.back();
  }
  save(): void {
      this.goBack()
  }
}

