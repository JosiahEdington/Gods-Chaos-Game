import { Component, OnInit } from '@angular/core';
import { Hero } from '../../entities/hero';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Location, LocationStrategy } from '@angular/common';
import { HeroesService } from '../../services/heroes.service';
import { NavbarComponent } from '../navbar/navbar.component';
import { HeroComponent } from '../hero/hero.component';

@Component({
  selector: 'app-hero-list',
  standalone: true,
  imports: [ CommonModule ],
  templateUrl: './hero-list.component.html',
  styleUrl: './hero-list.component.css'
})
export class HeroListComponent implements OnInit {
  
  heroes!: Hero[];
  
  constructor(private heroService:HeroesService) {}

  ngOnInit() {
    this.getHeroes();
  }

  getHeroes() {
    this.heroService.getAllHeroesList().subscribe(
      hero => this.heroes = hero
    );
  }
}