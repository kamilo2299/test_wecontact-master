import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
  //Functions outputs
  @Output() routeDeleteAny = new EventEmitter<any>();
  @Output() routeEditAny = new EventEmitter<any>();
  @Output() routeOtherAny = new EventEmitter<any>();
  //Base header
  @Input() titles: String[] = [];
  @Input() attributes:String[] = [];
  @Input() list: any[] = [];
  //Attributes that structure the table
  @Input() otherIcon: String = "";
  @Input() checkbox: boolean = false;
  @Input() delete: boolean = true;
  @Input() edit: boolean = true;
  @Input() other: boolean = false;
  @Input() itemConditionModifyAttribute: String = "";
  @Input() itemConditionModifyValue: String = "";

  constructor() { }

  ngOnInit(): void {
    console.log("list",this.list);
    console.log("attributes",this.attributes);
    console.log("titles",this.titles);
    console.log("delete",this.delete);
  }
  routeEdit(item : any){
    this.routeEditAny.emit(item);
  }
  routeDelete(item : any){
    this.routeDeleteAny.emit(item);
  }
  routeOther(item : any){
    this.routeOtherAny.emit(item);
  }
}
