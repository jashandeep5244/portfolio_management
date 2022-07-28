import { NgIf } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service'
import { Router, RouterModule, Routes } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  loggedIn = false;

  constructor(private loginservice:LoginService,private router: Router) { }

  ngOnInit(): void {
    this.loggedIn = this.loginservice.isLoggedIn()
    if(this.loggedIn) {
      this.router.navigate(['/dashboard']);
    }
  }

}
