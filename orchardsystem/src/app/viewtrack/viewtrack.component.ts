import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-viewtrack',
  templateUrl: './viewtrack.component.html',
  styleUrls: ['./viewtrack.component.css']
})
export class ViewtrackComponent implements OnInit {

  constructor(private http : HttpClient) { }

  track:any;
  
  fetchData() {
    this.http.get("http://localhost:8080/omsproject/getTrack").subscribe(
      res => {
        this.track = res;
        console.log(this.track);
      });
  }

  ngOnInit() {
    this.fetchData();
  }

}
