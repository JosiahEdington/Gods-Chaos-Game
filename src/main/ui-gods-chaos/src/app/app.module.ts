import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { HeroListComponent } from './components/hero-list/hero-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { HomeService } from './services/home.service';
import { HeroesService } from './services/heroes.service';
import { RouterModule } from '@angular/router';
import { routes } from './app.routes';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    HttpClientModule,
    HttpClient,
    RouterModule.forRoot(routes),
    BrowserModule,
    ReactiveFormsModule,
    CommonModule,
    NgModule
  ],
  providers: [
    HttpClientModule,
    HomeService,
    HeroesService
  ]
})
export class AppModule { }
