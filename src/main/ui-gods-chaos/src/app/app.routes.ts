import { Routes } from '@angular/router';
import { HeroListComponent } from './components/hero-list/hero-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { AppComponent } from './app.component';
import { CollectionListComponent } from './components/collection-list/collection-list.component';
import { FormationComponent } from './components/formations/formation.component';
import { AbilitiesComponent } from './components/abilities/abilities.component';

export const routes: Routes = [
    { path: '', component: WelcomeComponent },
    { path: 'home', component: WelcomeComponent },
    { path: 'heroes', component: HeroListComponent },
    { path: 'collections', component: CollectionListComponent},
    { path: 'formations', component: FormationComponent},
    { path: 'abilities', component: AbilitiesComponent},
];
