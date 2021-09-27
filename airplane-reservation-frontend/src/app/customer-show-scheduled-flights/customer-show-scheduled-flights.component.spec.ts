import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerShowScheduledFlightsComponent } from './customer-show-scheduled-flights.component';

describe('CustomerShowScheduledFlightsComponent', () => {
  let component: CustomerShowScheduledFlightsComponent;
  let fixture: ComponentFixture<CustomerShowScheduledFlightsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerShowScheduledFlightsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerShowScheduledFlightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
