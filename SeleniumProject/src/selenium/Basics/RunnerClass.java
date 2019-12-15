package selenium.Basics;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Call Set up method to create connection between Selenium and database
		
		DBSQLPractice.setUpConnection();
		DBSQLPractice.runQuery();
		
		//DBUtilities.closeConnection();

	}

}
