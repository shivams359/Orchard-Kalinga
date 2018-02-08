import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import {MyserviceService } from './myservice.service';


@NgModule({
  declarations: [
    AppComponent,
    BookComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [
  MyserviceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
