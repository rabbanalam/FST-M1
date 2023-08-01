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

public class Activity8 {
    /*
    8. Traversing tables
        Goal: Open the accounts page and print the contents of the table.
            a. Open the browser to the Alchemy CRM site and login.
            b. Navigate to the Sales -> Accounts page.
            c. Find the table on the page and print the names of the first 5 odd-numbered rows
            of the table to the console.
            d. Close the browser.
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

    }

    @Test
    public void navigateToAccountsTable() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("grouptab_0")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        String validSalesWindow = driver.findElement(By.className("recent_h3")).getText();
        //Assertions
        Assert.assertEquals(validSalesWindow, "Recently Viewed");
        System.out.println("New Window Opened, Confirmation text is :" + validSalesWindow);
        /*
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

         */

        //Think Time
        Thread.sleep(2000);

        //look for table
        String h2Text = driver.findElement(By.className("module-title-text")).getText();
        System.out.println("header 2 is : " + h2Text);

        //WebElement rowsdata = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[contains(@class, 'oddListRowS1')]/td[contains(@class, 'inlineEdit')]"));
//        for (int i = 0; i <5 ; i++){
//            WebElement rowsdata = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/form[2]/div[3]/table/tbody/tr[2]")
//            System.out.println(rowsdata.getText());
//        }

        for(int i=1;i<=13;i=i+2){

            WebElement rowdata = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/b"));
            System.out.println(rowdata.getText());
        }

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
