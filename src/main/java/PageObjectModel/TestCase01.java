package PageObjectModel;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.Driver.closeDriver;

public class TestCase01 extends Abstract{

    private WebDriver driver;
    public TestCase01(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(.,'Signup / Login')]")
    public WebElement signUpLoginButton;
    public void clickToSignUpLoginButton() {
        try {
            clickFunction(signUpLoginButton);
            System.out.println("Clicked to sign up login button");
        } catch (Exception e) {
            e.printStackTrace();
    }
}

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;
    public void sendToNameField(String name) {
        try {
            sendKeysFunction(nameField, name);
            System.out.println("Sent to name field");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//div[@class='signup-form']//input[@name='email']")
    public WebElement emailField;
    public void sendToEmailField(String email) {
        try {
            sendKeysFunction(emailField, email);
            System.out.println("Sent to email field");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signUpButton;
    public void clickToSignUpButton() {
        try {
            clickFunction(signUpButton);
            System.out.println("Clicked to sign up button");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(css = ".login-form > .title > b")
    public WebElement textArea;
    public String getTextFromArea() {
        return textArea.getText();
    }



    @After
    public static void tearDown() {
        closeDriver();
        System.out.println("Driver closed");
    }

}