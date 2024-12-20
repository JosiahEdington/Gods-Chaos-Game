import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { HeroListComponent } from './components/hero-list/hero-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { AppResponseService } from './services/app-responses.service';
import { HeroesService } from './services/heroes.service';
import { RouterModule } from '@angular/router';
import { routes } from './app.routes';


@NgModule({
  declarations: [
    AppComponent,
    HeroListComponent,
    WelcomeComponent,
    HeroListComponent
  ],
  imports: [
    HttpClientModule,
    HttpClient,
    RouterModule.forRoot(routes),
    BrowserModule,
    ReactiveFormsModule,
    CommonModule,
    NgModule,
    FormsModule
  ],
  providers: [
    HttpClientModule,
    AppResponseService,
    HeroesService
  ]
})
export class AppModule { }
