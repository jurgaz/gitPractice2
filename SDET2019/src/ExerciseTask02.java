
public class ExerciseTask02 {

	public static void main(String[] args) {

		double table[][] = new double[5][5];

		int quantityColumnnInd = 0;
		int priceIndx = 1;
		int taxRateIndx = 2;
		int taxAmmountIndx = 3;
		int totalIndx = 4;

		double quantityPrice[][] = new double[5][2];

		quantityPrice[0][quantityColumnnInd] = 5.0;
		quantityPrice[1][quantityColumnnInd] = 10.0;
		quantityPrice[2][quantityColumnnInd] = 15.0;
		quantityPrice[3][quantityColumnnInd] = 3.0;
		quantityPrice[4][quantityColumnnInd] = 11.0;

		quantityPrice[0][priceIndx] = 10.99;
		quantityPrice[1][priceIndx] = 3.45;
		quantityPrice[2][priceIndx] = 6.75;
		quantityPrice[3][priceIndx] = 5.25;
		quantityPrice[4][priceIndx] = 11.99;

		double taxRate = 0.05;

		// loop over all items to get taxAmount

		// for each item multiply Quantity*price*TaxRate

		for (int i = 0; i < quantityPrice.length; i++) {
			double quantity = quantityPrice[i][quantityColumnnInd];
			double price = quantityPrice[i][priceIndx];
			double taxAmount = quantity * price * taxRate;
			double total = quantity * price + taxAmount;
			// System.out.println(total);

			if (total > 1000) {
				total = total * 0.95;
			}
			// save quantity
			table[i][0] = quantity;

			// save price

			table[i][1] = price;

			// save tax rate

			table[i][2] = taxRate;

			// save tax amount

			table[i][3] = taxAmount;

			// save total

			table[i][4] = total;

			// print current table row
			System.out.println(
					table[i][0] + " " + table[i][1] + " " + table[i][2] + " " + table[i][3] + " " + table[i][4]);
		}

	}

}
