package CRMProject_Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    /*
        2. Get the url of the header image
        Goal: Print the url of the header image to the console
            a. Open a browser.
            b. Navigate to ‘ http://alchemy.hguy.co/crm ’.
            c. Get the url of the header image.
            d. Print the url to the console.
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
    //css selector = .companylogo > img:nth-child(1)
    @Test
    public void getImgURL(){
        System.out.println("Title of the page is : " + driver.getTitle());

        //Image URL hunt below:
        String imgUrl = driver.findElement(By.cssSelector(".companylogo > img:nth-child(1)")).getAttribute("src");
        System.out.println("Image URL: " + imgUrl);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
