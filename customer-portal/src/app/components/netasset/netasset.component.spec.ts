import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NetassetComponent } from './netasset.component';

describe('NetassetComponent', () => {
  let component: NetassetComponent;
  let fixture: ComponentFixture<NetassetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NetassetComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NetassetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
