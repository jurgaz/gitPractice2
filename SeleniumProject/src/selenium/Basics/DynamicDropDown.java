package selenium.Basics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.aa.com/homePage.do");

		// 1. Grab departure box xpath
		// 2. Store in a WebElement object
		// 3. Clear the box
		// 4. send (wash) value
		// 5. create a list of storing webelements of dropdowns
		// 6. create a for each loop to travel through list of indexes
		// 7. write if condition to click or select value we want
		// 8. break from the loop
		
		
		WebElement requirements = driver.findElement(By.xpath("//a[text() = 'ID requirements are changing']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(requirements).build().perform();
		

		WebElement departure = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		departure.clear();
		departure.sendKeys("wash");
		Thread.sleep(3000);

		List<WebElement> airports = driver.findElements(By.xpath("//ul[@id = 'ui-id-3']/li"));
		System.out.println(airports.size());
		

		for (WebElement element : airports) {

			try {
				if (element.getText().contains("BWI"))
					element.click();
				break;
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is no longer attached to dom");
			}

		}
		Utility.screenshot(driver, "C:\\Users\\Jurga PC\\eclipse-workspace\\SeleniumProject\\output", "AA");
		
		WebElement arrivals = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		
		arrivals.clear();
		arrivals.sendKeys("las");
		
		
 	List<WebElement> airport = driver.findElements(By.xpath("//ul[@id ='ui-id-4']/li"));
 	System.out.println(airport.size());
 	
 	for (WebElement element : airport) {
 		try {
 			if (element.getText().contains("LAS"))
element.click();
break;
 		} catch (StaleElementReferenceException e) {
			System.out.println("Element is no longer attached to dom");
		}

	}
	
	
	WebElement numberOfPassengers = driver.findElement(By.xpath("//select[@name='adultOrSeniorPassengerCount']"));
	Select select = new Select(numberOfPassengers);
	select.selectByIndex(4);
	
	
	// storing deprture date in a webElement
	WebElement departureCalendar = driver.findElement(By.xpath("//input[@id = 'aa-leavingOn']"));
	//selecting desired date using JSExecutor class
	Utility.selectDateByJS(driver, departureCalendar, "11/21/2019");
	
	WebElement returnCalendar = driver.findElement(By.xpath("//input[@id = 'aa-returningFrom']"));
	Utility.selectDateByJS(driver, returnCalendar , "11/30/2019");
	
	
	driver.findElement(By.xpath("//input[@id = 'flightSearchForm.button.reSubmit']")).click();
	
	
	Utility.screenshot(driver, "C:\\Users\\Jurga PC\\eclipse-workspace\\SeleniumProject\\output", "reservation headless");
	
	//driver.close();
	
	

 		}
	
		
	}
	
	
	
	

