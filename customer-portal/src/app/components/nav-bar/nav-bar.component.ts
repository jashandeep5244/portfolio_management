import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  public loggedIn=false;
  user:any

  constructor(private loginservice:LoginService) { }

  ngOnInit(): void {
    this.loggedIn = this.loginservice.isLoggedIn()
    this.getUsername()
  }
  
  logoutUser()
  {
    this.loginservice.logout()
    location.reload()
  }

  getUsername(){
    this.loginservice.getUsername().subscribe(data =>{
      this.user = data;
      console.log('User'+data);
    }
      )

    
  }

}
