import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-viewcapability',
  templateUrl: './viewcapability.component.html',
  styleUrls: ['./viewcapability.component.css']
})
export class ViewcapabilityComponent implements OnInit {

  constructor(private http : HttpClient) { }

  capability:any;
  
  fetchData() {
    this.http.get("http://localhost:8080/updatedelete/getCapability").subscribe(
      res => {
        this.capability = res;
        console.log(this.capability);
      });
  }

  ngOnInit() {
    this.fetchData();
  }

}
