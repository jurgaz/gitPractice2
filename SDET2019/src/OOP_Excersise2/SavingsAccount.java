package OOP_Excersise2;

public class SavingsAccount extends Customer {
	
	private double savingBalance;
	
	
	public SavingsAccount() {
		super();                  //super referring to parent class (calls method from the parent class)
	this.savingBalance = 0.0;
	
	}
	
	public SavingsAccount(double savingBalance, String firstName, String LastName, int id) {
		super(firstName, LastName, id); //super referring to parent class (calls method from the parent class)
		
		this.savingBalance = savingBalance;
	}
		
	public double getSavingsBalance () {   //this is a new method belonging to this class
		return savingBalance;
	}
	
	public String getFirstName() {         //green arrow means you're overriding method from the parent class
						
			System.out.println("child class");
			return super.getFirstName();   //returns the value from parent class
		}
		
	}
	
		
//	public static void main(String[] args) {
//		
//		SavingsAccount acc = new SavingsAccount();     // works without local constructor method (pulls the automatic one) and values from parent class
//		acc.setFirstName("David");
//		System.out.println(acc.getFirstName());
	
		
		
	


