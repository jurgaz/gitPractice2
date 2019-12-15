package selenium.Basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDET2019AUG_SDET001 {

	public static void main(String[] args) throws IOException {
		
		//1. open tekshcool website
		//2. go to main menu at the bottom of the home page
		//3. click on test environment link
		//4. verify the test Test Environment is displayed (print the title)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		String url = "https://tekschoolofamerica.com/";
		driver.get(url);
		
		driver.get("https://tekschoolofamerica.com/");
		String tekSchoolPageTitle = driver.getTitle();
		System.out.println(tekSchoolPageTitle);
		
//		driver.findElement(By.xpath("//a[text()= 'Test Environment']")).click();   //doesn't always work on link
		driver.findElement(By.xpath("//a[text()= 'Test Environment']")).sendKeys(Keys.ENTER); //will click "enter" when "click" doesn't work
		String testEnvPageTitle = driver.getTitle();
		System.out.println(testEnvPageTitle);
		
		Utility.screenshot(driver, "C:\\Users\\Jurga PC\\eclipse-workspace\\SeleniumProject\\output", "SDET001");		
				

	}

}
