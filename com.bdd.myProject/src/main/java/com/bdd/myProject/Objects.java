package com.bdd.myProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Objects extends Base {

	public Objects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[text() = 'Test Environment']")
	private WebElement testEnvironment;

	public void clickOnTestEnvironment() {
		testEnvironment.click();
	}

}
