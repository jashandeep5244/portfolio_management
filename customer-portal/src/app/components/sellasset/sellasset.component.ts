import { Component, OnInit } from '@angular/core';
import { AssetSaleResponse } from 'src/app/model/assetSaleResponse';
import { Portfolio } from 'src/app/model/portfolio';
import { SaleAsset } from 'src/app/model/saleasset';
import { CalculatenetworthserviceService } from 'src/app/services/calculatenetworthservice.service';
import { LoginService } from 'src/app/services/login.service';

import { timer } from 'rxjs';
import { Router } from '@angular/router';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-sellasset',
  templateUrl: './sellasset.component.html',
  styleUrls: ['./sellasset.component.css']
})
export class SellassetComponent implements OnInit {

  constructor(private calculatedNetService:CalculatenetworthserviceService,
    private loginService:LoginService,private router: Router,private snackBar:MatSnackBar) { }

    flag: boolean=false
    message: string=""
    saleAsset:SaleAsset[]=[]
    panelOpenState = false;
    token: string | null = ""
    assetSaleResponse:AssetSaleResponse={
      saleStatus: false, networth: 0,
      map: new Map()
    }
    portfolioResponse: Portfolio={portfolioid:0,stockDetailList:[],mutualFundList:[]};


  ngOnInit(): void {
    this.flag=true
    this.getAsset()
  }

  sellAsset()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.calculatedNetService.sellAsset(this.saleAsset).subscribe((data:AssetSaleResponse)=>
      {
        console.log(data);
        this.assetSaleResponse=data;
        if(this.saleAsset.length > 0){
          console.log( this.saleAsset.length)
          
          // let snackBarRef = this.snackBar.open('Assests are sold successfully', 'OK');
          // snackBarRef.afterDismissed().subscribe(() => {
          //   console.log('The snackbar was dismissed');
          //   this.router.navigate(['/dashboard'])
          // });

          alert('Assests are sold successfully')
            this.router.navigate(['/dashboard'])
      }else{
        alert('No assets selected')
      }
      },
      (error:any)=>
      {
        console.log(error);
      });
   }
  }

  getAsset()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.calculatedNetService.getAsset().subscribe((data:Portfolio)=>
      {
        console.log(data);
        this.portfolioResponse= data;
        this.saleAsset=[]

      },
      (error:any)=>
      {
        console.log(error);
        this.message=error.message
      });
  }
  }

  add(e:SaleAsset){
    this.saleAsset.push(e)
  }
  remove(e:string){
    this.saleAsset.splice(this.getIndexByname(e),1)
  }
  getIndexByname(name:string){
    for(let i=0;i<this.saleAsset.length;i++){
      if(this.saleAsset[i].assetName.match(name)){
        return i;
      }
    }
    return -1;
  }
}

