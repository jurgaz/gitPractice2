package selenium.Basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandWindowHandling {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg btn-block btn-booking']"));
		searchButton.click();
		
		//to handle website popups//to get the text of alert before accepting
		System.out.println(driver.switchTo().alert().getText());     //to print the text of the pop up
		
		//to handle website pop ups, use switch method
		driver.switchTo().alert().accept();
		
		//get title of the page
		System.out.println(driver.getTitle());
		
		
		WebElement crm = driver.findElement(By.xpath("//p[text() ='CRM']"));
		crm.click();
		
		//to switch windows from parent to child need to do the actions:
		//1. get all window Handlers and store in a SET (does not store elements in an order)
		Set <String> WindowHandles = driver.getWindowHandles();
				
		//2. Use Iterator to iterate in window Handlers SET
		Iterator<String> it = WindowHandles.iterator();
		
		//3. Store Parent window handler in a string
		String parentWindow = it.next();
		
		//4. Store Child window's handler in a string
		String childWindow = it.next();
		
		//5. use SwitchTo.Window method for switching from parent to child window
		driver.switchTo().window(childWindow);
		
		
		System.out.println(driver.getTitle());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
	}

}
