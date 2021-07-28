package pages;

import com.ibm.icu.impl.ICUService;
import jnr.ffi.annotations.In;
import net.serenitybdd.screenplay.questions.TheCoordinates;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class farmerPages extends PageObject {

    @FindBy(xpath = "//*[@id=\"WrapperLeftSidebar\"]/div/ul/li[3]/a")
    WebElement farmerMenu;
    @FindBy(xpath = "//*[@id=\"breadcrumb_title\"]")
    WebElement halamanFarmer;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainGrid-BtnAdd-btnInnerEl\"]")
    WebElement buttonAddFarmer;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-SupplierName-inputEl\"]")
    WebElement namaFarmer;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-GenderM-inputEl\"]")
    WebElement genderFarmer;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-DateCollection-inputEl\"]")
    WebElement tglWawancara;
    @FindBy(xpath = "//*[@id=\"ext-gen1881\"]/a")
    WebElement nilaiTglWawancara;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-Birthdate-inputEl\"]")
    WebElement dateBirth;
    @FindBy(xpath = "//*[@id=\"ext-gen1902\"]/a")
    WebElement nilaiDateBirth;
    @FindBy(id = "Koltiva.view.Farmers.MainForm-FormBasicData-IdType-inputEl")
    WebElement jenisID;
    @FindBy(id = "Koltiva.view.Farmers.MainForm-FormBasicData-IdNo-inputEl")
    WebElement noID;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-SectionGeneralData_header_hd-textEl\"]")
    WebElement wilayahTittle;
    @FindBy(xpath = "//*[@id=\"ext-gen1647\"]")
    WebElement wilayah;
    @FindBy(id = "Koltiva.view.Widget.WinSelectRegion-CmbFilterRegionBy-inputCell")
    WebElement filter;
    @FindBy(xpath = "//*[@id=\"boundlist-1248-listEl\"]/ul/li[2]")
    WebElement nilaiFilter;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterCountry-inputEl\"]")
    WebElement negara;
    @FindBy(xpath = "//*[@id=\"boundlist-1276-listEl\"]/ul/li")
    WebElement nilaiNegara;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterProvince-inputEl\"]")
    WebElement province;
    @FindBy(xpath = "//*[@id=\"boundlist-1278-listEl\"]/ul/li")
    WebElement nilaiProvince;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterDistrict-inputEl\"]")
    WebElement kab;
    @FindBy(xpath = "//*[@id=\"boundlist-1280-listEl\"]/ul/li[1]")
    WebElement nilaiKab;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterSubDistrict-inputEl\"]")
    WebElement kec;
    @FindBy(xpath = "//*[@id=\"boundlist-1282-listEl\"]/ul/li[3]")
    WebElement nilaiKec;
    @FindBy(id = "Koltiva.view.Widget.WinSelectRegion-BtnSearch")
    WebElement buttonSearch;
    //@FindBy(xpath = "//*[@id=\"gridview-1230-record-ext-record-62\"]/td[1]/div/img")
    //@FindBy(xpath = "//img[contains(@src,'https://demo.supplychaintrace.com//images/icons/silk/control_add_blue.png')]")
    @FindBy(xpath = "/html/body/div[9]/div[2]/span/div/div/div[3]/div/table/tbody/tr[1]/td[1]/div/img")
    WebElement pilihanWilayah;

    @FindBy(id = "Koltiva.view.Farmers.MainForm-FormBasicData-SectionAddLocation_header_hd")
    WebElement findPertanian;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormBasicData-LiveOnFarm1-inputEl\"]")
    WebElement pertanian;
    @FindBy(id = "Koltiva.view.Farmers.MainForm-FormBasicData-BtnSave")
    WebElement buttonSavePetani;
    @FindBy(xpath = "//*[@id=\"button-1005-btnIconEl\"]")
    WebElement notComplete;

    //section Farm
    //@FindBy(xpath = "//*[@id=\"gridview-1025-record-ext-record-1\"]/td[1]/div/img")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/span/div/div/div[3]/div/table/tbody/tr[1]/td[1]/div/img")
    WebElement actionDrop;
    //@FindBy(xpath = "//*[@id=\"menuitem-1011-textEl\"]")
    @FindBy(xpath = "/html/body/div[9]/div/div[2]/div/div[2]")
    WebElement valueActionDrop;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.MainForm-FormGeneralData_header_hd\"]")
    WebElement dataPetaniTitle;
    //@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/span/div/div[4]/div/span/div/div[2]/div/span/div/div[3]/span/div/div/div[2]/div/div/a")
    @FindBy(xpath = "//*[@id=\"button-1285-btnIconEl\"]")
    WebElement buttonAddGarden;
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div[2]/div/div/span/div/div[2]/span/div/table/tbody/tr/td/table/tbody/tr/td[1]/input")
    WebElement noKebun;
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div[2]/div[1]/div/span/div/div[3]/span/div/table/tbody/tr/td/div[2]/table/tbody/tr/td[1]/table[1]/tbody/tr/td[2]/div/input")
    WebElement noSurvey;
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div[2]/div/div/span/div/div[6]/span/div/table/tbody/tr/td/table/tbody/tr/td[1]/input")
    WebElement luasAreaHa;
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div[1]/div[1]/div[2]/div/a[2]")
    WebElement tabTanaman;
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div[2]/div[2]/div/span/div/div[1]/span/div/table/tbody/tr/td/div[2]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/div/input")
    WebElement moroheiyaKomoditi;
    @FindBy(xpath = "/html/body/div[14]/div[3]/div/div/a[1]")
    WebElement buttonSaveKebun;

    //============Tab Family=================================

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/span/div/div[4]/div/span/div/div[1]/div/span/div/div/div[2]/span/div/div/div/span/div/div/div/table/tbody/tr/td/div/div[1]/div[1]/div[2]/div/a[3]")
    WebElement openTabFamily;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.FamilyGrid-BtnAdd-btnInnerEl\"]")
    WebElement buttonAddFamily;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-FamName-inputEl\"]")
    WebElement namaMemberFamily;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-GenderM-inputEl\"]")
    WebElement genderFamily;
    //@FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-BirthYear-inputEl\"]")
    @FindBy(xpath = "/html/body/div[14]/div[2]/span/div/div/div/span/div/div/div/span/div/div/div/table/tbody/tr/td/div/div/span/div/div[1]/div/table/tbody[5]/tr/td[2]/table/tbody/tr/td[1]/input")
    WebElement dropdownTahunLahir;
    @FindBy(xpath = "/html/body/div[15]/div/ul/li[5]")
    //@FindBy(xpath = "//*[@id=\"boundlist-1266-listEl\"]/ul/li[5]") iki sing path biasa, sing duwur e gae xpath full
    WebElement nilaiDropdownTahunLahir;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-FamRelation-inputEl\"]")
    WebElement hubungan;
    @FindBy(xpath = "//*[@id=\"boundlist-1515-listEl\"]/ul/li[4]")
    WebElement nilaiHubungan;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-Education-inputEl\"]")
    WebElement pendidikanTerakhir;
    @FindBy(xpath = "//*[@id=\"boundlist-1516-listEl\"]/ul/li[3]")
    WebElement nilaiPendiTerakhir;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormFamily-Form-BtnSave-btnInnerEl\"]")
    WebElement buttonSaveFamily;

    //----------------Pekerja--------------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div/div/span/div/div[4]/div/span/div/div[1]/div/span/div/div/div[2]/span/div/div/div/span/div/div/div/table/tbody/tr/td/div/div[1]/div[1]/div[2]/div/a[4]")
    WebElement openTabPekerja;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.LabourGrid-BtnAdd-btnEl\"]")
    WebElement buttonAddPekerja;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormLabour-Form-LabName-inputEl\"]")
    WebElement namePekerja;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormLabour-Form-GenderM-inputEl\"]")
    WebElement genderPekerja;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormLabour-Form-Age-inputEl\"]")
    WebElement umur;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Farmers.WinFormLabour-Form-BtnSave-btnInnerEl\"]")
    WebElement buttonSavePekerja;


    public void wannaFarmerPage() throws InterruptedException {
        farmerMenu.isDisplayed();
        farmerMenu.click();
    }

    public void showPageFarmer() {
        halamanFarmer.isDisplayed();
        //Assert.assertEquals("Petani", halamanFarmer.getText());
    }

    public void buttonAddFarmer() throws InterruptedException {
        Thread.sleep(3000);
        buttonAddFarmer.click();
    }

    String uniq = RandomStringUtils.random(2, true, false);

    public void inputFormFarmerandSave() throws InterruptedException {
        Thread.sleep(3000);
        namaFarmer.sendKeys("Web Automate NCT " + uniq);
        genderFarmer.click();
        tglWawancara.sendKeys("2021-04-28");
        dateBirth.sendKeys("2000-01-01");
        Thread.sleep(1000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", wilayahTittle);
        Thread.sleep(1000);
        Assert.assertTrue(wilayah.isDisplayed());
        wilayah.click();
        filter.click();
        Assert.assertEquals("Kecamatan", nilaiFilter.getText());
        nilaiFilter.click();
        Thread.sleep(1000);
        negara.sendKeys("Indonesia", Keys.TAB);
        province.sendKeys("Jawa Tengah", Keys.TAB);
        kab.sendKeys("Banjarnegara", Keys.TAB);
        kec.sendKeys("Banjarnegara", Keys.TAB);
        buttonSearch.click();
        Thread.sleep(2500);
        pilihanWilayah.click();
        Thread.sleep(2500);
        jenisID.sendKeys("KTP Indonesia", Keys.TAB);
        Thread.sleep(1000);
        noID.sendKeys("9999111233");
        Thread.sleep(1000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", findPertanian);
        pertanian.click();
        buttonSavePetani.click();
    }

    public void showPageDetailPetani() throws InterruptedException {
        Thread.sleep(1000);
        farmerMenu.click();
        Thread.sleep(1000);
        halamanFarmer.isDisplayed();
        Assert.assertEquals("Petani", halamanFarmer.getText());
        actionDrop.click();
        Thread.sleep(1500);
        valueActionDrop.click();
        Thread.sleep(2500);
        dataPetaniTitle.isDisplayed();
        //System.out.println(dataPetaniTitle.getText());
        Assert.assertEquals("Data Petani", dataPetaniTitle.getText());
    }

    public void buttonAddGardenPetani() throws InterruptedException {
        buttonAddGarden.click();
        Thread.sleep(2000);
    }

    public void inputFormGardenandSave() throws InterruptedException {
        Thread.sleep(1000);
        noKebun.sendKeys("1", Keys.TAB);
        noSurvey.click();
        luasAreaHa.sendKeys("1");
        tabTanaman.click();
        moroheiyaKomoditi.click();
        buttonSaveKebun.click();
    }

    public void tabFamilyOpen() throws InterruptedException {
        Thread.sleep(1000);
        openTabFamily.click();
    }

    public void inputFormFamilyandSave() throws InterruptedException {
        Thread.sleep(1000);
        buttonAddFamily.click();
        namaMemberFamily.sendKeys("7 dream");
        genderFamily.click();
        Thread.sleep(1000);
        dropdownTahunLahir.click();
        Thread.sleep(1000);
        //nilaiDropdownTahunLahir.click(), Keys.DOWN;
        dropdownTahunLahir.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1500);
        hubungan.click();
        hubungan.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1000);
        pendidikanTerakhir.click();
        pendidikanTerakhir.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(1000);
        buttonSaveFamily.click();
    }

    public void tabPekerjaOpen() throws InterruptedException {
        Thread.sleep(1000);
        openTabPekerja.click();
    }

    public void inputFormPekerjaandSave() throws InterruptedException {
        Thread.sleep(1000);
        buttonAddPekerja.click();
        Thread.sleep(1000);
        namePekerja.sendKeys("7 dream nct");
        Thread.sleep(1000);
        genderPekerja.click();
        umur.sendKeys("20");
        Thread.sleep(1000);
        buttonSavePekerja.click();
    }


}
