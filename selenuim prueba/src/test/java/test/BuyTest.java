

package test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CardPage;
import pages.HomePage;
import pages.LoginPage;

public class BuyTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bon-bonite.com/");
            driver.manage().window().maximize();

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            CardPage cardPage = new CardPage(driver);

            // 1. Iniciar sesión primero
            homePage.clickAccount();
            Thread.sleep(3000);

            loginPage.enterUsername("32135485");
            loginPage.enterPassword("ClavePrueba123!");
            loginPage.clickLogin();
            Thread.sleep(3000);

            // 2. Continuar con la compra
            homePage.clickBolsos();
            homePage.clickCard();
            cardPage.clickBuyNow();
            cardPage.Confirmbuy();
            cardPage.FinalBuy();
            Thread.sleep(3000);
            cardPage.setCheckBox();
            cardPage.ingresarTelefono("3001234567");
            cardPage.seleccionarDepartamento();
            cardPage.seleccionarCiudad();
            cardPage.ingresarDireccion("Calle 10 # 20-30");
            //Thread.sleep(60000);
            // Subir hasta la parte superior de la página
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
            Thread.sleep(3000);
            cardPage.RegisterBuy();
            Thread.sleep(300000);



            System.out.println("Prueba de login y compra finalizada.");

        } finally {
            driver.quit();
        }
    }
}
