import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import util.DriverManager;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest extends DriverManager {

    @BeforeMethod
    public void init() throws IOException {
        Initialization();
        driver.get("http://127.0.0.1:3000/");
    }

    @Test
    public static void UserLogin() {
        LoginPage.fillLoginTextBox("admin");
        LoginPage.fillPasswordTextBox("admin1");
        LoginPage.clickConnexionButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.fillLoginTextBox("admin");
        LoginPage.fillPasswordTextBox("admin1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.clickConnexionButton();
    }


}
