package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {
    /*
    7. Reading additional information
        Goal: Reading a popup that contains additional information about the account/lead.
            a. Open the browser to the Alchemy CRM site and login.
            b. Navigate to Sales -> Leads
            c. In the table, find the Additional information icon at the end of the row of the lead
               information. Click it.
            d. Read the popup and print the phone number displayed in it.
            e. Close the browser.
     */
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();

        //Instance of the driver
        driver = new FirefoxDriver();

        //Opening URL in browser
        driver.get("http://alchemy.hguy.co/crm");

    }

    @Test
    public void LoginToWebsite() {
        System.out.println("Activity7, Title Page of is : " + driver.getTitle());

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

        //Checking And Making Sure 'Activity' is present in Navigation Menu
        String activitiesTab = driver.findElement(By.id("grouptab_3")).getText();
        System.out.println("Tab Name is : " + activitiesTab);

        //Assertions
        Assert.assertEquals(activitiesTab, "ACTIVITIES");
    }

    @Test
    public void navigateToSalesAndGetPhoneDetails() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("grouptab_0")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        String validSalesWindow = driver.findElement(By.className("recent_h3")).getText();
        //Assertions
        Assert.assertEquals(validSalesWindow, "Recently Viewed");
        System.out.println("New Window Opened, Confirmation text is :" + validSalesWindow);

        Thread.sleep(Long.parseLong("2000"));

        System.out.println("Waited for the event !!");

        driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-action-info']")).click();
        Thread.sleep(Long.parseLong("2000"));
//        String pageSourceTxt=driver.getPageSource();
//        System.out.println("PageSource :" + pageSourceTxt);

        String phoneNumber = driver.findElement(By.xpath("//span[@class='phone']")).getText();
////        Alert iHelpButton = driver.switchTo().alert();
////        String iHelpButtontext = iHelpButton.getText();
        System.out.println("Prompt window, Phone Number is : " + phoneNumber);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
