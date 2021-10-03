package com.SBI.CreditInterest;
import java.util.Date;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.SBI.Account.AccountDetails;


public class InterestCalculator {


	public static void main(String args[]) throws ParseException 
	{

		List<Customer> customerList = createCustomer();
		for(Customer customer:customerList) {
			for(AccountDetails accountDetails: customer.getAccountList()) {

				getSimpleInterestOfAccount(accountDetails, accountDetails.getAccoutType(), customer.getCustomerName());

				getCompoundInterestOfAccount(accountDetails, accountDetails.getAccoutType(), customer.getCustomerName());

				

			}
		}

	}


	public static List<Customer> createCustomer() throws ParseException {

		//**************fetching date of account opening **************//

		Date savingAccOpendtDate1 = getNewInstanceOfDate("2015-04-11");
		Date currAccOpendt1 = getNewInstanceOfDate("2015-04-21");
		Date savingAccOpendtDate2 = getNewInstanceOfDate("2015-03-20"); 
		Date currAccOpendt2 = getNewInstanceOfDate("2015-07-17"); 

		//**************account details of customer1**************//
		AccountDetails account1 = new AccountDetails(234561L, "saving", BigDecimal.valueOf(100), BigDecimal.valueOf(10),savingAccOpendtDate1);
		AccountDetails account2 = new AccountDetails(234562L, "current", BigDecimal.valueOf(1000), BigDecimal.valueOf(12), currAccOpendt1);
		//**************account details of customer2**************//
		AccountDetails account3 = new AccountDetails(586271L, "saving", BigDecimal.valueOf(1100), BigDecimal.valueOf(12.26),savingAccOpendtDate2);
		AccountDetails account4 = new AccountDetails(586272L, "current", BigDecimal.valueOf(5000), BigDecimal.valueOf(11.21), currAccOpendt2);

		//**************list of customers**************//
		List<AccountDetails> accountListCust1 =new ArrayList<AccountDetails>();
		accountListCust1.add(account1);
		accountListCust1.add(account2);	

		List<AccountDetails> accountListCust2 = new ArrayList<AccountDetails>();
		accountListCust2.add(account3);
		accountListCust2.add(account4);		

		Customer cust1 = new Customer("Vikas", 234561, 25, 999888777L, "male", accountListCust1);
		Customer cust2= new Customer("Guddi", 852369, 23, 99956487L, "female", accountListCust2);
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(cust1);
		customerList.add(cust2);
		return customerList;

	}

	public static Date getNewInstanceOfDate(String dateString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateString);
		return date;
	}

	public static BigDecimal getNoOfYearsTillTodayBydate(Date accOpeningDate) throws ParseException {
		//**************fetching today's date**************//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date todaysDate = sdf.parse(sdf.format(new Date()));
		BigDecimal yrs = new BigDecimal(TimeUnit.DAYS.convert(Math.abs(todaysDate.getTime() - accOpeningDate.getTime()), TimeUnit.MILLISECONDS)/365); 
		return yrs;
	}

	public static void getSimpleInterestOfAccount(AccountDetails account, String accountType, String customerName) throws ParseException {
		BigDecimal simpleInterestCalculated = account.getPrincipalAmount().multiply(account.getInterestRate()).multiply(getNoOfYearsTillTodayBydate(account.getAccountOpeningDate())).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
		System.out.println("Simple Interest for " + customerName + " of account Type " + accountType +" is "+ simpleInterestCalculated);
	}
	public static void getCompoundInterestOfAccount(AccountDetails account, String accountType, String customerName) throws ParseException {
		BigDecimal compoundInterestCalculated = account.getPrincipalAmount().multiply(new BigDecimal(Math.pow(account.getInterestRate().divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP).doubleValue() , getNoOfYearsTillTodayBydate(account.getAccountOpeningDate()).doubleValue()))).setScale(4, RoundingMode.HALF_UP);
		System.out.println("Compound Interest for " + customerName + " of account Type " + accountType +" is "+ compoundInterestCalculated);
	}
}