import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CampusmindComponent } from './campusmind.component';

describe('CampusmindComponent', () => {
  let component: CampusmindComponent;
  let fixture: ComponentFixture<CampusmindComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CampusmindComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CampusmindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
