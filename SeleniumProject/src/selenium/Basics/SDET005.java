package selenium.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SDET005 {

	public static void main(String[] args) {
//		Call test case Test Environment Link SDET129
//		Hover a mouse over a product name (The blue bar i.e. “Cameras”, “Tablets” or “Mac” from “Desktops”)
//		Choose a product by clicking on it
//		Verify an "Add to cart" label appears next to the product
//		Click on "Add to cart" label
//		Click on the link or the image of the product
//		Verify a blue button with and "Add to cart label" is displayed on the right side of the page
//		Verify Required fields above the “Add to Cart” button are filled in before user can select “Add to Cart” button.
//		 Click “Add to Cart” 
//		"Verify success message should appears on top of product image as below:
//		“Success: You have added <Name of Product> to your shopping cart!”"
//		"Verify that a List of items appears when user selects “Shopping Cart” on the top of the menu.
//		"
//		Click  on the same product as before
//		Click "Add to Cart" button
//		Verify the item is not repeated in the “Shopping Cart”, instead, the Quantity is added"

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jurga PC\\Documents\\Classes\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://tekschoolofamerica.com/test-environment/");
		
		Actions actions= new Actions(driver);
		WebElement phones = driver.findElement(By.xpath("//a[text() = 'Components']"));
		
		actions.moveToElement(phones).build().perform();
		
		WebElement monitors = driver.findElement(By.xpath("//a[text() = 'Monitors (2)']"));
		monitors.click();
		WebElement addToCart = driver.findElement(By.xpath("//span[text() = 'Add to Cart']"));
		addToCart.isDisplayed();
			System.out.println(addToCart);
		addToCart.click();
		
		WebElement blueAddToCart = driver.findElement(By.xpath("//button[@id = 'button-cart']"));
		blueAddToCart.isDisplayed();
		System.out.println(blueAddToCart);
		blueAddToCart.click();
		
		

	}

}
