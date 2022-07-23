package com.cts.calculatenetworth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "mutualfund")
public class MutualFund {

	

	@Id
	@Column(name = "mf_id")
	private Integer mfId;

	@Column(name = "mutual_fund_name")
	private String mutualFundName;
	
	@Column(name = "mutual_fund_units")
	private Integer mutualFundUnits;

	@ManyToOne
	@JoinColumn(name = "portfolio_id")
	@JsonBackReference
	private PortfolioDetails portfolioDetails;
	
	
	
	public MutualFund() {
		super();
	}



	public MutualFund(Integer mfId, String mutualFundName, Integer mutualFundUnits) {
		super();
		this.mfId = mfId;
		this.mutualFundName = mutualFundName;
		this.mutualFundUnits = mutualFundUnits;
	}



	public MutualFund(Integer mfId, String mutualFundName, Integer mutualFundUnits, PortfolioDetails portfolioDetails) {
		super();
		this.mfId = mfId;
		this.mutualFundName = mutualFundName;
		this.mutualFundUnits = mutualFundUnits;
		this.portfolioDetails = portfolioDetails;
	}



	public Integer getMfId() {
		return mfId;
	}



	public void setMfId(Integer mfId) {
		this.mfId = mfId;
	}



	public String getMutualFundName() {
		return mutualFundName;
	}



	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}



	public Integer getMutualFundUnits() {
		return mutualFundUnits;
	}



	public void setMutualFundUnits(Integer mutualFundUnits) {
		this.mutualFundUnits = mutualFundUnits;
	}



	public PortfolioDetails getPortfolioDetails() {
		return portfolioDetails;
	}



	public void setPortfolioDetails(PortfolioDetails portfolioDetails) {
		this.portfolioDetails = portfolioDetails;
	}



	@Override
	public String toString() {
		return "MutualFund [mfId=" + mfId + ", mutualFundName=" + mutualFundName + ", mutualFundUnits="
				+ mutualFundUnits + ", portfolioDetails=" + portfolioDetails + "]";
	}
	
	
	
	

}
