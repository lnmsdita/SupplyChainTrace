package steps;

import pages.smePages;

public class smeSteps {

    smePages addSme;

    public void openSme() throws InterruptedException  {
    }

    public void inSmePage() throws InterruptedException {
        addSme.wannaSMEPage();
    }

    public void displayMessage(){
        addSme.showPageSME();
    }

    public void addSmeNew() throws InterruptedException{
        addSme.buttonAddSME();
        addSme.inputFormSMEandSave();
    }
}
