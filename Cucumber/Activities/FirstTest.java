package stepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest extends BaseClass {
    @BeforeAll
    public static void setUp() {
        //Gecko driver installation
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriverManager.firefoxdriver().setup();
        // initialize the driver
        driver = new FirefoxDriver();
        // initialize wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("the user is on TS Home page")
    public void TsHomepage() {

        driver.get("https://www.training-support.net/");
        Assertions.assertEquals("Training Support", driver.getTitle());

    }
    @When("the user click on About us Link")
    public void clickAboutUsLink() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("about-link"))).click();

    }

    @Then("user are redirected to the About page")
    public void verifyAboutPage(){
        Assertions.assertEquals("About Training Support",driver.getTitle());
    }

    @Then("close the browser")
    public void closeBrowser(){

        driver.close();

    }


}
