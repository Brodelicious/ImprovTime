import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UrlService {

  constructor() { }

  getURL() : string
  {
    return "http://localhost:8080";
  }

}
