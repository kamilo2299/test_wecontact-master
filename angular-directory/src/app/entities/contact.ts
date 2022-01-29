import { Phone } from './phone';
import { Address } from './address';

export class Contact{
    id: number; //Id autoincremental
    name: string; // Name length 20
    surname: string; //last name length 20
    photo: string; //last name length 255
    phones: Phone[]; //list of phone numbers 
    addresses: Address[]; // list of addresses
    birthday: string; //date of contact's birthday length 10
  }
  