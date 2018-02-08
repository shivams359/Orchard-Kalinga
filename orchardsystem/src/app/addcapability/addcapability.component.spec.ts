import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcapabilityComponent } from './addcapability.component';

describe('AddcapabilityComponent', () => {
  let component: AddcapabilityComponent;
  let fixture: ComponentFixture<AddcapabilityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddcapabilityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddcapabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
