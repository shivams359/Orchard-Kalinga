import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-addcapability',
  templateUrl: './addcapability.component.html',
  styleUrls: ['./addcapability.component.css']
})
export class AddcapabilityComponent implements OnInit {
   var1;
   var2;

  constructor(private http : HttpClient) { }

  addData() {
  
  
    this.http.post("http://localhost:8080/updatedelete/addCapability",{"name":this.var2,"mid":this.var1}).subscribe(
      res => {
        //this.campusMind = res;
      });
  }

  ngOnInit() {
  }

}
