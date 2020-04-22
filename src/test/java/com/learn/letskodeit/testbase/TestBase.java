package com.learn.letskodeit.testbase;

import com.learn.letskodeit.basepage.BasePage;
import com.learn.letskodeit.browserselector.BrowserSelector;
import com.learn.letskodeit.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    //String baseUrl = "https://learn.letskodeit.com//";
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void openBrowser() {

        browserSelector.selectorBrowser(browser);
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"sanity", "smoke", "regression"})
    public void tearDown() {
        driver.quit();

    }
}
