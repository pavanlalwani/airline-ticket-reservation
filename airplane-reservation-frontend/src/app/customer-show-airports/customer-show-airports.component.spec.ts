import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerShowAirportsComponent } from './customer-show-airports.component';

describe('CustomerShowAirportsComponent', () => {
  let component: CustomerShowAirportsComponent;
  let fixture: ComponentFixture<CustomerShowAirportsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerShowAirportsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerShowAirportsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
