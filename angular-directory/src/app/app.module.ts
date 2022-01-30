import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { HttpClient, HttpClientModule } from "@angular/common/http";
import { TranslateLoader, TranslateModule } from "@ngx-translate/core";
import { TranslateHttpLoader } from "@ngx-translate/http-loader";
import { FormsModule } from "@angular/forms";

import { AppRoutingModule } from "./app-routing.module";

//Components
import { BaseComponent } from "./components/base/base.component";
import { AppComponent } from "./app.component";
import { LoaderComponent } from "./components/loader/loader.component";
import { MenuCardComponent } from "./components/menu-card/menu-card.component";
import { TableComponent } from "./components/table/table.component";
import { SidenavComponent } from "./components/sidenav/sidenav.component";
import { NavbarComponent } from "./components/navbar/navbar.component";
import { ContactComponent } from "./components/directory/contact/contact.component";
import { PhoneComponent } from "./components/directory/phone/phone.component";
import { AddressComponent } from "./components/directory/address/address.component";

@NgModule({
  declarations: [
    AppComponent,
    BaseComponent,
    MenuCardComponent,
    ContactComponent,
    TableComponent,
    LoaderComponent,
    SidenavComponent,
    NavbarComponent,
    PhoneComponent,
    AddressComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: (http: HttpClient) => {
          return new TranslateHttpLoader(http);
        },
        deps: [HttpClient],
      },
    }),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
