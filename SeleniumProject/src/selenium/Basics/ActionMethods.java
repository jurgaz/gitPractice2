package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
		 String baseURL = "https://tekschoolofamerica.com/test-environment/";
		 driver.get(baseURL);
		 
		 //create object of Action Class in order to use its methods.
		 
		 Actions actions = new Actions(driver);
		 
		 //store xpath in webElement
		 WebElement component = driver.findElement(By.xpath("//a[text() = 'Components']"));
		 
		 //to move the cursor to element but not click on it(hovering)
		 
		 actions.moveToElement(component).build().perform();
		 //Thread.sleep(5000);
		 
		 //double click on element
		 actions.doubleClick(component).build().perform();
		// Thread.sleep(000);
		 
		 //right click on webpage
		 actions.contextClick(component).build().perform();
		 
		 //navigate to below URL
		 //http://jqueryui.com/resources/demos/droppable/default.html
		 
		 driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		 Thread.sleep(3000);
		 
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 //to drag and drop the element
		 actions.dragAndDrop(source, target).build().perform();
		 
		 
		 
	}

}
