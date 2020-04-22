package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//a[@class='navbar-link fedora-navbar-link']")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='fedora-navbar-link navbar-link']")
    WebElement _practiceLink;

    @FindBy(id = "header-sign-up-btn")
    WebElement _signUpLink;




    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link " + _loginLink.toString());

    }


}


