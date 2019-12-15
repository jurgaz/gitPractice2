package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLogIn {

	public static void main(String[] args) {
		
		//0. set system property for chrome driver
		//1. open chrome browser
		//maximize browser
		//set page load for 10 sec
		//set implicit wait to 30 sec
		//got to canvas page https://canvas.instructure.com/login/canvas
		//get title of canvas page
		//find email element by ID
		//find password element by ID
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://canvas.instructure.com/login/canvas");
		

		String actualTitle = driver.getTitle();
		String expectedTitle = "Log In to Canvas";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		} else {
		System.out.println("Wrong title");
		}
		
//		driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("test@test.com");
//		driver.findElement(By.id("pseudonym_session_password")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"pseudonym_session_unique_id\"]")).sendKeys("test@test.com");
		
		driver.findElement(By.xpath("//*[@id=\"pseudonym_session_password\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button")).click();
		
		////*[@id="login_form"]/div[3]/div[2]/button/text()
		
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[1]/a/span[1]/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[2]/a/span[1]/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[3]/a/span[1]/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[4]/a/span[1]/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[5]/a/span[1]/svg/path")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[5]/a/span[1]/svg")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[4]/ul/li[6]/a/span[1]/svg/path")).click();
		
		

		
		
	}

}
