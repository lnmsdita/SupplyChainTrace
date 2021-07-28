package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.loginSctSteps;
import steps.trainingSteps;

public class training {
    @Steps
    loginSctSteps loginSCT;

    @Steps
    trainingSteps trainingSct;

    @Given("dashboard sctTraining website")
    public void dashboard_sctTraining_website() throws InterruptedException {
        loginSCT.openDashboardWeb();
        loginSCT.inputUserLogin();
//        Thread.sleep(1500);
    }

    @When("going to training page")
    public void going_to_training_page() throws InterruptedException {
        trainingSct.inTrainingPage();
    }

    @Then("success in training page")
    public void success_in_training_page() {
        trainingSct.displayMessage();
    }

    @Given("in training page")
    public void in_training_page() throws InterruptedException {
        dashboard_sctTraining_website();
        going_to_training_page();
    }

    @When("going to click button add training")
    public void going_to_click_button_add_training() throws InterruptedException {
        //trainingSct.inTrainingPage();
        trainingSct.setAddTrainingNew();
    }

    @Then("success in form add new training")
    public void success_in_form_add_new_training() {

    }


}
