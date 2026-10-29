package pages;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CardPage extends BasePage {

    // ── Locators ──
    private final By buy = By.cssSelector("a.buy_now_link");
    private final By confirmBuy = By.cssSelector("a.checkout-button");
    private final By finalBuy = By.xpath("//button[normalize-space()='Continuar']");
    private final By checkBox = By.id("terms");
    private final By registerBuy =  By.xpath("//button[@type='submit' and @id='place_order']");
    private final By telefono = By.id("billing_phone");
    private final By departamento = By.id("select2-billing_state-container");
    private final By ciudad = By.id("select2-billing_city-container");
    private final By direccion = By.id("billing_address_1");

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyNow() {
        driver.findElement(buy).click();
    }
    public void Confirmbuy() {
        driver.findElement(confirmBuy).click();
    }
    public void FinalBuy() {
        driver.findElement(finalBuy).click();
    }
    public void setCheckBox() {
        driver.findElement(checkBox).click();
    }
    public void RegisterBuy() {
        driver.findElement(registerBuy).click();
    }

    public void ingresarTelefono(String numero) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(telefono))
                .sendKeys(numero);
    }



    public void seleccionarDepartamento() {
        wait.until(ExpectedConditions.elementToBeClickable(departamento)).click();

        By valleDelCauca = By.xpath(
                "//li[contains(@class,'select2-results__option') and normalize-space()='Valle del Cauca']"
        );

        wait.until(ExpectedConditions.elementToBeClickable(valleDelCauca)).click();
    }


    public void seleccionarCiudad() {
        wait.until(ExpectedConditions.elementToBeClickable(ciudad)).click();

        By cali = By.xpath(
                "//li[contains(@class,'select2-results__option') and normalize-space()='Cali']"
        );

        wait.until(ExpectedConditions.elementToBeClickable(cali)).click();
    }


    public void ingresarDireccion(String direccionTexto) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(direccion))
                .sendKeys(direccionTexto);
    }


}