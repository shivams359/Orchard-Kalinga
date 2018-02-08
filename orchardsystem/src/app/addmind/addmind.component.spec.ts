import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddmindComponent } from './addmind.component';

describe('AddmindComponent', () => {
  let component: AddmindComponent;
  let fixture: ComponentFixture<AddmindComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddmindComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddmindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
