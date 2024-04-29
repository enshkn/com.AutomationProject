package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static Utilities.Driver.getDriver;


public class TestCase01{
    WebDriver driver;
    PageObjectModel.TestCase01 testCase01 = new PageObjectModel.TestCase01();

    @Given("go to the website {string}")
    public void goToTheWebsite(String arg0) {
        driver = getDriver();
        driver.get(arg0);
    }

    @When("click to signup-login button")
    public void clickToButton() {
        testCase01.clickToSignUpLoginButton();
    }

    @When("send {string} to name field")
    public void sendToNameField(String arg0) {
        testCase01.sendToNameField(arg0);
    }

    @When("send {string} to email field")
    public void sendToEmailField(String arg0) {
        testCase01.sendToEmailField(arg0);
    }

    @When("click to signup button")
    public void clickToSignupButton() {
        testCase01.clickToSignUpButton();
    }

    @Then("check the area and see the text {string}")
    public void checkTheAreaAndSeeTheText(String arg0) {
        String seen = testCase01.getTextFromArea();
        Assert.assertEquals(arg0, seen);

    }
}
