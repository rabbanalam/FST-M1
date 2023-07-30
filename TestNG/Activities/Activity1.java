package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    //Driver instance
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://training-support.net");
    }

    @Test
    public void activityTestCase() throws InterruptedException {
        String titlePage = driver.getTitle();
        System.out.println("Title page: " +titlePage);
        Assert.assertEquals("Training Support",titlePage);

        Thread.sleep(3000);

        driver.findElement(By.id("about-link")).click();
        System.out.println("After clicking on about US, Title Page : "+ driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
