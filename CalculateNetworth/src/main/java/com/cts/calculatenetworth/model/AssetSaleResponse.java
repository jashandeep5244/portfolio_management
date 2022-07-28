package com.cts.calculatenetworth.model;

import java.util.HashMap;
import java.util.Map;



public class AssetSaleResponse {
	
	private Boolean saleStatus;
	private Double networth;
	private Map<String, Integer> map = new HashMap<>();
	public AssetSaleResponse() {
		super();
	}
	public AssetSaleResponse(Boolean saleStatus, Double networth, Map<String, Integer> map) {
		super();
		this.saleStatus = saleStatus;
		this.networth = networth;
		this.map = map;
	}
	public Boolean getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(Boolean saleStatus) {
		this.saleStatus = saleStatus;
	}
	public Double getNetworth() {
		return networth;
	}
	public void setNetworth(Double networth) {
		this.networth = networth;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "AssetSaleResponse [saleStatus=" + saleStatus + ", networth=" + networth + ", map=" + map + "]";
	}
	
	

}
