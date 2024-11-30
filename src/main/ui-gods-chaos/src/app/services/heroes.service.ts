import { Injectable } from '@angular/core';
import { environment } from '../environments/environment.prod';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Hero } from '../entities/hero';

@Injectable({
  providedIn: 'root'
})
export class HeroesService {

  private allHeroesUrl = environment.baseUrl + '/heroes'
  private collectionUrl = environment.baseUrl + '/collection'
  private searchHeroUrl = environment.baseUrl + '/heroes/search'

  constructor(private httpClient: HttpClient) { }

  getAllHeroesList(): Observable<Hero[]> {
    return this.httpClient.get<Hero[]>(this.allHeroesUrl);
  }

  getCollectionList(theUsername: string): Observable<Hero[]> {
    return this.httpClient.get<Hero[]>(`${this.collectionUrl}/search/findByUsernameContaining?name=${theUsername}`);
  }
}
