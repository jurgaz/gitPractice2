package selenium.Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

		public static void screenshot (WebDriver driver,String locationOnFile,String fileName) throws IOException {
			
		//take screen shot using TakeScreenshot method of selenium and store as file
			//where to store: give location name, file name, file type ".png"
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file, new File(locationOnFile+fileName+".png"));
						
		}

		/*
		 * This method captures DAte from Calendar using Java Script Executor
		 */
public static void selectDateByJS(WebDriver driver, WebElement element, String date) {
	
	// create object of JavaScriptExecutor class
	
	JavascriptExecutor js= ((JavascriptExecutor) driver);
	
	//use esxecuteScript to capture the date
	
	js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	
	
}



}