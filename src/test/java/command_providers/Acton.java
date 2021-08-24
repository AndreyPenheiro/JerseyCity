package command_providers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Acton {
    public static BrowserAction browser(WebDriver driver){
        return new BrowserAction(driver);
    }
    public static ElementAction element(WebDriver driver, By locator) {
        return new ElementAction(driver, locator);
    }
    public static Waitfor wait (WebDriver driver, By locator){
        return new Waitfor(driver,locator);
    }
}
