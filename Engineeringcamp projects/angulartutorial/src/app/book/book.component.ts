import { Component, OnInit } from '@angular/core';
import {MyserviceService} from '../myservice.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  constructor(private _myservice: MyserviceService) { }
  printName(){
    this._myservice.printMyName('Ramu');
  }

  ngOnInit() {
  }

}
