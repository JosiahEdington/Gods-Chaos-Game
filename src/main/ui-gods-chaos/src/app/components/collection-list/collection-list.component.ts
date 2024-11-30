import { Component } from '@angular/core';
import { Hero } from '../../entities/hero';
import { CommonModule } from '@angular/common';
import { HeroesService } from '../../services/heroes.service';

@Component({
  selector: 'app-collection-list',
  standalone: true,
  imports: [ CommonModule ],
  templateUrl: './collection-list.component.html',
  styleUrl: './collection-list.component.css'
})
export class CollectionListComponent {
  heroes!: Hero[];
  userName: string = 'Mac N Choices';

  constructor(private heroService:HeroesService) {}

  ngOnInit() {
    this.getCollection(this.userName);
  }

  getCollection(theUsername:string) {
    this.heroService.getCollectionList(theUsername).subscribe(
      hero => this.heroes = hero
    )
  }

}
