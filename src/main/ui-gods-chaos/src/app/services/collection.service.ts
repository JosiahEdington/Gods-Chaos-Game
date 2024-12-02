import { Injectable } from '@angular/core';
import { Hero } from '../entities/hero';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment.prod';
import { CollectedHero } from '../entities/collected-hero';
import { Collection } from '../entities/collection';

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  private collectionUrl = environment.baseUrl + '/collection'
  private allHeroesUrl = environment.baseUrl + '/heroes'

  constructor( private httpClient: HttpClient ) { }

  getCollection(): Observable<Collection[]> {
    return this.httpClient.get<Collection[]>(this.collectionUrl);
  }

  getCollectionByUsername(theUsername:string): Observable<Collection> {
      return this.httpClient.get<Collection>(`${this.collectionUrl}?username=${theUsername}`)
  }

}
