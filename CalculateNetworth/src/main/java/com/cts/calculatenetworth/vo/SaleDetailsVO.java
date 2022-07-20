package com.cts.calculatenetworth.vo;

import lombok.Data;

@Data
public class SaleDetailsVO {
	private String assetName;
	private int soldUnits;
	public SaleDetailsVO() {
		super();
	}
	
	public SaleDetailsVO(String assetName, int soldUnits) {
		super();
		this.assetName = assetName;
		this.soldUnits = soldUnits;
	}

	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getSoldUnits() {
		return soldUnits;
	}
	public void setSoldUnits(int soldUnits) {
		this.soldUnits = soldUnits;
	}
	

}
