import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Portfolio } from '../portfolio';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl = 'http://localhost:8084'

  constructor( private http:HttpClient) { }

  getPortfolio(){
    return this.http.get(`${this.baseUrl}/calculateNetworth/viewAsset`)
  }
}
