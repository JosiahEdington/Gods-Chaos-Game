import { Component, OnInit } from '@angular/core';
import { Player } from '../../entities/player';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  player!:Player;

  ngOnInit(): void {
      this.getPlayerInfo(this.player);
  }

  getPlayerInfo(player?:Player) {
    
  }

}
