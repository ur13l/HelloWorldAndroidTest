package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Uriel on 03/07/2017.
 */
public class MainActivityPage extends BasePage {
    String app_package_name = "examples.uriel.helloworldkotlin:id/";
    By etTexto = By.id(app_package_name + "et_texto");
    By btnAceptar = By.id(app_package_name + "btn_aceptar");
    By tvHello = By.id(app_package_name + "tv_hello");

    public MainActivityPage(WebDriver driver) {
        super(driver);
    }

    public MainActivityPage displayHelloWorld() {
        waitForVisibilityOf(etTexto);
        driver.findElement(etTexto).sendKeys("Esto es un texto de prueba");
        driver.findElement(btnAceptar).click();
        Assert.assertEquals(driver.findElement(tvHello).getText(), driver.findElement(etTexto).getText());
        return new MainActivityPage(driver);
    }
}
