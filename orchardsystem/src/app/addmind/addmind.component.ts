import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-addmind',
  templateUrl: './addmind.component.html',
  styleUrls: ['./addmind.component.css']
})
export class AddmindComponent implements OnInit {
  var1;
  var2;

  constructor(private http : HttpClient) { }

  addData() {
  
  
    this.http.post("http://localhost:8080/updatedelete/addCampusMind",{"name":this.var2,"mid":this.var1}).subscribe(
      res => {
        //this.campusMind = res;
      });
  }

  ngOnInit() {
  }

}
