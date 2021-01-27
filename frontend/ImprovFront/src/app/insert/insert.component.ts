import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  id: number;
  name: string;
  type: string;


  constructor() {
    this.id = -1;
    this.name = "";
    this.type = "";
  }

  ngOnInit(): void {
  }

  submit()
  {
    console.log("button pushed " + this.name + " " + this.type);
  }

}
