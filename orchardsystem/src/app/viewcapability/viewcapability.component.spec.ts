import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewcapabilityComponent } from './viewcapability.component';

describe('ViewcapabilityComponent', () => {
  let component: ViewcapabilityComponent;
  let fixture: ComponentFixture<ViewcapabilityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewcapabilityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewcapabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
