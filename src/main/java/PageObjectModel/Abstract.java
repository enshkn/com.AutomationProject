//Abstract.java
package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Driver;
import java.time.Duration;

public class Abstract {
    private final WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysFunction(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void selectElementFromDropdown(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select sic = new Select(element);
        sic.selectByVisibleText(text);
        // sic.selectByVisibleText(text);
    }


}
