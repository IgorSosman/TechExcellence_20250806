import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HomeComponent} from "./home/home.component";
import {CatalogComponent} from "./catalog/catalog.component";
import {SiteHeaderComponent} from "./site-header/site-header.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, HomeComponent, CatalogComponent, SiteHeaderComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
}
