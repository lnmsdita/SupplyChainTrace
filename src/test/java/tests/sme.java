package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginSctSteps;
import steps.smeSteps;

public class sme {

    @Steps
    loginSctSteps loginSCT;

    @Steps
    smeSteps smeSCT;

    @Given("dashboard supplychain website")
    public void dashboard_supplychain_website() throws InterruptedException {
        loginSCT.openDashboardWeb();
        loginSCT.inputUserLogin();
//        Thread.sleep(1500);
    }

    @When("going to SME page")
    public void going_to_SME_page() throws InterruptedException {
        smeSCT.inSmePage();
//        Thread.sleep(1500);
    }

    @Then("success in SME page")
    public void success_in_SME_page() {
        smeSCT.displayMessage();
    }

    @Given("in sme page")
    public void in_sme_page() throws InterruptedException {
        dashboard_supplychain_website();
        going_to_SME_page();
    }

    @When("going to click button add sme")
    public void going_to_click_button_add_sme() throws InterruptedException {
        smeSCT.addSmeNew();
    }

    @Then("success in form add new sme")
    public void success_in_form_add_new_sme() {

    }

}
