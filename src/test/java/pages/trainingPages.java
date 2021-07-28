package pages;

import com.ibm.icu.impl.ICUService;
import net.serenitybdd.screenplay.questions.TheCoordinates;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class trainingPages extends PageObject{
    private Actions builder;
    @FindBy(xpath = "//*[@id=\"WrapperLeftSidebar\"]/div/ul/li[7]")
    WebElement trainingMenu;
    @FindBy(xpath = "//*[@id=\"WrapperLeftSidebar\"]/div/ul/li[7]/ul/li[2]/div/div[1]/ul/li[1]/a")
    WebElement submenuPelatihan;
    @FindBy(xpath = "//*[@id=\"breadcrumb_title\"]")
    WebElement halamanPelatihanPetani;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/span/div/div/div[1]/div/div/a[1]")
    WebElement buttonAddTraining;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-ProvinceID-inputEl\"]")
    WebElement provinsi;
    @FindBy(xpath = "//*[@id=\"boundlist-1068-listEl\"]/ul/li")
    WebElement nilaiProvinsi;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-DistrictID-inputEl\"]")
    WebElement kabupaten;
    @FindBy(xpath = "//*[@id=\"boundlist-1072-listEl\"]/ul/li[1]")
    WebElement nilaiKab;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-TopicID-inputEl\"]")
    WebElement topik;
    @FindBy(xpath = "//*[@id=\"boundlist-1070-listEl\"]/ul/li[1]")
    WebElement nilaiTopik;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-TrainStart-inputEl\"]")
    WebElement dateStart;
    @FindBy(xpath = "//*[@id=\"ext-gen1269\"]/a")
    WebElement nilaiDateStart;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-TrainEnd-inputEl\"]")
    WebElement dueDate;
    @FindBy(xpath = "//*[@id=\"ext-gen1317\"]/a")
    WebElement nilaiDueDate;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-ActivityType1-inputEl\"]")
    WebElement tipeAktivitas;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-FacilitatorPersonIDAuto-labelEl\"]")
    WebElement titleNamaTech;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-FacilitatorPersonIDAuto-inputEl\"]")
    WebElement technician;
    @FindBy(xpath = "//*[@id=\"boundlist-1298-listEl\"]/ul/li/div")
    WebElement nilaiTechnician;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-TrainingEventStatus1-inputEl\"]")
    WebElement statusEvent;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.TrainFar.MainForm-Form-BtnSave-btnInnerEl\"]")
    WebElement buttonSaveTraining;


    public void wannaTrainingPage() throws InterruptedException {
        Thread.sleep(1000);
        //((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", trainingMenu)
        Assert.assertEquals("Pelatihan", trainingMenu.getText());
        trainingMenu.click();
        Thread.sleep(1000);
        Assert.assertTrue(submenuPelatihan.isDisplayed());
        submenuPelatihan.click();
    }

    public void showPageTraining(){
        halamanPelatihanPetani.isDisplayed();
        //Assert.assertEquals("Pelatihan Petani", halamanPelatihanPetani.getText());
    }

    public void buttonAddtraining() throws InterruptedException {
        Thread.sleep(3500);
        buttonAddTraining.click();
    }


    public void inputFormTrainingandSave() throws InterruptedException{
        Thread.sleep(3000);
        provinsi.sendKeys("Indonesia - Jawa Tengah", Keys.TAB);
        Thread.sleep(1000);
        kabupaten.sendKeys("Banjarnegara", Keys.TAB);
        Thread.sleep(1000);
        topik.sendKeys("Good Agriculture Practices (GAP)", Keys.TAB);
        Thread.sleep(1000);
        dateStart.sendKeys("2021-05-01");
        Thread.sleep(1000);
        dueDate.sendKeys("2021-05-02");
        Thread.sleep(1000);
        tipeAktivitas.click();
//        Thread.sleep(1000);
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", titleNamaTech);
        Thread.sleep(1000);
        Assert.assertTrue(technician.isDisplayed());
        technician.sendKeys("Tech Abc (Java Agritech)", Keys.TAB);
        Thread.sleep(2000);
        statusEvent.click();
        buttonSaveTraining.click();
        Thread.sleep(5000);
    }
}
