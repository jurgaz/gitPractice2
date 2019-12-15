
public class JavaBasics_Excersice3 {

	public static void main(String[] args) {
		
		int secondArray [][] = new int [4][5];
		
				
		secondArray [0][0] = 1;
		secondArray [0][1] = 2;
		secondArray [0][2] = 3;
		secondArray [0][3] = 5;
		secondArray [0][4] = 7;
		
		secondArray [1][0] = 23;
		secondArray [1][1] = 25;
		secondArray [1][2] = 3;
		secondArray [1][3] = 5;
		secondArray [1][4] = 45;
		
		secondArray [2][0] = 37;
		secondArray [2][1] = 26;
		secondArray [2][2] = 7;
		secondArray [2][3] = 90;
		secondArray [2][4] = 69;
		
		secondArray [3][0] = 3;
		secondArray [3][1] = 7;
		secondArray [3][2] = 87;
		secondArray [3][3] = 29;
		secondArray [3][4] = 31;
		
		//System.out.println(secondArray [0][0] + " " + secondArray [1][0] + " " + secondArray [0][3]);
		
		//for (int rowNum = 0; rowNum < 5; rowNum++) {
		//	for (int colNum = 0; colNum < 5; colNum++) {
		//		System.out.print(info [rowNum][colNum] + " ");
	//		}

		//System.out.println();
		
		
	
		
		for (int rowNum = 0; rowNum < secondArray.length; rowNum++) {
			for (int colNum = 0; colNum < secondArray[rowNum].length; colNum++) {
				if (secondArray [rowNum][colNum] <10) {
					System.out.print("0" + secondArray[rowNum][colNum] + " "); 
				} else {
				System.out.print(secondArray[rowNum][colNum] + " ");
			}
		System.out.println();
		
		

		}
}
	}
}
		
	


