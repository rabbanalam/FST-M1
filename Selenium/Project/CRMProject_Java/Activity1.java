package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    /*
    Verify the website title
    Goal: Read the title of the website and verify the text
        a. Open a browser.
        b. Navigate to ‘ http://alchemy.hguy.co/crm ’.
        c. Get the title of the website.
        d. Make sure it matches “SuiteCRM” exactly.
        e. If it matches, close the browser.
     */

    //Setup firefox driver
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();

        //Instance of the driver
        driver = new FirefoxDriver();

        //Opening URL in browser
        driver.get("http://alchemy.hguy.co/crm");

    }

    @Test
    public void getWebsiteTitle(){
        String pageTitle = driver.getTitle();
        System.out.println("Title of the CRM Website is: "+ pageTitle);
        //Assertions
        Assert.assertEquals(pageTitle,"SuiteCRM");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
