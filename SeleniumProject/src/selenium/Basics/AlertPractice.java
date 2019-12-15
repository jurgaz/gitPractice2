package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		WebElement searchButton = driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg btn-block btn-booking']"));
//		searchButton.click();
//		
//		//to handle website popups//to get the text of alert before accepting
//		System.out.println(driver.switchTo().alert().getText());     //to print the text of the pop up
//		
//		//to handle website pop ups, use switch method
//		driver.switchTo().alert().accept();
//		
//		//get title of the page
//		System.out.println(driver.getTitle());
		
		WebElement goButton = driver.findElement(By.xpath("//input[@type ='submit']"));
		goButton.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
