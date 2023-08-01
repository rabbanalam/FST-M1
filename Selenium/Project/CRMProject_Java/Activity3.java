package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    /*
    3. Get the copyright text
        Goal: Print the first copyright text in the footer to the console
            a. Open a browser.
            b. Navigate to ‘ http://alchemy.hguy.co/crm ’.
            c. Get the first copyright text in the footer.
            d. Print the text to the console.
            e. Close the browser.
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
    public void getTextfromFooter(){
        System.out.println("Title of the page is : " + driver.getTitle());

        //Footer text from the current page.
        String footerText = driver.findElement(By.id("admin_options")).getText();
        System.out.println("Footer text which you were looking for is : "+ footerText);

    }
    @AfterClass
    public void tearDown(){
        //close the browser
        driver.quit();
    }
}
