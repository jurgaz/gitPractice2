package SigmaTeam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigmaPracticeOne {
	
 public static void main(String[] args) {
	 
//	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
//	 
//	 WebDriver driver = new ChromeDriver();
//	 
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	 driver.manage().deleteAllCookies();
//	 
//	 driver.get("https://www.facebook.com/");
//	 
//	 driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("test@test.com");
//	 driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123");
//	 //driver.findElement(By.id("u_0_2")).sendKeys(Keys.ENTER);
//	 driver.findElement(By.xpath("//input[@value = 'Log In']")).sendKeys(Keys.ENTER);
//	 
	 int a = 4;
	 int b = a++;
	 int c = ++a;
	 int d = --b + ++c * --b - ++a / --b % ++c;
	 System.out.println(d);
	 
	 System.out.println("He said \"Run!\"");
	
}
}
