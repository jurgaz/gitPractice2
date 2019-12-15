package selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {

	public static void main(String[] args) {
		
		//1. declare a string and assign a empty value;name of the string should be browser
		//2. 
		WebDriver driver = null;
		String browser = " ";
		
		switch (browser) {
		case "IE":

			System.setProperty("webdriver.ie.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\IEDriverserver.exe");
			 driver = new InternetExplorerDriver();

			break;

		case "FF":
			System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\geckodriver.exe");
			 driver = new FirefoxDriver();

			break;

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
			 driver = new ChromeDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
			 driver = new ChromeDriver();
			break;

		}
	
		driver.get("https://www.google.com/");
	}

}
