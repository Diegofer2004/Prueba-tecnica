package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginBtn = By.name("login");
    private final By errorMsg = By.cssSelector(".error-message");
    private final By newAccount = By.id("show_register");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public String getErrorMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMsg)
        ).getText();
    }

    public void CreateNewAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(newAccount)).click();
    }
}
