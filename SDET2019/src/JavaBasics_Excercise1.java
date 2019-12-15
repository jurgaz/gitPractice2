
public class JavaBasics_Excercise1 {

	public static void main(String[] args) {

		// create all the variables

		double amount = 10;
		double taxRate = 0.05;
		double discountRate = 0.2;

		// calculate the total, tax amount and discount amount

		double discountAmount = amount * discountRate;
		double taxAmount = amount * taxRate;
		double total = amount - discountAmount + taxAmount;

		String text1 = "\t\t\tTEK School \n\n\t\t\tReceipt\n\n\t\t\tTotal...... " + amount + "\n\t\t\tDiscount... "
				+ discountAmount + "\n\t\t\tTax......... " + taxAmount + ""
				+ "\n\t\t\t*************** \n\t\t\tTotal Amount:.. " + total
				+ "\n\n\t\t\tVisit Our Website\n\t\t\twww.tekschool.com ";
		System.out.println(text1);
		
		String result = 

				  "         Tek School         \n"

				+ "           Receipt          \n"
				+ "\nAmount ................. " + amount + "$"
				+ "\nDicount Rate ........... " + (discountRate*100) +"%"
				+ "\nDiscount Amount .....(-) " + discountAmount + "$"

				+ "\nTax Rate ............... " + (taxRate*100) +"%"
				+ "\nTax Amount ......... (+) " + taxAmount + "$"
				+ "\n______________________________ " 
				+ "\nTotal .................. " + total + "$"
				+ "\n______________________________ " 
				+ "\n\n      Visit our Website       "
				+ "\n www.tekschoolofamerica.com     "
				;

				System.out.println(result);
				
				int var1 = (int)57.65;
				double var2 = (double) var1;
				
				double var3 = 55.55;
					int var4 = (int) var3 / 3;	
					double var5 = var4;
				
				System.out.println(var4);
				System.out.println(var2);
				
				
		
	}}
		