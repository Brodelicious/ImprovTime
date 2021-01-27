import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Activity } from '../models/activity';
import { Character } from '../models/character';
import { Setting } from '../models/setting';
import { ActivityService } from '../services/activity.service';
import { CharacterService } from '../services/character.service';
import { SettingService } from '../services/setting.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  id: number;
  name: string;
  type: string;
  message: string;


  constructor(private actServ: ActivityService, private charServ: CharacterService, private setServ: SettingService) {
    this.id = -1;
    this.name = "";
    this.type = "";
    this.message = "";
  }

  ngOnInit(): void {
  }

  async submit()
  {
    console.log("button pushed " + this.name + " " + this.type);
    if (this.type == "" || this.name == "")
    {
      this.message = "Please fill out all required fields!";
      return;
    }

    if(this.type == "Setting")
    {
      let toSend: Setting = new Setting();
      toSend.id = this.id;
      toSend.name = this.name;
      await this.setServ.addSetting(toSend).toPromise();
      this.message = "Added Successfully!";
    }
    else if (this.type == "Character")
    {
      let toSend: Character = new Character();
      toSend.id = this.id;
      toSend.name = this.name;
      await this.charServ.addCharacter(toSend).toPromise();
      this.message = "Added Successfully!";
    }
    else if (this.type == "Activity")
    {
      let toSend: Activity = new Activity();
      toSend.id = this.id;
      toSend.name = this.name;
      await this.actServ.addActivity(toSend).toPromise();
      this.message = "Added Successfully!";
    }
  }

}
