package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jnr.ffi.annotations.In;
import net.thucydides.core.annotations.Steps;
import steps.loginSctSteps;
import steps.farmerSteps;

public class farmer {
    @Steps
    loginSctSteps loginSCT;

    @Steps
    farmerSteps farmerSCT;


    @Given("dashboard sct website")
    public void dashboard_sct_website() throws InterruptedException {
        loginSCT.openDashboardWeb();
        loginSCT.inputUserLogin();
        Thread.sleep(1500);
    }

    @When("going to farmer sct")
    public void going_to_farmer_sct() throws InterruptedException {
        farmerSCT.inFarmerPage();
        Thread.sleep(1500);
    }

    @Then("success in farmer page")
    public void success_in_farmer_page() {
        farmerSCT.displayMessage();
    }

    //=======PETANI====================

    @Given("in farmer page")
    public void in_farmer_page() throws InterruptedException{
        dashboard_sct_website();
        going_to_farmer_sct();
        //Thread.sleep(4000);
    }

    @When("going to click button add")
    public void going_to_click_button_add() throws InterruptedException{
        farmerSCT.addFarmerNew();
        //Thread.sleep(6000);
    }

    @Then("success in form add new farmer")
    public void success_in_form_add_new_farmer() {

    }

    //===========GARDEN=========================================
    @Given("in detail farmer page for garden")
    public void in_detail_farmer_page_for_garden() throws InterruptedException {
        dashboard_sct_website();
        going_to_farmer_sct();
        success_in_form_add_new_farmer();
        farmerSCT.openDetailPetani();
    }

    @When("going to click button add new garden")
    public void going_to_click_button_add_new_garden() throws InterruptedException{
        farmerSCT.addGardenFarmerSave();
    }

    @Then("success input and save new garden")
    public void success_input_and_save_new_garden() {

    }

    //===========FAMILY=========================================

    @Given("in detail farmer page for family")
    public void in_detail_farmer_page_for_family() throws InterruptedException {
        dashboard_sct_website();
        going_to_farmer_sct();
        success_in_form_add_new_farmer();
        farmerSCT.openDetailPetani();
    }

    @When("going to click button add new family")
    public void going_to_click_button_add_new_family() throws InterruptedException {
        farmerSCT.addNewAndSaveFamily();
    }

    @Then("success input and save new family")
    public void success_input_and_save_new_family() {
    }

    //======================Pekerja=======================

    @Given("in detail farmer page for pekerja")
    public void in_detail_farmer_page_for_pekerja() throws InterruptedException {
        dashboard_sct_website();
        going_to_farmer_sct();
        success_in_form_add_new_farmer();
        farmerSCT.openDetailPetani();
    }

    @When("going to click button add new pekerja")
    public void going_to_click_button_add_new_pekerja() throws InterruptedException{
        farmerSCT.addNewAndSavePekerja();
    }

    @Then("success input and save new pekerja")
    public void success_input_and_save_new_pekerja() {
    }



}
