import { wrapperAddress } from '../../../entities/wrapperAddress';
import { Component, OnInit, Input } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";
import { Location } from '@angular/common';
//entity
import { Contact } from "../../../entities/contact";

//service
import { DirectoryService } from "../../../services/directory/directory.service";

@Component({
  selector: "app-address",
  templateUrl: "./address.component.html",
  styleUrls: ["./address.component.css"],
})
export class AddressComponent implements OnInit {
  @Input() contact: Contact = new Contact();

  addressesNuevos: wrapperAddress = new wrapperAddress();
  constructor(
    private route: ActivatedRoute,
    public router: Router,
    private directoryService: DirectoryService,
    private location: Location
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
    for (let i = 0; i < this.contact.addresses.length; i++) {
      this.addressesNuevos.addressesID.push(this.contact.addresses[i].id);
      this.addressesNuevos.addressesChanges.push(this.contact.addresses[i].address);
    }
    this.addressesNuevos.id = +this.route.snapshot.paramMap.get("id");
    this.directoryService.setDireccioesNuevos(this.addressesNuevos).subscribe(      
      results => {
      console.log(results)            

    },
    error => console.error(error))
    this.addressesNuevos = new wrapperAddress();
    this.location.back();

  }
}
