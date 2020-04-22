package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By loginBt = By.xpath("//input[@name='commit']");

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String samepassword){
        sendTextToElement(passwordField, samepassword);
    }
    public void clickOnLoginBt(){
        clickOnElement(loginBt);
    }
}
