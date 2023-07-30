package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void browserSetup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void loginPageTest(){
        WebElement userName = driver.findElement(By.id("username"));
        WebElement passWord = driver.findElement(By.id("password"));

        userName.sendKeys("admin");
        passWord.sendKeys("password");

        //Click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String msg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message is : " + msg);
        Assert.assertEquals("Welcome Back, admin", msg);
    }

    @AfterClass
    public void clearBrowser(){
        driver.close();
    }
}
