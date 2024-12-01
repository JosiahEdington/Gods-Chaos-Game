import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from "./components/navbar/navbar.component";
import { WelcomeComponent } from "./components/welcome/welcome.component";
import { HeroListComponent } from "./components/hero-list/hero-list.component";
import { AppResponseService } from './services/app-responses.service';
import { AppResponses } from './app-responses';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ 
    FormsModule,
    RouterOutlet, 
    NavbarComponent, 
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Gods Chaos App';
  appResponses!: AppResponses;

  constructor(private appResponseService: AppResponseService) { }

  getWelcomeMessage() {
    this.appResponseService.getWelcomeMessage().subscribe (message => this.appResponses.welcomeMessage)
  }
}
