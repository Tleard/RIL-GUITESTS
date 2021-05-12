package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class DriverManager {

    public static WebDriver driver;
    public static EventFiringWebDriver e_driver;

    public static void Initialization() throws IOException {
        Properties prop = new Properties();

        Path fileName = Path.of("config.properties");
        FileInputStream propertiesFile = new FileInputStream(String.valueOf(fileName));

        prop.load(propertiesFile);
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeWebdriverPath"));
            driver = new ChromeDriver();
        }
        else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxWebdriverPath"));
            driver = new FirefoxDriver();
        }

        e_driver = new EventFiringWebDriver(driver);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}