import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  viewScheduledFlight(): void{
    this.router.navigate(['customerShowScheduledFlights']);
  }

  viewAirport(): void{
    this.router.navigate(['customerShowAirports']);
  }
  createBooking(): void{
    this.router.navigate(['addBooking']);
  }

  readAllBooking(): void{
    this.router.navigate(['bookings']);
  }
  
}
