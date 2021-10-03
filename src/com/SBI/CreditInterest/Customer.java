package com.SBI.CreditInterest;

import java.util.List;

import com.SBI.Account.AccountDetails;

public class Customer {

	//attributes
	private String customerName;
	private int customerId;
	private int customerAge;
	private long customerMobile;
	private String customerGender;
	private List<AccountDetails> accountList;
	
	
	public Customer(String customerName, int customerId, int customerAge, long customerMobile, String customerGender,
			List<AccountDetails> accountList) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerAge = customerAge;
		this.customerMobile = customerMobile;
		this.customerGender = customerGender;
		this.accountList = accountList;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public long getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public List<AccountDetails> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<AccountDetails> accountList) {
		this.accountList = accountList;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerAge=" + customerAge
				+ ", customerMobile=" + customerMobile + ", customerGender=" + customerGender + ", accountList="
				+ accountList + "]";
	}
	  
	
	


	
	
	

    
}
