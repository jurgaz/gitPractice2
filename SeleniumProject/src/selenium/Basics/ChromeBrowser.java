package selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		//0. Set system property for browser
		//syntax = system.setProperty(webdriver.chrome.driver", "path of chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		
		
		//1. Object of WebDriver
		
		WebDriver driver = new ChromeDriver();
		
		//open google.com
		//url = https://www.google.com/
		
		//.get() opens browser
		driver.get("https://www.google.com/");

	}

}
