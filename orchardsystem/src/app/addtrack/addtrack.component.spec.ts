import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddtrackComponent } from './addtrack.component';

describe('AddtrackComponent', () => {
  let component: AddtrackComponent;
  let fixture: ComponentFixture<AddtrackComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddtrackComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddtrackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
