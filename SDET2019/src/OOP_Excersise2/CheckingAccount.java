package OOP_Excersise2;

public class CheckingAccount extends Customer {
	
	private double checkingBalance;
	private int id;

	public CheckingAccount(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
		
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	}
	
	
	
	
	
	

