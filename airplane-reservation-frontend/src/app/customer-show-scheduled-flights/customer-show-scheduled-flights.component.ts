import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ScheduledFlightService } from '../services/scheduled-flight.service';
import { ScheduledFlight } from '../model/scheduled-flight';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-customer-show-scheduled-flights',
  templateUrl: './customer-show-scheduled-flights.component.html',
  styleUrls: ['./customer-show-scheduled-flights.component.css']
})
export class CustomerShowScheduledFlightsComponent implements OnInit {
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;
  scheduleFlights: Observable<ScheduledFlight[]>;

  constructor(private router: Router, private service: ScheduledFlightService) { }

  ngOnInit(): void {
    this.service.showScheduleFlights().subscribe(
      (data:Observable<ScheduledFlight[]>)=>this.scheduleFlights=data
    );
  }

  view(){

    this.router.navigate(['/scheduledFlight/show']);

  }

  search(){

    this.router.navigate(['/scheduledFlight/search']);

  }

}
