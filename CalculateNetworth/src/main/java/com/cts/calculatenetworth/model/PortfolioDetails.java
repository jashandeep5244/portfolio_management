package com.cts.calculatenetworth.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="portfolio")
public class PortfolioDetails {
	
	@Id
	@GeneratedValue
	@Column(name="portfolio_id") 
	private Integer portfolioid;
	
	@JsonManagedReference
	@OneToMany(mappedBy="portfolioDetails",cascade={CascadeType.MERGE},fetch=FetchType.LAZY)
	private List<StockDetail> stockDetailList=new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy="portfolioDetails",cascade={CascadeType.MERGE},fetch=FetchType.LAZY)
	private List<MutualFund> mutualFundList=new ArrayList<>();

	public PortfolioDetails() {
		super();
	}

	public PortfolioDetails(Integer portfolioid, List<StockDetail> stockDetailList, List<MutualFund> mutualFundList) {
		super();
		this.portfolioid = portfolioid;
		this.stockDetailList = stockDetailList;
		this.mutualFundList = mutualFundList;
	}

	public Integer getPortfolioid() {
		return portfolioid;
	}

	public void setPortfolioid(Integer portfolioid) {
		this.portfolioid = portfolioid;
	}

	public List<StockDetail> getStockDetailList() {
		return stockDetailList;
	}

	public void setStockDetailList(List<StockDetail> stockDetailList) {
		this.stockDetailList = stockDetailList;
	}

	public List<MutualFund> getMutualFundList() {
		return mutualFundList;
	}

	public void setMutualFundList(List<MutualFund> mutualFundList) {
		this.mutualFundList = mutualFundList;
	}

	@Override
	public String toString() {
		return "PortfolioDetails [portfolioid=" + portfolioid + ", stockDetailList=" + stockDetailList
				+ ", mutualFundList=" + mutualFundList + "]";
	}
	
	
	
	
}
