import { Component, OnInit } from '@angular/core';
import { HttpClientModule, HttpClient, } from '@angular/common/http';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
@Component({
  selector: 'app-campusmind',
  templateUrl: './campusmind.component.html',
  styleUrls: ['./campusmind.component.css']
})
export class CampusmindComponent implements OnInit {

  constructor(private http : HttpClient) { }
  private headers = new Headers({ 'Content-Type': 'application/json'});

  // campusmind:any;

  // fetchData() {
  //   this.http.get("http://localhost:8080/omsproject/getCampusMind").subscribe(
  //     res => {
  //       this.campusmind = res;
  //       console.log(this.campusmind);
  //     });
  // }

  ngOnInit() {
    // this.fetchData();
  }

 
}

