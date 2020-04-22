package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();

    }

    @Test(groups = "regression")

    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();


    }

}
