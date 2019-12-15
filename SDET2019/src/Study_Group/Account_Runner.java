package Study_Group;

public class Account_Runner {

	
		
	public class Main{

		public static void main(String[] args) {
			
			
			// when we call new Account that is actually a constructor
			
			Account bobsAccount = new Account();//("12345",0.00,"Bob Brown", " 571 290 9548", "Khan@gmail.com");
			// when creating this object its executing that empty constructor that we created
			
			// to confirm that 
			System.out.println(bobsAccount.getCustomerName());
			System.out.println(bobsAccount.getBalance());
			
			// we don't need the below initialization after the constructor is created
			/*
			 * bobsAccount.setNumber("12345"); bobsAccount.setBalance(0.00);
			 * bobsAccount.setCustomerName("Bob Brown");
			 * bobsAccount.setCustomerPhoneNumber("571 290 9548");
			 * bobsAccount.setCustomerEmailAddress("khan@gmail.com");
			 * 
			 */
			
			
			
			bobsAccount.withdrawal(100.0);
			
			bobsAccount.deposit(50.0);

			bobsAccount.withdrawal(100.0);
			bobsAccount.deposit(51.0);
			bobsAccount.withdrawal(100.0);
		}

	}

