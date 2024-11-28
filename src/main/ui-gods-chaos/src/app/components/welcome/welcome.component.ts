import { Component, OnInit } from '@angular/core';
import { AppResponseService } from '../../services/app-responses.service';
import { NavbarComponent } from '../navbar/navbar.component';
import { AppResponses } from '../../entities/app-responses';

@Component({
  selector: 'app-welcome',
  standalone: true,
  imports: [ ],
  templateUrl: './welcome.component.html',
  styleUrl: './welcome.component.css'
})
export class WelcomeComponent implements OnInit {
  appResponse!: AppResponses;

  ngOnInit(): void {
    this.getWelcomeMessage();
  }

  constructor(private responseService: AppResponseService) {}

  getWelcomeMessage() {
    this.responseService.getWelcomeMessage().subscribe(
      message => this.appResponse = message
    );
    
  }

}

