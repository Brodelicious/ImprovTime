import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Character } from '../models/character';
import { UrlService } from './url.service';

@Injectable({
  providedIn: 'root'
})
export class CharacterService {

  url: string;

  constructor(private http: HttpClient, private urlServ: UrlService) {
    this.url = this.urlServ.getURL() + "/characters";
  }


  getCharacterById(id: number) 
  {
    return this.http.get(this.url + "/" + id);
  }

  getAllCharacters()
  {
    return this.http.get(this.url);
  }

  addCharacter(act: Character)
  {
    return this.http.post(this.url, act);
  }

  updateCharacter(act: Character)
  {
    return this.http.put(this.url,act);
  }

  deleteCharacter(id: number)
  {
    return this.http.delete(this.url + "/" + id);
  }
}
