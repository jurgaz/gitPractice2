
public class ContinueAndBreak {

	public static void main(String[] args) {
		
		//go with loops
		
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i);
//			if (i==10) {
//				
//				break;                     //means to exit the loop
//				
//			}
//			
//		}
//		for (int i = 0; i < 20; i++) {
//			
//			if (i==10) {
//				if (i> 5 && i< 10){
//					System.out.println("continue applied");
//				}
//				continue;                     // skip this iteration, go to the next one
//			}
//			System.out.println(i);
//			
			
//	}
		
		//create a loop that will for through 1-10 and print the numbers
		// when the number is multiple of 3, then skip that iteration
		//when the number is 9, break the loop
		//after the loop is done print "loop ended"
		
		for (int i = 1; i <= 10; i++) {
			if (i == 9) {
				System.out.println("Break applied");
				break;
			} else if (i % 3 == 0) {
				System.out.println("Continue Applied");
				continue;
			} else {
				System.out.println(i);
			}
			
		}

		
		
		
	}

}
