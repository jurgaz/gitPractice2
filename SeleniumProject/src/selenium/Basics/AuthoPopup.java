package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthoPopup {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String userName = "admin";
		String passWord = "admin";
		
		//http://the-internet.herokuapp.com/basic_auth
		//Syntax for bypassing autho PopUps
		//http://username:password@the-internet.herokuapp.com/basic_auth
		
		String url = "http://"+ userName +":" + passWord + "@the-internet.herokuapp.com/basic_auth";
		
		driver.get(url);
		System.out.println(driver.getTitle());

	}

}
