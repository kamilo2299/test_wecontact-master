import { wrapperAddress } from '../../entities/wrapperAddress';
import { wrapperPhone } from "./../../entities/wrapperPhone";
import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, of } from "rxjs";
import { catchError, map, tap } from "rxjs/operators";
import { NetService } from "src/app/utils/net.service";

//entities
import { Address } from "../../entities/address";
import { Phone } from "../../entities/phone";
import { Contact } from "../../entities/contact";
//Mocks
import { CONTACTS } from "../../mocks/contacts";

@Injectable({
  providedIn: "root",
})
export class DirectoryService {
  constructor(private http: HttpClient, private net: NetService) {}
  returnHeader() {
    return {
      headers: new HttpHeaders({
        "Content-Type": "application/json",
      }),
    };
  }

  getContacts(): Observable<Contact[]> {
    return of(CONTACTS);
  }

  getContact(id: number): Observable<Contact> {
    return of(CONTACTS.find((Contact) => Contact.id === id));
  }

  getNewContacts(): Observable<Contact[]> {
    const url = `/listarContactos`;
    return this.net.get(url);
  }

  getNewContact(idUsuario): Observable<Contact> {
    const url = `/contact/${idUsuario}`;
    return this.net.get(url);
  }
  

  setTelefonosNuevos(telefonosNuevos: wrapperPhone) {
    const url = `/cambiarNumeros`;
    return this.net.post(url, {
      "id": telefonosNuevos.id,
      "idCambios": telefonosNuevos.phonesID,
      "phones": telefonosNuevos.phonesChanges
      }
    );
  }

  setDireccioesNuevos(direccionesNuevos: wrapperAddress) {
    const url = `/cambiarDirecciones`;
    return this.net.post(url, {
      "id": direccionesNuevos.id,
      "idCambios": direccionesNuevos.addressesID,
      "addresses": direccionesNuevos.addressesChanges
      }
    );
  }
}
