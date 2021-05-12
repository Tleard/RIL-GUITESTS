package pages;

import util.DriverManager;

public class LoginPage extends DriverManager {

    /**
     * Fill Login Text Box with passed value
     * @param username
     */
    public static void fillLoginTextBox(String username) {
        LoginElement.loginTextBoxElement().sendKeys(username);
    }

    /**
     * Fill Password Text box with passed value
     * @param username
     */
    public static void fillPasswordTextBox(String username) {
        LoginElement.passwordTextBoxElement().sendKeys(username);
    }

    /**
     * Click Connexion Button
     */
    public static void clickConnexionButton() {
        LoginElement.ConnexionButtonElement().click();
    }
}
