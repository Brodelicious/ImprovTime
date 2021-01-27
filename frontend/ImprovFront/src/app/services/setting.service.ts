import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Http2ServerRequest } from 'http2';
import { Observable } from 'rxjs';
import {Setting} from '../models/setting';
import {UrlService} from './url.service';

@Injectable({
  providedIn: 'root'
})
export class SettingService {
    url: string;

    constructor(private http: HttpClient, private urlServ: UrlService) { 
        this.url = this.urlServ + "/settings";
    }

    getSettingById(id: number){
        return this.http.get(this.url + "/" + id);
    }

    getAllSettings(){
        return this.http.get(this.url + "/all");
    }

    addSetting(setting: Setting){
        return this.http.post(this.url, setting);
    }

    updateSetting(setting: Setting){
        return this.http.put(this.url, setting);
    }

    deleteSetting(id: number){
        return this.http.delete(this.url + "/" + id);
    }
}
