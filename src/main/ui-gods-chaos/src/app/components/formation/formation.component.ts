import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, NgModel } from '@angular/forms';
import { HeroListComponent } from '../hero-list/hero-list.component';
import { HeroesService } from '../../services/heroes.service';
import { Hero } from '../../entities/hero';

@Component({
  selector: 'app-formation',
  standalone: true,
  imports: [ CommonModule, 
    FormsModule
  ],
  templateUrl: './formation.component.html',
  styleUrl: './formation.component.css'
})
export class FormationComponent implements OnInit {
  heroes!: Hero[];

  constructor(private heroService:HeroesService) {}

  ngOnInit() {
    this.heroService.getAllHeroesList().subscribe(hero => this.heroes = hero);
  }

  

}
