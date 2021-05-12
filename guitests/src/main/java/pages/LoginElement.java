package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DriverManager;

public class LoginElement extends DriverManager {

    @FindBy(xpath = "//input[@id='login']")
    private WebElement loginTextBox;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextBox;

    public static WebElement loginTextBoxElement() {
        return driver.findElement(By.xpath("//input[@id='login']"));
    }

    public static WebElement passwordTextBoxElement() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public static WebElement ConnexionButtonElement() {
        return driver.findElement(By.xpath("//span[text()='Connexion']"));
    }

}
