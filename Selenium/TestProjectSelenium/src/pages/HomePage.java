package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);// prosledjuje ga BasePage
    }
    
    By headerTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By numberOfItemsBy = By.xpath("//*[@class='inventory_item']");

    By buttonMenuBy = By.xpath("//*[@id='react-burger-menu-btn']");
    By button1 = By.xpath("//*[@id='inventory_sidebar_link']");
    By button2 = By.xpath("//*[@id='about_sidebar_link']");
    By button3 = By.xpath("//*[@id='logout_sidebar_link']");

    public HomePage verifyLogin ( String expectedText) {
        String pageTitle = readText(headerTitleBy);
        assertStringEquals(pageTitle, expectedText);
        return this;// homepage
    }
    public HomePage validateNumberOfProducts(int expectedNumberOfProducts){
        int actualNumberOFProducts = locateElements(numberOfItemsBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
        return this;
    }

    public HomePage verifyMenuTitles ( String expectedText1, String expectedText2, String expectedText3) {
        String menuTitle1 = readText(button1);
        assertStringEquals(menuTitle1, expectedText1);

        String menuTitle2 = readText(button2);
        assertStringEquals(menuTitle2, expectedText2);

        String menuTitle3 = readText(button3);
        assertStringEquals(menuTitle3, expectedText3);
        
        return this;
    }
    public HomePage openMenu () {
        click(buttonMenuBy);
        return this;
    }
}