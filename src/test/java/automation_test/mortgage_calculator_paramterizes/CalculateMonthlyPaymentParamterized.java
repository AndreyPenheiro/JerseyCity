package automation_test.mortgage_calculator_paramterizes;
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
import utilities.SqlConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculateMonthlyPaymentParamterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyPaymentParamterized.class);
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
        ResultSet rs = SqlConnector.readData("Select * from monthly_mortgage");
        try {
            while (rs.next()){
                LOGGER.info("-----------Start of"+ rs.getRow() + " Iteration-------------");
                new Home(driver)
                        .typeHomePrice(rs.getString("homevalue"))
                        .typeDownPayment(rs.getString("downpayment"))
                        .clickDownPaymentInDollar()
                        .typeLoanAmount(rs.getString("loanamount"))
                        .typeInterestRate(rs.getString("interestrate"))
                        .typeLoanTermInYears(rs.getString("loanterm"))
                        .selectMonth(month)
                        .typeYear(year)
                        .typePropertyTax(rs.getString("propertytax"))
                        .typePmi(rs.getString("pmi"))
                        .typeHOI(rs.getString("homeownerinsurance"))
                        .typeHOA(rs.getString("monthlyhoa"))
                        .selectLoneType(rs.getString("loantype"))
                        .selectBuyOrRefi(rs.getString("buyorrefi"))
                        .clickOnCalculateButton()
                        .validateMonthlyPayment(rs.getString("totalmonthlypayment"));
            }
        }catch (SQLException e){
            LOGGER.error("SQL query error:" + e.getMessage());
        }
    }
    @AfterMethod
    public void closeBrowser() {
        Acton.browser(driver).closeBrowser();
        LOGGER.info("Browser is closed");
        LOGGER.info("==End test(CalculateMonthlyPayment==");
    }
}
