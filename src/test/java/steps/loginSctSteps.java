package steps;

import pages.loginSctPages;

public class loginSctSteps {

    loginSctPages loginSct;

        public void inputUserLogin(){
            loginSct.loginSCTGlobal();
        }

        public void showDashboard(){
            loginSct.viewDashboard();
        }

        public void openDashboardWeb(){
            loginSct.open();
        }
}
