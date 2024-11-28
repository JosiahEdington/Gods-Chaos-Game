import { Injectable } from '@angular/core';
import { environment } from '../environments/environment.prod';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AppResponses } from '../entities/app-responses';

@Injectable({
  providedIn: 'root'
})
export class AppResponseService {

  private baseUrl = environment.baseUrl;
  private homeUrl = this.baseUrl + "/home";

  constructor(private httpClient: HttpClient) { }

  getWelcomeMessage(): Observable<AppResponses> {
    return this.httpClient.get<AppResponses>(this.homeUrl);
  }

}

