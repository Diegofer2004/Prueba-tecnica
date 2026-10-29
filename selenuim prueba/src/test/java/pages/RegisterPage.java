package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {
    private final By Cc = By.id("reg_username");
    private final By firstName = By.id("first_name");
    private final By lastName = By.xpath("//*[@id='last_name']");
    private final By email = By.id("reg_email");
    private final By password = By.id("reg_password");
    private final By confirmPassword = By.id("reg_password2");
    private final By registerBtn = By.name("register");
    private final By newsletterCheckbox = By.id("newsletter_authorization");
    private final By privacyPolicyCheckbox = By.id("privacy_policy_reg");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public void enterUsername(String user) {
        driver.findElement(Cc).clear();
        driver.findElement(Cc).sendKeys(user);
    }

    public void enterFirstName(String name) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(name);
    }

    public void enterEmail(String userEmail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String pass) {
        driver.findElement(confirmPassword).sendKeys(pass);
    }

    public void fillRegisterForm(
            String user,
            String name,
            String surname,
            String userEmail,
            String pass,
            String confirmPass) {

        enterUsername(user);
        enterFirstName(name);
        enterLastName(surname);
        enterEmail(userEmail);
        enterPassword(pass);
        enterConfirmPassword(confirmPass);
    }


    public void selectNewsletter() {
        if (!driver.findElement(newsletterCheckbox).isSelected()) {
            driver.findElement(newsletterCheckbox).click();
        }
    }

    public void selectPrivacyPolicy() {
        if (!driver.findElement(privacyPolicyCheckbox).isSelected()) {
            driver.findElement(privacyPolicyCheckbox).click();
        }
    }


    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(registerBtn)).click();
    }




}