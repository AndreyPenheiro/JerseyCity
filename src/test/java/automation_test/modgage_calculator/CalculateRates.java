package automation_test.modgage_calculator;
import command_providers.Acton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;

public class CalculateRates {
    private static final Logger LOGGER = LogManager.getLogger(CalculateRates.class);
    WebDriver driver;

    @BeforeMethod public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Acton.browser(driver).openBrowser("https://www.mortgagecalculator.org/mortgage-rates/");
    }
    @Test
    public void calculatorRealApr () {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomeValue("200000")
                .clickDownPaymentInDollar()
                .typeDownPayment("15000")
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");
    }
    @AfterMethod

    public void closeBrowser () {
        Acton.browser(driver).closeBrowser();
        LOGGER.info("Browser is closed");
    }


}
