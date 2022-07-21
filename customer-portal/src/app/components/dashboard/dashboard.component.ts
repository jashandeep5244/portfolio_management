import { Component, OnInit } from '@angular/core';
import { MutalFund } from 'src/app/mutal-fund';
import { Portfolio } from 'src/app/portfolio';
import { UserService } from 'src/app/services/user.service';
import { Stock } from 'src/app/stock';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit{

  portfolio : any;
  mutalfunds : any;
  stocks : any;
 


  constructor( private userService:UserService) { }

  ngOnInit(): void {
    this.getPortfolio();
  }

   getPortfolio(){
    this.userService.getPortfolio().subscribe(data =>{
      this.portfolio = data;
      this.mutalfunds = this.portfolio.mutualFundList;
      this.stocks = this.portfolio.stockDetailList;
      console.log(this.portfolio);
      console.log(this.portfolio.mutualFundList);
      console.log(this.portfolio.stockDetailList);
    }

    )
  }


}
