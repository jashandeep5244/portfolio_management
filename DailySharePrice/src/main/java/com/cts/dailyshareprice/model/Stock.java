package com.cts.dailyshareprice.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocklist")
public class Stock {

	@Id
	private int stockId;
	@Column(unique = true, nullable = false)
	private String stockName;
	private double stockValue;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
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

	public Stock(int stockId, String stockName, double stockValue) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockValue = stockValue;
	}

	public Stock() {
		super();
	}
}
