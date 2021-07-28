package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginSctPages extends PageObject{
    @FindBy(id = "username")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "btnSubmit")
    WebElement btnSubmitfield;
    @FindBy(id = "breadcrumb_title")
    WebElement titleDashboard;

    public void loginSCTGlobal(){
        usernameField.sendKeys("koltiva"); //if you want to try, contact me via email or linkedin 
        passwordField.sendKeys("Pass!");
        btnSubmitfield.click();
    }

    public void viewDashboard(){
        titleDashboard.isDisplayed();
        Assert.assertEquals("Program KPI (Umum)", titleDashboard.getText());
    }

}
