package com.cts.calculatenetworth.vo;




public class MutualFundVO {
	private Integer mutualFundId;
	private String mutualFundName;
	private double mutualFundValue;
	public MutualFundVO() {
		super();
	}
	public MutualFundVO(Integer mutualFundId, String mutualFundName, double mutualFundValue) {
		super();
		this.mutualFundId = mutualFundId;
		this.mutualFundName = mutualFundName;
		this.mutualFundValue = mutualFundValue;
	}
	public Integer getMutualFundId() {
		return mutualFundId;
	}
	public void setMutualFundId(Integer mutualFundId) {
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
	
}
