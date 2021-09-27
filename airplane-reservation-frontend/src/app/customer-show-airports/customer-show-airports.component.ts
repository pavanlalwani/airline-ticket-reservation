import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Airport } from '../model/airport.component';
import { AirportService } from '../services/airport.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-show-airports',
  templateUrl: './customer-show-airports.component.html',
  styleUrls: ['./customer-show-airports.component.css']
})
export class CustomerShowAirportsComponent implements OnInit {
  airports: Observable<Airport[]>;
  constructor(private airportService: AirportService,
  private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData()
  {
    this.airports=this.airportService.viewAllAirport();
  }

}
