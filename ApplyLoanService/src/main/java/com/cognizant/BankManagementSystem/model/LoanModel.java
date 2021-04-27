package com.cognizant.BankManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@NoArgsConstructor
@AllArgsConstructor
public class LoanModel {

	@Id
	private int loanId;
	private String PAN;
	private String loanType;
	private int loanAmount;
	private int monthlyIncome;
	private int roi;
	private int duration;
	
	
	
	public LoanModel() {
		super();
	}
	public LoanModel(int loanId, String PAN, String loanType, int loanAmount, int monthlyIncome, int roi,
			int duration) {
		super();
		this.loanId = loanId;
		this.PAN = PAN;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.monthlyIncome = monthlyIncome;
		this.roi = roi;
		this.duration = duration;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String PAN) {
		this.PAN = PAN;
	}

	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public int getRoi() {
		return roi;
	}
	public void setRoi(int roi) {
		this.roi = roi;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
}
