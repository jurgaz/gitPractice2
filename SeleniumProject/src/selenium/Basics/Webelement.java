package selenium.Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().deleteAllCookies();     //will delete cookies or data sent from browser
		
		String url = "https://tekschoolofamerica.com/test-environment/";
		
		driver.get(url);
		String actualTitle = driver.getTitle();
		String expectedTitle = "TEK SCHOOL";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);
		}else {
			System.out.println("Title is NOt correct");
		}
		
//		driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		
		//should be stored in web element
					
		WebElement logo = driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		
		logo.getText();                //will extract the text of the element
		logo.isDisplayed();            //shows true/false if the element is displayed on the webpage
		System.out.println(logo.getText());
		System.out.println(logo.isDisplayed());
		
		driver.findElements(By.tagName("a"));  //finds all the tags on a page
		
//		List<WebElement> links = driver.findElements(By.tagName("a")); //all elements that have tag 'a'
//		
//		System.out.println(links.size());
//		
//		for (WebElement webLinks: links) {
//			String elementText = webLinks.getText(); //for each index get a text element
//			
//			System.out.println(elementText);
//			
//			if(elementText.equals("Phones & PDAs")) {
//			  webLinks.click();
//			  break;
			
//		}
//
//	}

		//1. Find all webElements in the Test environment with tag"div"
		//2. Print number of WebElements
		//3. print text of all webElements
		
		List<WebElement> links = driver.findElements(By.tagName("div"));
		System.out.println(links.size());
		
		 for(WebElement webLinks: links) {
			 String elementText= webLinks.getText();
			 System.out.println(elementText);
		 }
		
		// Differences between .findElement and find.Elements:
		 //find.Element - returns single element
		 //find.Elements - returns a list of the elements
		 //if element is does not exist:
		            //find.Element will show "no such element exception"
		            //find.Elements will return an empty list
		
		
		
		
}}
