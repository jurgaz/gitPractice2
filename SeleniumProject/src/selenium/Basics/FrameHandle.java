package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		
		//to find how many frames a site has, do inspect, type //frame in search window
		
		//h2[text()='Title bar ']
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//switch to frame
		driver.switchTo().frame("main"); //main is an attribute of the frame
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar']"));
		System.out.println(header.getText());
		
		//to switch back to default frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("bot"); 
		
		WebElement footer = driver.findElement(By.xpath("//h2[text() = 'Footer']"));
		System.out.println(footer.getText());
		
		driver.switchTo().defaultContent();
	}

}
