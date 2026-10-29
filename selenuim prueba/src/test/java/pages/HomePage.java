package pages;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    // ── Locators ──
    private final By zapatos     = By.id("menu-item-10");
    private final By bolsos      = By.id("menu-item-8");
    private final By cinturones  = By.id("menu-item-9");
    private final By outlet      = By.id("menu-item-355651");
    private final By accesorios  = By.id("menu-item-7");
    private final By searchBtn = By.xpath("//*[@id='search-btn']");
    private final By accountMenu = By.xpath("//*[@id=\"toggle-account-menu\"]");
    private final By card    = By.id("image-1035212");
    private final By busqueda  = By.id("s");
    private final By toggleDesktopMenu = By.id("toggle-side-menu");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // ── Acciones ──
    public void clickZapatos() {
        driver.findElement(zapatos).click();
    }

    public void clickBolsos() {
        driver.findElement(bolsos).click();
    }

    public void clickCinturones() {
        driver.findElement(cinturones).click();
    }

    public void clickOutlet() {
        driver.findElement(outlet).click();
    }

    public void clickAccesorios() {
        driver.findElement(accesorios).click();
    }

    public void llenarBusqueda(String producto) {
        driver.findElement(busqueda).sendKeys(producto);
    }



    public void clickSearch() {
        driver.findElement(searchBtn).click();
    }

    public void clickAccount() {
        driver.findElement(accountMenu).click();
    }



//
    public void clickCard() {
        driver.findElement(card).click();
    }


    // ── Acción ──
    public void clickToggleDesktopMenu() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(toggleDesktopMenu)).click();
        } catch (TimeoutException e) {
            // No apareció, se ignora
        }
    }


}