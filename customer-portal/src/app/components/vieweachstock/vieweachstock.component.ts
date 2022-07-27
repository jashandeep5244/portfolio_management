import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { SaleAsset } from 'src/app/model/saleasset';
import { StockDetail } from 'src/app/model/stockdetail';
import { __makeTemplateObject } from 'tslib';

@Component({
  selector: 'app-vieweachstock',
  templateUrl: './vieweachstock.component.html',
  styleUrls: ['./vieweachstock.component.css']
})
export class VieweachstockComponent implements OnInit {

  chbox:any;

  @Output() addEvent=new EventEmitter()
  @Output() removeEvent=new EventEmitter()
  @Input() stock:StockDetail={
    stId: 0, stockName: "", stockCount: 10,
    currentPrice: 0
  }
  //
  btnValue="Add"
  sales:SaleAsset={assetName:"",soldUnits:0}
  assetSelected:boolean=false
  @Input() index:number=0

  constructor() { }

  ngOnInit(): void {
  }


  doOperation(){
    if(this.sales.soldUnits> this.stock.stockCount){
      alert('You do not have enough units available to sell')
      this.sales.soldUnits = 0
      console.log('not enough stocks')
      if(this.chbox != null){
        this.chbox.checked = true;
        console.log('checked')
      }else{
        this.chbox.checked = false;
        console.log('not checked')
      }
    }else{
      this.assetSelected=!this.assetSelected
    if(this.assetSelected==true){
      this.sales.assetName=this.stock.stockName
      this.addEvent.emit(this.sales)
      console.log('add event')
      }
    else{
      this.sales.soldUnits=0
      this.removeEvent.emit(this.sales.assetName)
      console.log('remove event module')
    }

  }
  }
}
