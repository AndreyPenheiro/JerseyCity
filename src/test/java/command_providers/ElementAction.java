package command_providers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class ElementAction {
    private static final Logger LOGGER = LogManager.getLogger(ElementAction.class);
    private By locators;
    private WebDriver driver;

    public ElementAction(WebDriver driver, By locator){
        this.driver = driver;
        this.locators = locator;
    }

    public WebElement getElement() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = null;
        try {
            element = driver.findElement(locators);
        }catch (Exception e){
            LOGGER.error("Element Exception for the locator" + locators + "and exception is:" + e);
        }
        return element;
    }

    public  ElementAction click() {
        getElement().click();
        return this;
    }

    public ElementAction setValue (String value) {
        getElement().clear();
        getElement().sendKeys(value);
        return this;
    }
    public ElementAction selectValue(String value) {
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
        return this;

    }

    public ElementAction mouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).perform();
        return this;
    }
     public String getTextValue() {
        return getElement().getText();

    }
}
