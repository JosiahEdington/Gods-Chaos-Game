import { Component } from '@angular/core';
import { Hero } from '../../entities/hero';
import { CommonModule } from '@angular/common';
import { HeroesService } from '../../services/heroes.service';
import { CollectionService } from '../../services/collection.service';
import { CollectedHero } from '../../entities/collected-hero';
import { Collection } from '../../entities/collection';

@Component({
  selector: 'app-collection-list',
  standalone: true,
  imports: [ CommonModule ],
  templateUrl: './collection-list.component.html',
  styleUrl: './collection-list.component.css'
})
export class CollectionListComponent {
  collections!: Collection[];
  collectedHeroes!: CollectedHero[];
  filteredCollections!: Collection[];
  filteredCollectedHeroes!: CollectedHero[];

  // Filters
  username: string = 'Tester';
  sortBy: string = 'Default';

  constructor(private collectionService:CollectionService) {}

  ngOnInit() {
    this.getCollection();
  }

  getCollection() {
    this.collectionService.getCollection().subscribe(collection => {
      this.collections = collection;
      this.filteredCollections = collection;
    }
    )
  }

  filterCollection(theUsername:string) {
    this.filteredCollections = this.collections.filter( collection => {
      if (this.username !== collection.player.username) {
        return false;
      }
      return true;
    });
  }

}
