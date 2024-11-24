import { Component, OnInit } from '@angular/core';
import { HomeService } from '../../services/home.service';

@Component({
  selector: 'app-welcome',
  standalone: true,
  imports: [],
  templateUrl: './welcome.component.html',
  styleUrl: './welcome.component.css'
})
export class WelcomeComponent implements OnInit {
  welcomeMessage!: string;

  ngOnInit(): void {
    this.getWelcomeMessage();
  }

  constructor(private homeService: HomeService) {}

  getWelcomeMessage() {
    this.homeService.getWelcomeMessage();
    
  }

}
