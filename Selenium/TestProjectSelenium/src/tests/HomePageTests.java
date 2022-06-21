package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseTest{
    
    public LoginPage loginPage;
    public HomePage homePage;

    int numberOfAllItems = 6;

    String prvi = "ALL ITEMS";
    String drugi = "ABOUT";
    String treci = "LOGOUT";

    @Test
    public void checkNumberOfItemsOnHomePage() {

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        
        loginPage.basePage();
        loginPage.login(validUsername, validPassword);
        homePage.validateNumberOfProducts(numberOfAllItems);
    }
    @Test
    public void validLoginTest() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(validUsername, validPassword);
        homePage.openMenu();
        homePage.verifyMenuTitles(prvi, drugi, treci);

        // try {
        //     Thread.sleep(3000); 
        // } catch (InterruptedException exception) {
        //     exception.printStackTrace();
        // }
    }
}


