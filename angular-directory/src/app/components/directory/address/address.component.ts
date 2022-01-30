import { Component, OnInit, Input } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";
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
  @Input() contact: Contact;
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
    this.directoryService.getContact(id).subscribe((response) => {
      this.contact = response;
    });

    console.log("address" + this.contact.addresses.length);
  }
}
