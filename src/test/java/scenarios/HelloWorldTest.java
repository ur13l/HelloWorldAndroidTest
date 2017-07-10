package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainActivityPage;
import scenarios.AndroidSetup;

/**
 * Created by Uriel on 03/07/2017.
 */
public class HelloWorldTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void clickButton() {
        new MainActivityPage(driver).displayHelloWorld();
    }
}
