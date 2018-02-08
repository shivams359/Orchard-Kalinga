import { Component, OnInit } from '@angular/core';
import { HttpClientModule, HttpClient, } from '@angular/common/http';

@Component({
  selector: 'app-viewmind',
  templateUrl: './viewmind.component.html',
  styleUrls: ['./viewmind.component.css']
})
export class ViewmindComponent implements OnInit {

  constructor(private http : HttpClient) { }

  campusmind:any;
  
  fetchData() {
    this.http.get("http://localhost:8080/updatedelete/getCampusMind").subscribe(
      res => {
        this.campusmind = res;
        console.log(this.campusmind);
      });
  }

  ngOnInit() {
    this.fetchData();
  }

}
