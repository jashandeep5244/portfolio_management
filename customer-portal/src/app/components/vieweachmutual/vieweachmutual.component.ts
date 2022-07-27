import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { MutualFund } from 'src/app/model/mutualfund';
import { SaleAsset } from 'src/app/model/saleasset';

@Component({
  selector: 'app-vieweachmutual',
  templateUrl: './vieweachmutual.component.html',
  styleUrls: ['./vieweachmutual.component.css']
})
export class VieweachmutualComponent implements OnInit {

  chbox:any;

  @Output() addEvent=new EventEmitter()
  @Output() removeEvent=new EventEmitter()
  @Input() mutual:MutualFund={
    mfId: 0, mutualFundName: "", mutualFundUnits: 0,
    currentPrice: 0
  }
  sales:SaleAsset={assetName:"",soldUnits:0}
  @Input() index:number=0
  assetSelected:boolean=false

  constructor() { }

  ngOnInit(): void {
  }

  doOperation(){
    if(this.sales.soldUnits> this.mutual.mutualFundUnits){
      alert('You do not have enough units available to sell')
      this.sales.soldUnits = 0
      console.log('not enough funds')
      if(this.chbox != null){
        this.chbox.checked = true;
        console.log('checked')
      }else{
        this.chbox.checked = false;
        console.log('not checked')
      }
    }else{
    this.assetSelected=!this.assetSelected
    if((this.assetSelected==true)){
      this.sales.assetName=this.mutual.mutualFundName
      this.addEvent.emit(this.sales)
    }else{
      this.sales.soldUnits=0
      this.removeEvent.emit(this.sales.assetName)
    }
  }
}
}
