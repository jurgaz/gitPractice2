import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();

		String url = "https://cgi-lib.berkeley.edu/ex/fup.html";
			driver.get(url);

			WebElement pressButton = driver.findElement(By.xpath("//input[@type = 'file']"));
			pressButton.sendKeys("C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\test.txt");
			driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

}
