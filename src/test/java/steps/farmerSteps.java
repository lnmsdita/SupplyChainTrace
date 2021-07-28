package steps;

import pages.farmerPages;

public class farmerSteps {

    farmerPages addFarmer;

    public void openFarmer() throws InterruptedException  {
    }

    public void inFarmerPage() throws InterruptedException {
        addFarmer.wannaFarmerPage();
    }

    public void displayMessage(){
        addFarmer.showPageFarmer();
    }

    public void addFarmerNew() throws InterruptedException{
        addFarmer.buttonAddFarmer();
        addFarmer.inputFormFarmerandSave();
    }

    public void openDetailPetani() throws InterruptedException{
        addFarmer.showPageDetailPetani();
    }

    public void addGardenFarmerSave() throws InterruptedException{
        addFarmer.buttonAddGardenPetani();
        addFarmer.inputFormGardenandSave();
    }

    public void addNewAndSaveFamily() throws InterruptedException{
        addFarmer.tabFamilyOpen();
        addFarmer.inputFormFamilyandSave();
    }

    public void addNewAndSavePekerja() throws InterruptedException{
        addFarmer.tabPekerjaOpen();
        addFarmer.inputFormPekerjaandSave();
    }
}
