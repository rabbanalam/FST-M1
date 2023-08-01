package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
    /*
    Goal: Open the leads page and print the usernames and full names from the table.
        a. Open the browser to the Alchemy CRM site and login.
        b. Navigate to the Sales -> Leads.
        c. Find the table on the page and print the first 10 values in the Name column and
        the User column of the table to the console.
        d. Close the browser
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
    public void Login() throws InterruptedException {
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        Actions action = new Actions(driver);
        WebElement Sales = driver.findElement(By.id("grouptab_0"));
        action.moveToElement(Sales).perform();
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        //  action.moveToElement(leads).click().perform();
        Thread.sleep(3000);
        for(int i=1;i<=10;i++) {
            WebElement leadDetails = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/b"));
            String leadName = leadDetails.getText();
            System.out.print(leadName);
            WebElement leadDetails2 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]"));
            String leadUserName = leadDetails2.getText();
            System.out.println(" --> "+leadUserName);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
