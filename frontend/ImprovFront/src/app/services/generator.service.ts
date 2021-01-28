import {HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import {UrlService} from './url.service';

@Injectable({
  providedIn: 'root'
})
export class GeneratorService {

    url: string;

    constructor(private http: HttpClient, private urlServ: UrlService) { 
        this.url = this.urlServ.getURL() + "/generators";
    }

    getGeneratedString(){
        return this.http.get(this.url);
    }
}
