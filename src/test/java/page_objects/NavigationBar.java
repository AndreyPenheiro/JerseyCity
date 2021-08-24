package page_objects;

import command_providers.Acton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import practice.Recursion;

public class NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    private final By MortgageCalculatorLogo = By.xpath("//a/img[@alt='Logo']");
    private final By RatesLink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");

    public WebDriver driver;

    public NavigationBar(WebDriver driver){
        this.driver = driver;
    }
    //Mouse Hover to the rates link
    public NavigationBar mouseHoverToRates(){
        LOGGER.debug("Mouse Hove to Rates link in the navigation bar");
        Acton.element(driver,RatesLink).mouseHover();
        return this;
    }

    //Click on Real Apr link
    public RealApr navigateToRealApr(){
        LOGGER.debug("Navigating to Real Apr page");
        Acton.element(driver,RealAprLink).click();
        return new RealApr(driver);
    }
    //Navigate to the Home page
    public Home navigateToHome(){
        LOGGER.debug("Navigating to Home page");
        Acton.element(driver, MortgageCalculatorLogo).click();
        return new Home(driver);
    }
}
