package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://tekschoolofamerica.com/test-environment/");

		driver.findElement(By.xpath("//a[text()= 'Phones & PDAs']")).click();
		WebElement phone_PDAs = driver.findElement(By.xpath("//a[text()= 'Phones & PDAs']"));
		phone_PDAs.click();

		try {
			Thread.sleep(10000); // one of the methods to slow down the driver
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// to handle static drop downs use SELECT class

		 WebElement sortByElement = driver.findElement(By.xpath("//select[@id ='input-sort']"));
		 Select select = new Select(sortByElement);

		 select.selectByVisibleText("Name (Z - A)");
		 select.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=rating&order=ASC");
		 select.selectByIndex(4);

//		WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-limit']"));
//		Select select = new Select(sortByElement);
//
//		 select.selectByVisibleText("50");
//select.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=pd.name&order=DESC&limit=50");
//		select.selectByIndex(2);

//driver.close closes only current window
//driver.quit closes all open windows which are opened by webdriver.

		driver.close();

	}

}
