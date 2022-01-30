import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

//Components
import { BaseComponent } from "./components/base/base.component";
import { NavbarComponent } from "./components/navbar/navbar.component";
import { ContactComponent } from "./components/directory/contact/contact.component";
import { PhoneComponent } from "./components/directory/phone/phone.component";
import { AddressComponent } from "./components/directory/address/address.component";

const routes: Routes = [
  { path: "", redirectTo: "/", pathMatch: "full" },
  {
    path: "",
    component: BaseComponent,
    children: [
      { path: "contact/:id", component: ContactComponent, canActivate: [] },
      {
        path: "contact/:id/phones",
        component: PhoneComponent,
        canActivate: [],
      },
      {
        path: "contact/:id/addresses",
        component: AddressComponent,
        canActivate: [],
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: "legacy" })],
  exports: [RouterModule],
})
export class AppRoutingModule {}
