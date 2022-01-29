import { Address } from '../entities/address';
import { Phone } from '../entities/phone';
import { Contact } from '../entities/contact';

export const CONTACTS: Contact[] = [
  {
    id: 1,
    name: "felipe",
    surname: "perez",
    photo: "image_1.jpg",
    phones:[{
      id: 1,
      country: 57,
      label: "Home",
      number: "5789642",
    },{
      id: 2,
      country: 57,
      label: "Office",
      number: "6987451",
    }],
    addresses: [{
      id: 1,
      label: "Home",
      address: "Street 5938 - lombady",
    },{
      id: 2,
      label: "Office",
      address: "Street okla 018374",
    }],
    birthday: "09/08/1968"
  },{
    id: 2,
    name: "camilo",
    surname: "lopez",
    photo: "image_2.jpg",
    phones: [{
      id: 1,
      country: 57,
      label: "Home",
      number: "5789642",
    },{
      id: 2,
      country: 57,
      label: "Vacations",
      number: "6987451",
    }],
    addresses: [{
      id: 1,
      label: "Home",
      address: "Street 98345 - int 501",
    }],
    birthday: "12/03/1992"
  },{
    id: 3,
    name: "Andrea",
    surname: "Rodriguez",
    photo: "image_3.jpg",
    phones: [{
      id: 1,
      country: 57,
      label: "Home",
      number: "5789642",
    },{
      id: 2,
      country: 57,
      label: "Apto",
      number: "6987451",
    }],
    addresses: undefined,
    birthday: "12/03/1992"
  },{
    id: 4,
    name: "Claudia",
    surname: "Torres",
    photo: "image_4.jpg",
    phones: undefined,
    addresses: [{
      id: 1,
      label: "Apto",
      address: "parkway 78 - apto 1003",
    }],
    birthday: "12/03/1992"
  }
];
