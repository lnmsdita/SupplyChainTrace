package pages;

import com.ibm.icu.impl.ICUService;
import net.serenitybdd.screenplay.questions.TheCoordinates;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class smePages extends PageObject {
    @FindBy(xpath = "//*[@id=\"WrapperLeftSidebar\"]/div/ul/li[4]/a")
    WebElement smeMenu;
    @FindBy(id = "breadcrumb_title")
    WebElement halamanSME;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainGrid.BtnAdd-btnInnerEl\"]")
    WebElement buttonAddSme;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-ExternalID-inputEl\"]")
    WebElement externalID;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-OwnerName-inputEl\"]")
    WebElement namaSme;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-IdentityNum-inputEl\"]")
    WebElement identityNumber;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Birthdate-inputEl\"]")
    WebElement dateBirth;
    @FindBy(xpath = "//*[@id=\"ext-gen1756\"]/a")
    WebElement nilaiDateBirth;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Company-labelEl\"]")
    WebElement titleNamaPT;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Company-inputEl\"]")
    WebElement namaPerusahaan;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-CompanyYear-inputEl\"]")
    WebElement tahunTerbentuk;
    //@FindBy(xpath = "//*[@id=\"ext-gen1515\"]")
    @FindBy(xpath = "//*[@id=\"ext-gen1296\"]")
    WebElement companyStatus;
    @FindBy(xpath = "/html/body/div[8]/div/ul/li[5]")
    WebElement valueCompStatus;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-CmbSmeRole-inputEl\"]")
    WebElement peranSme;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-CmbTypeBS-inputEl\"]")
    WebElement typeofBS;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-GenderM-inputEl\"]")
    WebElement genderSme;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Handphone-inputEl\"]")
    WebElement noTlpn;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Education-inputEl\"]")
    WebElement pendidikanTerakhir;
    @FindBy(xpath = "//*[@id=\"ext-gen1596\"]")
    WebElement comboPendiTerakhir;
    @FindBy(xpath = "//*[@id=\"boundlist-1203-listEl\"]/ul/li[4]")
    WebElement valuePendiTerakhir;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-SectionSMELocation_header_hd-textEl\"]")
    WebElement titleWilayahSme;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-BtnSelectRegion-btnIconEl\"]")
    WebElement wilayah;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterRegionBy-inputEl\"]")
    WebElement filter;
    //@FindBy(xpath = "//*[@id=\"boundlist-1230-listEl\"]/ul/li[2]")
    @FindBy(xpath = "//*[@id=\"boundlist-1139-listEl\"]/ul/li[2]")
    WebElement nilaiFilter;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterCountry-inputEl\"]")
    WebElement negara;
    @FindBy(xpath = "//*[@id=\"boundlist-1231-listEl\"]/ul/li")
    WebElement nilaiNegara;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterProvince-inputEl\"]")
    WebElement provinsi;
    @FindBy(xpath = "//*[@id=\"boundlist-1233-listEl\"]/ul/li")
    WebElement nilaiProvinsi;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterDistrict-inputEl\"]")
    WebElement kabupaten;
    @FindBy(xpath = "//*[@id=\"boundlist-1235-listEl\"]/ul/li[1]")
    WebElement nilaiKab;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-CmbFilterSubDistrict-inputEl\"]")
    WebElement kecamatan;
    @FindBy(xpath = "//*[@id=\"boundlist-1237-listEl\"]/ul/li[3]")
    WebElement nilaiKec;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.Widget.WinSelectRegion-BtnSearch-btnInnerEl\"]")
    WebElement buttonSearchFilter;
    //@FindBy(xpath = "//*[@id=\"gridview-1122-record-ext-record-52\"]/td[1]/div/img")
    //@FindBy(xpath = "//img[contains(@src,'https://demo.supplychaintrace.com//images/icons/silk/control_add_blue.png')]")
    @FindBy(xpath = "/html/body/div[10]/div[2]/span/div/div/div[3]/div/table/tbody/tr[2]/td[1]/div/img")
    WebElement pilihanfilter;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Address-inputEl\"]")
    WebElement alamatNote;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Latitude-inputEl\"]")
    WebElement latitude;
    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-Longitude-inputEl\"]")
    WebElement longitude;

    @FindBy(xpath = "//*[@id=\"Koltiva.view.SME.MainForm-FormBasicData-BtnSave-btnInnerEl\"]")
    WebElement buttonSimpanSme;

    public void wannaSMEPage() throws InterruptedException {
        smeMenu.isDisplayed();
        smeMenu.click();
    }

    public void showPageSME() {
        halamanSME.isDisplayed();
        //Assert.assertEquals("SME", halamanSME.getText());
    }

    public void buttonAddSME() throws InterruptedException {
        Thread.sleep(3000);
        buttonAddSme.click();
    }

    String uniq = RandomStringUtils.random(2, true, false);
    String uniq2 = RandomStringUtils.random(2, false, true);

    public void inputFormSMEandSave() throws InterruptedException {
        Thread.sleep(3000);
        externalID.sendKeys("129NCT " + uniq);
        namaSme.sendKeys("Nama Sme Automate " + uniq);
        identityNumber.sendKeys("1279900" + uniq);
        dateBirth.sendKeys("2000-01-01");
        Thread.sleep(1000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", titleNamaPT);
        Thread.sleep(1000);
        Assert.assertTrue(namaPerusahaan.isDisplayed());
        namaPerusahaan.sendKeys("PT Satu Persen " + uniq);
        tahunTerbentuk.sendKeys("2019", Keys.TAB);
        Thread.sleep(1000);
        companyStatus.click();
        valueCompStatus.click();
        Thread.sleep(1000);
        peranSme.sendKeys("Buyer", Keys.TAB);
        Thread.sleep(1000);
        typeofBS.sendKeys("Pedagang", Keys.TAB);
        Thread.sleep(1000);
        genderSme.click();
        noTlpn.sendKeys("+6211119999");
        pendidikanTerakhir.sendKeys("Sekolah Menengah Atas (SMA)", Keys.TAB);
        Thread.sleep(1000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", titleWilayahSme);
        Thread.sleep(1000);
        Assert.assertTrue(wilayah.isDisplayed());
        wilayah.click();
        filter.click();
        Thread.sleep(1500);
        //Assert.assertEquals("Kecamatan", nilaiFilter.getText());
        filter.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        Thread.sleep(3000);
        //nilaiFilter.click();
        //Thread.sleep(2000);
        negara.sendKeys("Indonesia", Keys.TAB);
        provinsi.sendKeys("Jawa Tengah", Keys.TAB);
        kabupaten.sendKeys("Banjarnegara", Keys.TAB);
        kecamatan.sendKeys("Banjarnegara", Keys.TAB);
        buttonSearchFilter.click();
        Thread.sleep(2500);
        pilihanfilter.click();
        Thread.sleep(2500);
        alamatNote.sendKeys("Alamat automation detail");
        latitude.sendKeys("-7.205851");
        longitude.sendKeys("109.819269");
        buttonSimpanSme.click();
    }

}