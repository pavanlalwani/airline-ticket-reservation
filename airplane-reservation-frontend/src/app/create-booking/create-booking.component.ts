import { Component, OnInit } from '@angular/core';
import { Booking } from '../model/booking.component';
import { BookingService } from '../services/booking.service';
import { Router } from '@angular/router';
import {NgbDateStruct} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-create-booking',
  templateUrl: './create-booking.component.html',
  styleUrls: ['./create-booking.component.css']
})
export class CreateBookingComponent implements OnInit {
  // model: NgbDateStruct;

  booking: Booking={"bookingId": null, "departDate":"", "sourceAirport":"", "destinationAirport": "","noOfPassengers": null};

  submitted = false;
  constructor(private bookingService: BookingService, private router: Router) { }

  ngOnInit(): void {
  }

  newBooking(): void {
    this.submitted = false;
    this.booking = new Booking();
  }

  save() {
    this.bookingService.createBooking(this.booking)
    .subscribe(data => console.log(data),
    error => console.log(error));
    this.booking = new Booking();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/bookings']);
  }

}
