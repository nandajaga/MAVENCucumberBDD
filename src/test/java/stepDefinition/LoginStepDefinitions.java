package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

	@Given("^users is on Home page$")
	public void users_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In Home page");

	}

	@When("^user navigates t login page$")
	public void user_navigates_t_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("In Login page");

	}

	@When("^enter the credentials$")
	public void enter_the_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter credentials ");

	}

	@Then("^Login should be success$")
	public void login_should_be_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged In");

	}

}
