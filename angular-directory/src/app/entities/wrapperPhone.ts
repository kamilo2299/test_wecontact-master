export class wrapperPhone {
  id: number; // Id autoincremental
  phonesID: number[] = [];
  phonesChanges: String[] = [];

  constructor() {
    this.phonesID = Array<number>();
    this.phonesChanges = Array<String>();
  }
}
