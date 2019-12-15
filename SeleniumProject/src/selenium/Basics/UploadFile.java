package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();

		String url = "https://xndev.com/display-image/";
			driver.get(url);
			
			//Store choose file element in a web element object
			
 		 WebElement uploadFile = driver.findElement(By.xpath("//input[@type = 'file']"));
//			 uploadFile.sendKeys("C:\\Users\\Jurga PC\\Pictures\\Saved Pictures\\Capture.PNG");
       
 		 uploadFileMethod(uploadFile,"C:\\Users\\Jurga PC\\Pictures\\Saved Pictures\\Capture.PNG");
 		 
	}
	

//create a method to perfom uploading a file. this method has 2 arguments: webelement & string path
	public static void uploadFileMethod (WebElement element, String path) {
		element.sendKeys(path);
		
	}
	
}
