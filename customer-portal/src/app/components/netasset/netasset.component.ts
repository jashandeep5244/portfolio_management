import { Component, OnInit } from '@angular/core';

import { Portfolio } from 'src/app/portfolio';
import { UserService } from 'src/app/services/user.service';
import { AllMutualFund } from 'src/app/model/availablemutualfund';
import { AllStock } from 'src/app/model/availablestock';
import { LoginService } from '../../services/login.service';
import { MutualfundserviceService } from '../../services/mutualfundservice.service';
import { StockserviceService } from '../../services/stockservice.service';

@Component({
  selector: 'app-netasset',
  templateUrl: './netasset.component.html',
  styleUrls: ['./netasset.component.css']
})
export class NetassetComponent implements OnInit {


  token: string | null = ""
  allMutualFund: AllMutualFund[]=[]
  allStock: AllStock[]=[]

  constructor(private loginService:LoginService,private mfservice:MutualfundserviceService,private sdService:StockserviceService) { }

  ngOnInit(): void {
    this.getAllMutualFundDetails();
    this.getAllStockDetail();
  }
  getAllMutualFundDetails()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.mfservice.getAllMutualFund().subscribe((data: AllMutualFund[])=>
      {
        console.log(data);
       this.allMutualFund=data
      },
      (error:any)=>
      {
        console.log(error);

      });

    }
  }

  getAllStockDetail()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.sdService.getAllStockDetails().subscribe((data: AllStock[])=>
      {
        console.log(data);
       this.allStock=data
      },
      (error:any)=>
      {
        console.log(error);

      });

    }

  }

}
