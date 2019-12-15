package SigmaTeam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDET0003 {

	public static void main(String[] args) {
//		1	Call "Test Environment Link" test case #SDET20
//		2	Click in "My Account" Menu on the top of the page
//		3	Click on the Log In options
//		4	Verify below fields and button are present in "Returning Customer" form: "Email Address", "Password", "Login"
		
//		5	Type "Testing Account" Email in the email address field Test Email: teststudent@gmail.com
//		6	Type "Testing Account" Password in the Password field Test password: Tek@Test.com
//		7	Verify the entered text in the password field is changed to the bullet points
//		8	Click Login Button
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://tekschoolofamerica.com/test-environment/");
		 driver.findElement(By.xpath("//a[@title = 'My Account']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Login']")).click();

		 driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("teststudent@gmail.com");
		 driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Tek@Test.com");
		 driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		 


	}

}
