export class wrapperAddress {
  id: number; // Id autoincremental
  addressesID: number[] = [];
  addressesChanges: String[] = [];

  constructor() {
    this.addressesID = Array<number>();
    this.addressesChanges = Array<String>();
  }

}
