
public class Loops_2 {

	public static void main(String[] args) {


		String nameAndPass[][] = { 

		  { "Ahmad", "password123" }

		, { "David", "123pass" }

		, { "Joshua", "Coffe123987" } 

		};



//		David = nameAndPass[1][0]

//		123pass = nameAndPass[1][1]

		for(int i = 0 ; i < 3 ; i++) {

			System.out.println("User Name => " + nameAndPass[i][0] 

					+ "   Password => " + nameAndPass[i][1]);

		}

		

		System.out.println("****************************\n\n");

		

		String info[][] = { 

				  { "Ahmad", "password123", "VA","22315", "Finance" }

				, { "David", "123pass", "VA","22315", "Accounting"  }

				, { "Joshua", "Coffe123987", "VA","22315", "IT"  } 

				};

				

		for (int rowNum = 0; rowNum < 5; rowNum++) {
			for (int colNum = 0; colNum < 5; colNum++) {
				System.out.print(info [rowNum][colNum] + " ");
			}

		System.out.println();

		}




	}

}
