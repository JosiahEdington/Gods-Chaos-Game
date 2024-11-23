import { Component, OnInit } from '@angular/core';
import { Hero } from '../entities/Hero';
import { HttpClient } from '@angular/common/http';
import { Location, LocationStrategy } from '@angular/common';

@Component({
  selector: 'app-hero-list',
  standalone: true,
  imports: [],
  templateUrl: './hero-list.component.html',
  styleUrl: './hero-list.component.css'
})
export class HeroListComponent implements OnInit {
  
  private heroURL:string='http://localhost:8080';
  heroes!: Hero[];
  

  ngOnInit() {
    this.
  }


}
