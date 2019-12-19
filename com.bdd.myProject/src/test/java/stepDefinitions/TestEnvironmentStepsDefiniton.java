package stepDefinitions;

import com.bdd.myProject.Base;
import com.bdd.myProject.Objects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestEnvironmentStepsDefiniton extends Base {

	Objects testEnvironment = new Objects();

	@Given("^User is on Tekschool page$")
	public void user_is_on_Tekschool_page() throws Throwable {
		Base.initializeDriver();
	}

	@When("^User clicks Test Environment page$")
	public void user_clicks_Test_Environment_page() throws Throwable {
		testEnvironment.clickOnTestEnvironment();

	}

	@Then("^user should get test environment page title$")
	public void user_should_get_test_environment_page_title() throws Throwable {

		System.out.println(driver.getTitle());

	}

}
