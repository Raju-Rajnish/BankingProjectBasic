package com.SBI.Account;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetails {

	private long accNo;
	private String accoutType;
	private BigDecimal principalAmount;
	private BigDecimal interestRate;
	private Date accountOpeningDate;
	
	
	public AccountDetails(long accNo, String accoutType, BigDecimal principalAmount, BigDecimal interestRate,
			Date accountOpeningDate) {
		
		this.accNo = accNo;
		this.accoutType = accoutType;
		this.principalAmount = principalAmount;
		this.interestRate = interestRate;
		this.accountOpeningDate = accountOpeningDate;
	}


	public long getAccNo() {
		return accNo;
	}


	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


	public String getAccoutType() {
		return accoutType;
	}


	public void setAccoutType(String accoutType) {
		this.accoutType = accoutType;
	}


	public BigDecimal getPrincipalAmount() {
		return principalAmount;
	}


	public void setPrincipalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
	}


	public BigDecimal getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}


	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}


	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}


	@Override
	public String toString() {
		return "AccountDetails [accNo=" + accNo + ", accoutType=" + accoutType + ", principalAmount=" + principalAmount
				+ ", interestRate=" + interestRate + ", accountOpeningDate=" + accountOpeningDate + "]";
	}
	
	
	
	

}	
	