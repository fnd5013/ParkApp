/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.loginPageController;
import View.loginPage;

/**
 *
 * @author hayde
 */
public class loginPageController {//this controls the login gui
    private loginPage loginPage;
    private loginPageController loginCntrl;

    public loginPageController() {
        loginPage.loginButton.addActionListener(this);
        loginPage.setVisible(true);
    }
    
    
}
