import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Hero } from '../../entities/hero';
import { HeroesService } from '../../services/heroes.service';
import { HomeService } from '../../services/home.service';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent implements OnInit {

  constructor(private homeService:HomeService) {}

  welcomeMessage!: string;

  ngOnInit(): void {
    this.homeService.getWelcomeMessage().subscribe(message => this.welcomeMessage);
  }

}
