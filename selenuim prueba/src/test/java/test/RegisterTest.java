package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bon-bonite.com/");

            driver.manage().window().maximize();

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            RegisterPage registerPage = new RegisterPage(driver);

            homePage.clickAccount();
            Thread.sleep(3000);

            loginPage.CreateNewAccount();
            Thread.sleep(3000);

            registerPage.fillRegisterForm(
                    "32135485",
                    "Carlos",
                    "Perez",
                    "correo_prueba@example.com",
                    "ClavePrueba123!",
                    "ClavePrueba123!"
            );

            registerPage.selectPrivacyPolicy();
            registerPage.selectNewsletter();


            registerPage.clickRegister();
            Thread.sleep(3000);

            System.out.println("Formulario de registro completado correctamente.");

        } finally {
            driver.quit();
        }
    }
}