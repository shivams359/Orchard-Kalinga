import { Injectable } from '@angular/core';

@Injectable()
export class MyserviceService {

  constructor() { }
  printMyName(str){
    console.log(str);
  }

}
