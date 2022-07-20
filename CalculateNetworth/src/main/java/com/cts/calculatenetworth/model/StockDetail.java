package com.cts.calculatenetworth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(name="stockdetail")
public class StockDetail {
	

	@Id
	@Column(name="st_id")
	private int stId;
	@Column(name="stock_name")
	private String stockName;
	@Column(name="stock_count")
	private int stockCount;
	
	@ManyToOne
	@JoinColumn(name="portfolio_id")
	@JsonBackReference
	private PortfolioDetails portfolioDetails;
	
	
	
	public StockDetail() {
		super();
	}



	public StockDetail(int stId, String stockName, int stockCount) {
		super();
		this.stId = stId;
		this.stockName = stockName;
		this.stockCount = stockCount;
	}



	public StockDetail(int stId, String stockName, int stockCount, PortfolioDetails portfolioDetails) {
		super();
		this.stId = stId;
		this.stockName = stockName;
		this.stockCount = stockCount;
		this.portfolioDetails = portfolioDetails;
	}



	public int getStId() {
		return stId;
	}



	public void setStId(int stId) {
		this.stId = stId;
	}



	public String getStockName() {
		return stockName;
	}



	public void setStockName(String stockName) {
		this.stockName = stockName;
	}



	public int getStockCount() {
		return stockCount;
	}



	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}



	public PortfolioDetails getPortfolioDetails() {
		return portfolioDetails;
	}



	public void setPortfolioDetails(PortfolioDetails portfolioDetails) {
		this.portfolioDetails = portfolioDetails;
	}



	@Override
	public String toString() {
		return "StockDetail [stId=" + stId + ", stockName=" + stockName + ", stockCount=" + stockCount
				+ ", portfolioDetails=" + portfolioDetails + "]";
	}
	
	
	
	
}
