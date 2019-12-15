package selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFBrowser {

	public static void main(String[] args) {

		// 0. system property set up

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\geckodriver.exe");

		// 1. create Object of WebDriver to run FireFox Driver

		WebDriver driver = new FirefoxDriver();

		// .get() method

		driver.get("https://www.google.com/");

		// get the title of the page
		// .getTitle();
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String expectedTitle = "facebook";
		if (title.contentEquals(expectedTitle )) {
			System.out.println("this is google website title " + title);
		}else { System.out.println("wrong title");
		
		//write code that prints "this is google website title if title is Google otherwise it prints wrong title

		// close browser
		// close();
		driver.close();

	}
	}
}
