import { Component, OnInit, Input } from "@angular/core";
import { Router } from "@angular/router";
//Entities
import { Contact } from "../../entities/contact";

@Component({
  selector: "app-menu-card",
  templateUrl: "./menu-card.component.html",
  styleUrls: ["./menu-card.component.css"],
})
export class MenuCardComponent implements OnInit {
  @Input() contact: Contact;
  modal: boolean = false;

  //table info for phone numbers.
  titlesPhone: String[] = ["country", "label", "number", "delete", "edit"]; //titles of the table
  attributesPhone: any[] = [["country"], ["label"], ["number"]];

  //table info for addresses
  titlesAddresses: String[] = ["label", "address", "delete", "edit"]; //titles of the table
  attributesAddresses: any[] = [["label"], ["address"]];

  constructor(public router: Router) {}

  ngOnInit() {}

  /**
   * Show contact information on modal
   */
  showModal() {
    this.modal = true;
  }
  /**
   * Close contact model
   */
  closeModal() {
    this.modal = false;
  }
}
