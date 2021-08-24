package automation_test.mortgage_calculator_paramterizes;

import automation_test.modgage_calculator.CalculateRates;
import command_providers.Acton;
import data_provider.DataProviderClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;


public class CalculateRates_Parameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateRates_Parameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Acton.browser(driver).openBrowser("https://www.mortgagecalculator.org/mortgage-rates/");
    }
    @Test(dataProvider = "RealAprRates", dataProviderClass = DataProviderClass.class)
    public void calculatorRealApr (String homePrice, String downPayment, String interestrate,String aprRate) {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomeValue(homePrice)
                .clickDownPaymentInDollar()
                .typeDownPayment(downPayment)
                .typeInterestRate(interestrate)
                .clickOnCalculateButton()
                .validateRealAprRate(aprRate);
    }
    @AfterMethod

    public void closeBrowser () {
        Acton.browser(driver).closeBrowser();
        LOGGER.info("Browser is closed");
    }
}
