import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { CdkDragDrop, moveItemInArray, transferArrayItem, CdkDrag, CdkDropList } from '@angular/cdk/drag-drop';
import { CommonModule } from '@angular/common';
import { FormsModule, NgModel } from '@angular/forms';
import { HeroListComponent } from '../hero-list/hero-list.component';
import { HeroesService } from '../../services/heroes.service';
import { Hero } from '../../entities/hero';

@Component({
  selector: 'app-formation',
  standalone: true,
  imports: [ CommonModule, 
    FormsModule,
    CdkDropList,
    CdkDrag
  ],
  templateUrl: './formation.component.html',
  styleUrl: './formation.component.css'
})
export class FormationComponent implements OnInit {
  formationOne: Hero[] = new Array();
  formationTwo: Hero[] = new Array();
  formationThree: Hero[] = new Array();
  formationFour: Hero[] = new Array();
  formationFive: Hero[] = new Array();
  heroes!: Hero[];

  constructor(private heroService:HeroesService) {}

  ngOnInit() {
    this.heroService.getAllHeroesList().subscribe(hero => this.heroes = hero);
  }

  drop(event: CdkDragDrop<Hero[]>) {
    if (event.previousContainer === event.container) {
      moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
    } else {
      transferArrayItem(
        event.previousContainer.data,
        event.container.data,
        event.previousIndex,
        event.currentIndex,
      );
    }
  }

  

}
