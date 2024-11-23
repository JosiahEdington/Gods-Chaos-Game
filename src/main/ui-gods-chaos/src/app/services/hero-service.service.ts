import { Injectable } from '@angular/core';
import { environment } from '../environments/environment.qa';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Hero } from '../entities/hero';

@Injectable({
  providedIn: 'root'
})
export class HeroServiceService {

  private allHeroesUrl = environment.baseUrl + '/heroes'

  constructor(private httpClient: HttpClient) { }

  getAllHeroesList(theHeroId:number): Observable<Hero> {
    return this.getHeroes(this.allHeroesUrl);
  }


  private getHeroes(searchUrl: string): Observable<Hero[]> {
    return this.httpClient.get<GetResponseHeroes>(searchUrl).pipe(map(response => response._embedded.heroes));
  }

}

interface GetResponseHeroes {
  _embedded: {
    heroes: Hero[];
  },
  page: {
    size: number,
    totalElements: number,
    totalPages: number,
    number: number,
  }
}
