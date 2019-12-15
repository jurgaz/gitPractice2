package selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
driver.get("https://tekschoolofamerica.com/");
		
		//Webdriver wait obj
		WebDriverWait wait = new WebDriverWait (driver, 30);
				wait.until(ExpectedConditions.textToBePresentInElement(
						driver.findElement(By.xpath("//a[text()='Test Environment']")), "Test Environment"));



	}

}
