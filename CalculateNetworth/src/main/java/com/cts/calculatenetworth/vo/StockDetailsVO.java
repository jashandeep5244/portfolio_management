package com.cts.calculatenetworth.vo;




public class StockDetailsVO {
	private Integer stockId;
	private String stockName;
	private double stockValue;
	public StockDetailsVO() {
		super();
	}
	public StockDetailsVO(Integer stockId, String stockName, double stockValue) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockValue = stockValue;
	}
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getStockValue() {
		return stockValue;
	}
	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}
	
	
}
