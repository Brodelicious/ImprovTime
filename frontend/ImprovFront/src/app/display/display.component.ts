import { Component, OnInit } from '@angular/core';
import {async} from 'rxjs';
import {GeneratorService} from '../services/generator.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.scss']
})
export class DisplayComponent implements OnInit {
  scenario: string;

  constructor(private genServ: GeneratorService) { 
      this.scenario = "Scene!";
  }

  ngOnInit(): void {
  }

  async generate(){
     this.genServ.getGeneratedString().subscribe(
         resp => {
             console.log(resp);
             this.scenario = resp as string;
         }
     );
  }

}
