import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Hero } from '../../entities/hero';
import { HeroesService } from '../../services/heroes.service';

@Component({
  selector: 'app-abilities',
  standalone: true,
  imports: [ CommonModule,
    FormsModule
  ],
  templateUrl: './abilities.component.html',
  styleUrl: './abilities.component.css'
})
export class AbilitiesComponent {
  heroes!: Hero[];

  constructor(private heroService:HeroesService) {}

  ngOnInit() {
    this.heroService.getAllHeroesList().subscribe(hero => this.heroes = hero);
  }

  
}
