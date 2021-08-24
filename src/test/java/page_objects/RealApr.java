package page_objects;

import command_providers.Acton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealApr extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(RealApr.class);
    private final By CalculatorTab = By.xpath("//*[@id='CalcForm']//label[text()='Calculator']");
    private final By HomeValue = By.name("HomeValue");
    private final By DownPayment = By.name("DownPayment");
    private final By DownPaymentInDollar = By.id("DownPaymentSel0");
    private final By InterestRate = By.name("Interest");
    private final By CalculateButton = By.name("calculate");
    private final By ActualAprValue = By.xpath("//*[@id='analysisDiv']/table/tbody/tr/td/strong[contains(text(),'Actual APR')]/../../td[2]/strong");



    public RealApr(WebDriver driver){
        super (driver);
    }
    //wait for the calculatarTab to exist
    public RealApr waitForPageToLoad(){
        LOGGER.debug("Wait for the Real Apr Page to load");
        Acton.wait(driver,CalculatorTab).waitForElementToBeVisisble();
        return this;
    }

    public RealApr typeHomeValue(String value){
        LOGGER.debug("Entered Home price is"+ value);
        Acton.element(driver, HomeValue).setValue(value);
        return this;
    }
    public RealApr clickDownPaymentInDollar(){
        LOGGER.debug("Clicked on Down Payment in Dollar");
        Acton.element(driver, DownPaymentInDollar).click();
        return this;
    }
    public RealApr typeDownPayment(String value){
        LOGGER.debug("Entered Down Payment is"+ value);
        Acton.element(driver,DownPayment).setValue(value);
        return this;
    }
    public RealApr typeInterestRate (String value){
        LOGGER.debug("Entered Interest Rate is"+ value);
        Acton.element(driver,InterestRate).setValue(value);
        return this;
    }
    public RealApr clickOnCalculateButton(){
        LOGGER.debug("Clicked on the Calculate Button");
        Acton.element(driver,CalculateButton).click();
        return this;
    }
    public RealApr validateRealAprRate(String expectedValue){
        String aprRate = Acton.element(driver,ActualAprValue).getTextValue();
        LOGGER.debug("Validatin Real Apr Rate is:"+expectedValue );
        Assert.assertEquals(aprRate, expectedValue);
        return this;
    }
}
