import { Component, OnInit, Input } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";

//entity
import { Contact } from "../../../entities/contact";
import { Phone } from "../../../entities/phone";
import { wrapperPhone } from "../../../entities/wrapperPhone";
//service
import { DirectoryService } from "../../../services/directory/directory.service";

@Component({
  selector: "app-phone",
  templateUrl: "./phone.component.html",
  styleUrls: ["./phone.component.css"],
})
export class PhoneComponent implements OnInit {
  @Input() contact: Contact = new Contact();

  phonesNuevos: wrapperPhone = new wrapperPhone();
  constructor(
    private route: ActivatedRoute,
    public router: Router,
    private directoryService: DirectoryService
  ) {}

  ngOnInit(): void {
    this.getContact();
  }

  getContact(): void {
    const id = +this.route.snapshot.paramMap.get("id");
    console.log(id);
    this.directoryService.getNewContact(id).subscribe((response) => {
      this.contact = response;
    });
  }

  save(): void {
    for (let i = 0; i < this.contact.phones.length; i++) {
      this.phonesNuevos.phonesID.push(this.contact.phones[i].id);
      this.phonesNuevos.phonesChanges.push(this.contact.phones[i].number);
    }
    this.phonesNuevos.id = +this.route.snapshot.paramMap.get("id");
    this.directoryService.setTelefonosNuevos(this.phonesNuevos).subscribe(      
      results => {
      console.log(results)    
      this.refresh();        

    },
    error => console.error(error))
    this.phonesNuevos = new wrapperPhone();
    
  }

  refresh(): void {
    window.location.reload();
}

}
