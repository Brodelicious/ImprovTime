import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Activity } from '../models/activity';
import { UrlService } from './url.service';

@Injectable({
  providedIn: 'root'
})
export class ActivityService {

  url: string;

  constructor(private http: HttpClient, private urlServ: UrlService) {
    this.url = this.urlServ.getURL() + "/activities";
  }


  getActivityById(id: number) 
  {
    return this.http.get(this.url + "/" + id);
  }

  getAllActivities()
  {
    return this.http.get(this.url + "/all");
  }

  addActivity(act: Activity)
  {
    return this.http.post(this.url, act);
  }

  updateActivity(act: Activity)
  {
    return this.http.put(this.url,act);
  }

  deleteActivity(id: number)
  {
    return this.http.delete(this.url + "/" + id);
  }

}
