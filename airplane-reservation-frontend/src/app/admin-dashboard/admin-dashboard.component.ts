import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  addScheduledFlight(): void{
    this.router.navigate(['scheduledFlight/add']);
  }

  viewScheduledFlight(): void{
    this.router.navigate(['scheduledFlight/show']);
  }

  searchScheduledFlight(): void{
      this.router.navigate(['scheduledFlight/search']);
  }

  modifyScheduledFlight(): void{
    this.router.navigate(['scheduledFlight/modify']);
  }

  addFlight(): void{
    this.router.navigate(['addFlight']);
  }

  viewFlight(): void{
    this.router.navigate(['flights']);
  }

  addAirport(): void{
    this.router.navigate(['addAirport']);
  }

  viewAirport(): void{
    this.router.navigate(['airports']);
  }
  

}
