import { Component } from '@angular/core';
import { Hero } from '../../entities/hero';

@Component({
  selector: 'app-hero',
  standalone: true,
  imports: [],
  templateUrl: './hero.component.html',
  styleUrl: './hero.component.css'
})
export class HeroComponent {
  hero!:Hero;

}

