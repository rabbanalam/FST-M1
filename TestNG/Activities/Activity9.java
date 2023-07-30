package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();

        Reporter.log("|------ ------ Test Started ------ ------|");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Browser Opened Successfully ----------|");
        Reporter.log("Title of the page is: "+ driver.getTitle() + " |");
    }

    @BeforeMethod
    public void beforeMethod(){
        Reporter.log("Test case setup started |");
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertCase(){
        Reporter.log("Simple Alert Case () started ----------|");

        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert Clicked ---------|");

        //Switching to alert window
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to Alert ------|");

        //Retrieve text in alert box and print
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Asssertions
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
        simpleAlert.accept();
        Reporter.log("Alert Closed!");
        Reporter.log("Simple Alert case ended ------!");
    }
    @Test(priority = 1)
    public void confirmAlertCase(){
        Reporter.log("confirmAlertCase() Started ------|");

        //click button to open alert
        driver.findElement(By.id("confirm")).click();
        Reporter.log("confirm Alert Opened ------|");

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched to Alert window | ");

        //Retrieve text from alert box
        String alertText = confirmAlert.getText();
        Reporter.log("Alert Text is : "+ alertText+" |");

        //Assertions
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert Closed ------|");
        Reporter.log("Test case ended ------|");
    }
    @Test(priority = 2)
    public void promptAlertCase(){
        Reporter.log("Prompt Alert Case() started ------|");

        //Click the button to open simple alert
        driver.findElement(By.id("prompt")).click();
        Reporter.log("prompt alert opened   |");

        //Alert window
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Focused switchded to prompt alert   |");

        //Text from Alert window
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is : "+ alertText);

        //Assertions
        Assert.assertEquals("This is a JavaScript Prompt!",alertText);

        promptAlert.accept();
        Reporter.log("Alert Closed ------|");

        Reporter.log("Prompt Alert case Ended ------|");

    }
    @AfterClass
    public void tearDown(){
        Reporter.log("Ending the Test_Activity9 ------|");
        driver.close();
    }
}
