package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bon-bonite.com/");
            driver.manage().window().maximize();

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);


            homePage.clickAccount();
            Thread.sleep(3000);


            loginPage.enterUsername("32135485");
            loginPage.enterPassword("ClavePrueba123!");

            // Hacer clic en iniciar sesión
            loginPage.clickLogin();
            Thread.sleep(3000);


            System.out.println("Se hizo clic en iniciar sesión.");

        } finally {
            driver.quit();
        }
    }
}
