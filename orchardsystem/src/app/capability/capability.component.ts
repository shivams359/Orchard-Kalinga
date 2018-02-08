import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-capability',
  templateUrl: './capability.component.html',
  styleUrls: ['./capability.component.css']
})
export class CapabilityComponent implements OnInit {

  constructor(private http : HttpClient) { }

  ngOnInit() {
  }

}
