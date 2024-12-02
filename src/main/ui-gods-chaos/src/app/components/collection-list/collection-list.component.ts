import { Component } from '@angular/core';
import { Hero } from '../../entities/hero';
import { FormsModule, NgModel } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HeroesService } from '../../services/heroes.service';
import { CollectionService } from '../../services/collection.service';
import { CollectedHero } from '../../entities/collected-hero';
import { Collection } from '../../entities/collection';
import { Player } from '../../entities/player';

@Component({
  selector: 'app-collection-list',
  standalone: true,
  imports: [ CommonModule,
    FormsModule,
  ],
  templateUrl: './collection-list.component.html',
  styleUrl: './collection-list.component.css'
})
export class CollectionListComponent {
  collections!: Collection[];
  collectedHeroes!: CollectedHero[];
  
  player!:Player;
  filteredCollection!: Collection[];

  // Filters
  username: string = '';
  sortBy: string = 'Default';

  constructor(private collectionService:CollectionService) {}

  ngOnInit() {
    this.getCollection();
  }

  getCollection() {
    this.collectionService.getCollection().subscribe(collection => this.collections = collection);
    }

  updateUsername(theUsername:string): void {
    this.username = theUsername;
    this.filteredCollection = this.collections.filter(collection => collection.player.username.includes(this.username));
  }


  sortByField(sortBy:string) {
    this.sortBy = sortBy;


    switch(sortBy) {
      case "Default": 
        console.log("Default");
        break;
      case "Name": 
        console.log("Name");
        break;
      case "Culture": 
        console.log("Culture");
        break;
      case "Power":
        console.log("Power");
        break;
      case "Level":
        console.log("Level");
        break;
      case "Star":
        console.log("Star");
        break;
    }
      
  }

}
