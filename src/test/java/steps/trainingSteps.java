package steps;

import pages.trainingPages;

public class trainingSteps {

    trainingPages addTraining;

    public void openTraining() throws InterruptedException  {
    }

    public void inTrainingPage() throws InterruptedException {
        addTraining.wannaTrainingPage();
    }

    public void displayMessage(){

        addTraining.showPageTraining();
    }

    public void setAddTrainingNew() throws InterruptedException{
        addTraining.buttonAddtraining();
        addTraining.inputFormTrainingandSave();
    }
}
