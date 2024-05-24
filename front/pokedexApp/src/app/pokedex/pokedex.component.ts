import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {
  pokemon: any;
  pokemonId: number = 1;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  searchPokemon() {
    crossOriginIsolated: false;
    this.http.get(`http://18.204.10.132:8080/pokedex/getPokemon/${this.pokemonId}` )
      .subscribe(data => {
        this.pokemon = data;
      });
  }
}