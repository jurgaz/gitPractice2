package selenium.Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
		//0. Set system property
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\IEDriverserver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");

	}

}
