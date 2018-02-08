import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RouterModule, Routes} from '@angular/router';
import { AppComponent } from './app.component';
import { CampusmindComponent } from './campusmind/campusmind.component';
import { CapabilityComponent } from './capability/capability.component';
import { TrackComponent } from './track/track.component';
import { MappingComponent } from './mapping/mapping.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewmindComponent } from './viewmind/viewmind.component';
import { ViewcapabilityComponent } from './viewcapability/viewcapability.component';
import { ViewtrackComponent } from './viewtrack/viewtrack.component';
import { AddmindComponent } from './addmind/addmind.component';
import { AddcapabilityComponent } from './addcapability/addcapability.component';
import { AddtrackComponent } from './addtrack/addtrack.component';
import { FormsModule } from "@angular/forms";


const routes: Routes = [
   { path: '', component: LoginComponent },

    { path: 'campusmind', component: CampusmindComponent, 
    children:[{path : 'viewmind', component:ViewmindComponent}, 
     {path : 'addmind', component:AddmindComponent}] },

     { path: 'capability', component: CapabilityComponent,
    children:[{path : 'viewcapability', component:ViewcapabilityComponent},
     {path : 'addcapability', component:AddcapabilityComponent}] },

      { path: 'track', component: TrackComponent,
    children:[{path : 'viewtrack', component:ViewtrackComponent},
    {path : 'addtrack', component:AddtrackComponent}] },

     { path: 'mapping', component: MappingComponent },
     
];


@NgModule({
  declarations: [
    AppComponent,
    CampusmindComponent,
    CapabilityComponent,
    TrackComponent,
    MappingComponent,
    LoginComponent,
    ViewmindComponent,
    ViewcapabilityComponent,
    ViewtrackComponent,
    AddmindComponent,
    AddcapabilityComponent,
    AddtrackComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
