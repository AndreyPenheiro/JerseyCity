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
import utilities.DateUtils;
import utilities.ReadConfigFiles;

import java.net.URL;

public class CalculateMothlyPayment {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMothlyPayment.class);
    WebDriver driver;

    @BeforeMethod
    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("---------Start test(CalculateMonthlyPayment-------");
        String url = ReadConfigFiles.getPropertyValues("MortgageCalculatorUrl");
        Acton.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with tje URL" + url);
    }
    @Test
    public void calculateMonthlyPayment() {
        String Date = DateUtils.returnNextMonth();
        String[] dateArray = Date.split("-");
        String month = dateArray[0];
        String year = dateArray[1];
        new Home(driver)
                .typeHomePrice("300000")
                .typeDownPayment("60000")
                .clickDownPaymentInDollar()
                .typeLoanAmount("240000")
                .typeInterestRate("3")
                .typeLoanTermInYears("30")
                .selectMonth(month)
                .typeYear(year)
                .typePropertyTax("5000")
                .typePmi("0.5")
                .typeHOI("1000")
                .typeHOA("100")
                .selectLoneType("FHA")
                .selectBuyOrRefi("Buy")
                .clickOnCalculateButton()
                .validateMonthlyPayment("$1,611.85");
    }
    @AfterMethod
    public void closeBrowser() {
       Acton.browser(driver).closeBrowser();
       LOGGER.info("Browser is closed");
        LOGGER.info("==End test(CalculateMonthlyPayment==");
    }

    }
