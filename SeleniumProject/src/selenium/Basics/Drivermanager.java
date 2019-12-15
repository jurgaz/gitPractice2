package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanager {

	public static void main(String[] args) {

		// 0. set system property for chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");

		// 1. Instatiate chrome driver
		WebDriver driver = new ChromeDriver();

		// browser manage commands:
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // giving the browser 30 seconds before showing
																			// an error
		driver.manage().window().maximize();

		// 2. get to facebook page
		driver.get("https://www.facebook.com/");

		// 3. get facebook title
		String actualTitle = driver.getTitle();

		String expectedTitle = "Facebook - Log In or Sign Up";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Wrong title");
		}
//find email or phone element //
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("u_0_2")).click();
		
//		driver.findElement(By.name("email")).sendKeys("test@test.com");
//		driver.findElement(By.name("pass")).sendKeys("123");
//		driver.findElement(By.id("u_0_2")).click();
		
		// 4. store title in string name actualTitle

	}

}
