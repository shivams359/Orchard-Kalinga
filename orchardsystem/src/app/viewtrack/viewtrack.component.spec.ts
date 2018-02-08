import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewtrackComponent } from './viewtrack.component';

describe('ViewtrackComponent', () => {
  let component: ViewtrackComponent;
  let fixture: ComponentFixture<ViewtrackComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewtrackComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewtrackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
