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

public class Activity6 {
    /*
    6.  Menu checking
        Goal: Make sure that the “Activities” menu item exists and is clickable
            a. Open a browser.
            b. Navigate to ‘ http://alchemy.hguy.co/crm ’ and login using the credentials
            provided.
            c. Locate the navigation menu.
            d. Ensure that the “Activities” menu item exists.
            e. Close the browser
     */

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();

        //Instance of the driver
        driver = new FirefoxDriver();

        //Opening URL in browser
        driver.get("http://alchemy.hguy.co/crm");

    }

    @Test
    public void findActivitiesTabOnNavigationMenu() {
        System.out.println("Activity3, Title Page of is : " + driver.getTitle());

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
        System.out.println("After login, you should get dashboard : " + AfterLoginPage);

        //Assertions
        Assert.assertEquals(AfterLoginPage, "SUITECRM DASHBOARD");

        //Finding Color
        String colorOfBar = driver.findElement(By.id("toolbar")).getCssValue("color");
        System.out.println("Color of the Navigation Menu toolbar is: " + colorOfBar);

        //Checking And Making Sure 'Activity' is present in Navigation Menu
        String activitiesTab = driver.findElement(By.id("grouptab_3")).getText();
        System.out.println("Tab Name is : " + activitiesTab);
        //Assertions
        Assert.assertEquals(activitiesTab, "ACTIVITIES");    //validation wherther Tab is present

        driver.findElement(By.id("grouptab_3")).click();
        String afterClickOnTab = driver.findElement(By.id("moduleTab_9_Calls")).getText();
        Assert.assertEquals(afterClickOnTab,"Calls");
        System.out.println("Activities Tab Bar is clickable!!");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
