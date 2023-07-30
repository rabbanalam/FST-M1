package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setupBrowser(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Browser open
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username","password"})
    public void loginForm(String username,String password){
        //Find username and password text field
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passWordField = driver.findElement(By.id("password"));

        //Send keys from parameters
        userNameField.sendKeys(username);
        passWordField.sendKeys(password);

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assertion
        String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMsg,"Welcome Back, admin");
    }
    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
