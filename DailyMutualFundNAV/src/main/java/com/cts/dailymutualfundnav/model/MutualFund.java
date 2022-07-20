package com.cts.dailymutualfundnav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="mutualfund")
public class MutualFund {
	
	@Id
	private int mutualFundId;
	@Column(unique = true, nullable = false)
	private String mutualFundName;
	private double mutualFundValue;
	public MutualFund() {
		super();
	}
	public MutualFund(int mutualFundId, String mutualFundName, double mutualFundValue) {
		super();
		this.mutualFundId = mutualFundId;
		this.mutualFundName = mutualFundName;
		this.mutualFundValue = mutualFundValue;
	}
	public int getMutualFundId() {
		return mutualFundId;
	}
	public void setMutualFundId(int mutualFundId) {
		this.mutualFundId = mutualFundId;
	}
	public String getMutualFundName() {
		return mutualFundName;
	}
	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}
	public double getMutualFundValue() {
		return mutualFundValue;
	}
	public void setMutualFundValue(double mutualFundValue) {
		this.mutualFundValue = mutualFundValue;
	}
	@Override
	public String toString() {
		return "MutualFund [mutualFundId=" + mutualFundId + ", mutualFundName=" + mutualFundName + ", mutualFundValue="
				+ mutualFundValue + "]";
	}

	
}
