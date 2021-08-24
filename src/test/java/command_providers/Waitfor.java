package command_providers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor {
    private WebDriver driver;
    private By locator;

    public Waitfor(WebDriver driver, By locator){
        this.driver = driver;
        this.locator  = locator;
    }

    public Waitfor waitForElementToBeVisisble(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;

    }
    public Waitfor fixWait(long ms){
        try{
            Thread.sleep(ms);
        }catch (Exception e){
            System.out.println("Wait Exception is:"+e);
        }

        return this;
    }
}
