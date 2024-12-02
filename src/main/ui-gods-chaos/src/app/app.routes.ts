import { Routes } from '@angular/router';
import { HeroListComponent } from './components/hero-list/hero-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { AppComponent } from './app.component';
import { CollectionListComponent } from './components/collection-list/collection-list.component';
import { FormationComponent } from './components/formation/formation.component';

export const routes: Routes = [
    { path: '', component: WelcomeComponent },
    { path: 'home', component: WelcomeComponent },
    { path: 'heroes', component: HeroListComponent },
    { path: 'collection', component: CollectionListComponent},
    { path: 'formation', component: FormationComponent},
];
