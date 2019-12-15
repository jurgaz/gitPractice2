package selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFBrowserHeadless {

	public static void main(String[] args) {

		// 0. system property set up

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\geckodriver.exe");

		// 1. create Object of WebDriver to run FireFox Driver
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(fo);

		// .get() method

		driver.get("https://www.google.com/");

		driver.get("https://tekschoolofamerica.com/");
		System.out.println(driver.getTitle());
		
	}

}
