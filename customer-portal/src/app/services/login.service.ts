import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url="http://localhost:8081"

  constructor(private http:HttpClient) { }

  //calling the server to generate the token
  generateToken(credentials:any){
    
    return this.http.post(`${this.url}/getToken`,credentials)
  }

  //for login user
  loginUser(token:string)
  {
    localStorage.setItem("token",token);
    return true;
  }

  //to check the user is logged in or not
  isLoggedIn()
  {
    let token = localStorage.getItem("token");
    if(token==undefined || token==='' || token ==null){
      return false;
    }
    else{
      return true;
    }
  }

  //to logout the user
  logout(){
    localStorage.removeItem('token');
    return true;
  }
  // for getting the token
  getToken(){
    return localStorage.getItem("token");
  }

}
