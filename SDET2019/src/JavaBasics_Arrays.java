
public class JavaBasics_Arrays {

	public static void main(String[] args) {
		
		int age []= new int [5];
		
		// 5 elements
		
		// {#,#,#,#,#}
		
		age [0] = 19;
		age [1] = 25;
		age [2] = 35;
		age [3] = 40;
		age [4] = 45;
		
		System.out.println("Array Age Values:" + " " + age[0] + " " + age[1] + " " + age[2] );
		
		//create an array of strings. name it firstNames, it should have 5 indexes
		
		String firstNames [] = new String [5];
		
		firstNames [0] = "Jack";
		firstNames [1] = "Tom";
		firstNames [4] = "Bob";
		System.out.println(firstNames[4] + firstNames [1]);
		
		System.out.println("2 dimension");

		int first2DArray [][] = new int[4][7];


		first2DArray[0][0] = 11;
		first2DArray[0][1] = 15;
		first2DArray[0][2] = 14;
		first2DArray[0][3] = 446;
		first2DArray[0][4] = 56;
		first2DArray[0][5] = 65;
		first2DArray[0][6] = 72;

		first2DArray[1][0] = 7;
		first2DArray[1][1] = 6;
		first2DArray[1][2] = 5;
		first2DArray[1][3] = 4;
		first2DArray[1][4] = 3;
		first2DArray[1][5] = 2;
		first2DArray[1][6] = 1;

		int rownum = 0;
		int colnum = 0;

		System.out.println(

				first2DArray[rownum][colnum] + " " 
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] );

				System.out.println(
				first2DArray[0][0] + " " 
				+ first2DArray[0][1] + " "
				+ first2DArray[0][2] + " "
				+ first2DArray[0][3] + " "
				+ first2DArray[0][4] + " "
				+ first2DArray[0][5] + " "
				+ first2DArray[0][6] );
				
				{
				
					System.out.println("lenght is : " + array.length);
					String array [] = {"1","2","3","4","5","6","7","8"};
					for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
					}
				}
	}

}
