package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsPractice {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.aa.com/");
		
		driver.findElement(By.xpath("//a[@id = 'plan-travel-expander']")).click();
		driver.findElement(By.xpath("//a[@id = 'travel-information-expander")).click();
		driver.findElement(By.id("fromSearchPage")).click();
		driver.findElement(By.name("_button_go")).click();
		driver.findElement(By.xpath("//a[@id='jq-findFlights']")).click();
		driver.findElement(By.xpath("//input[@name = 'originAirport' and @id ='reservationFlightSearchForm.originAirport' ]")).sendKeys("wash");
		driver.findElement(By.xpath("//span[@class ='lbl left']")).click();
		driver.findElement(By.xpath("//h2[@class ='left gamma']")).click();
		driver.findElement(By.xpath("//input[@name = 'lastName']")).click();
		driver.findElement(By.xpath("//input[@type = 'password']"));
		
		driver.findElement(By.cssSelector("input[name = 'originAirport']")).click();
		driver.findElement(By.cssSelector("a[class='call-to-action text-underline']")).click();
		driver.findElement(By.cssSelector("input[type='text'][id = 'loginForm.loginId']")).click();
		driver.findElement(By.cssSelector("input[type = 'hidden'][name='loginURL']"));

		
		
	}

}
