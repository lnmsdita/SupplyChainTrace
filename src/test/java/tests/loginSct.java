package tests;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.loginSctSteps;

public class loginSct {

    @Steps
    loginSctSteps signin;


    @Given("home page sctGlobal website")
    public void home_page_sctGlobal_website() {
        // Write code here that turns the phrase above into concrete actions
        signin.openDashboardWeb();
    }

    @When("going to login page to sctGlobal")
    public void going_to_login_page_to_sctGlobal() {
        // Write code here that turns the phrase above into concrete actions
        signin.inputUserLogin();
    }

    @Then("failed login to sctGlobal website")
    public void failed_login_to_sctGlobal_website() {
        // Write code here that turns the phrase above into concrete actions
        signin.showDashboard();
    }

}

