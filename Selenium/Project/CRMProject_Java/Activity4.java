package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    /*
    4. Logging into the site
        Goal: Open the site and login with the credentials provided
            a. Open the browser
            b. Navigate to ‘ https://alchemy.hguy.co/crm ’.
            c. Find and select the username and password fields
            d. Enter login credentials into the respective fields
            e. Click login
            f. Verify that the homepage has opened.
            g. Close the browser.
     */

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
    public void loginToWebsite(){
        System.out.println("Activity3, Title Page of is : "+ driver.getTitle());

        //login logic
        WebElement userName = driver.findElement(By.id("user_name"));
        WebElement passWord = driver.findElement(By.id("username_password"));

        //passing credentials
        userName.sendKeys("admin");
        passWord.sendKeys("pa$$w0rd");

        //find login button and click on it
        driver.findElement(By.id("bigbutton")).click();

        //New Page
        String AfterLoginPage = driver.findElement(By.id("tab0")).getText();
        System.out.println("After login, you should get dashboard : "+AfterLoginPage);

        //Assertions
        Assert.assertEquals(AfterLoginPage,"SUITECRM DASHBOARD");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
