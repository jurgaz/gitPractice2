package Study_Group;

public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	public Account ( String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		
		this.customerPhoneNumber = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	

}
