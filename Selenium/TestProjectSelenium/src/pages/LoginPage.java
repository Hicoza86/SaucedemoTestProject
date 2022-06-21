package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By errorMessage = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    // By errorMessageInvUser = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    // By errorMessageInvPass = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");

    String baseURL = "https://www.saucedemo.com/";

    public LoginPage basePage(){// metoda vraca LoginPage objekat
        driver.get(baseURL);
        return this;// this omogucavanja vezivanje metoda
    }

    public LoginPage login (String username, String password){
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }
    
    public LoginPage verifyUnsuccessfullLogin ( String expectedText) {
        String error = readText(errorMessage);
        assertStringEquals(error, expectedText);
        return this;
    }

    // public LoginPage verifyInvalidUserTest ( String expectedText) {
    //     String errorIU = readText(errorMessageInvUser);
    //     assertStringEquals(errorIU, expectedText);
    //     return this;
    // }

}
