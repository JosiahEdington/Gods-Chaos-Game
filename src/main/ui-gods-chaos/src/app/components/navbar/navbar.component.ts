import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Hero } from '../../entities/hero';
import { HeroesService } from '../../services/heroes.service';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {

}
