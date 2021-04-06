import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverManager {

    public static WebDriver initDriver(String webDriverType) throws Exception {
        if (webDriverType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", getWebDriverPath("chrome"));
            return new ChromeDriver();
        } else if(webDriverType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", getWebDriverPath("firefox"));
            return new FirefoxDriver();
        } else {
            throw new Exception("THe selected webdriver does not exist or is not valid.");
        }
    }

    public static String getWebDriverPath(String webDriverType) throws IOException, FileNotFoundException {
        Properties prop = new Properties();

        FileInputStream propertiesFile = new FileInputStream("guitests/config.properties");
        prop.load(propertiesFile);
        System.out.println(prop.getProperty(webDriverType +"WebdriverPath"));
        return prop.getProperty(webDriverType +"WebdriverPath");
    }
}
