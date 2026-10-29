
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class HomeTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bon-bonite.com/");

            HomePage homePage = new HomePage(driver);

            driver.manage().window().maximize();

            homePage.clickZapatos();
            driver.navigate().back();

            homePage.clickBolsos();
            driver.navigate().back();

            homePage.clickCinturones();
            driver.navigate().back();

            homePage.clickOutlet();
            driver.navigate().back();

            homePage.clickAccesorios();
            driver.navigate().back();

//            homePage.clickSearch();
//            driver.navigate().back();
//
//            homePage.clickAccount();
//            driver.navigate().back();
//
//            homePage.clickCart();

            System.out.println("Prueba finalizada correctamente.");

        } finally {
            driver.quit();
        }
    }
}
