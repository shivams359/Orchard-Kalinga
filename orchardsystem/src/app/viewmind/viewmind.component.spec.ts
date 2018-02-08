import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewmindComponent } from './viewmind.component';

describe('ViewmindComponent', () => {
  let component: ViewmindComponent;
  let fixture: ComponentFixture<ViewmindComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewmindComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewmindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
