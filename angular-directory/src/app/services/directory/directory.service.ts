import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of} from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

//entities
import { Address } from '../../entities/address';
import { Phone } from '../../entities/phone';
import { Contact } from '../../entities/contact';
//Mocks
import { CONTACTS } from '../../mocks/contacts';

@Injectable({
  providedIn: 'root'
})
export class DirectoryService {

  constructor(
    private http: HttpClient
  ) { }
  returnHeader(){
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
      })
    };
  }

  getContacts():Observable<Contact[]>{
    return of(CONTACTS);
  } 

  getContact(id: number): Observable<Contact> {
    return of(CONTACTS.find(Contact => Contact.id === id));
  }
}
