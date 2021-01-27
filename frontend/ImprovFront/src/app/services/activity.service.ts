import { Injectable } from '@angular/core';
import {Activity} from '../models/activity';

@Injectable({
  providedIn: 'root'
})
export class ActivityService {
    private activitiesUrl: string;

  constructor(private http: HttpClient, private urlService: UrlService) { 
      this.activitiesUrl = this.urlService.getUrl() + 'activities';
  }

  getAll(): Observable<Activity[]>{
      return this.http.get(this.activitiesUrl, {withCredentials:true}).pipe(
      )
  }

}
