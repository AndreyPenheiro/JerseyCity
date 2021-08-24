package page_objects;
import command_providers.Acton;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends NavigationBar {

        private static final Logger LOGGER = LogManager.getLogger(Home.class);
        private final By HomeValue = By.id("homeval");
        private final By DownPayment = By.id("downpayment");
        private final By DownPaymentInDollar = By.xpath("//*[@id='calc']//input[@name='param[downpayment_type]'][@value='money']");
        private final By LoanAmount = By.id("loanamt");
        private final By InterestRate = By.id("intrstsrate");
        private final By LoanTerm = By.id("loanterm");
        private final By StartMonth = By.name("param[start_month]");
        private final By StartYear = By.id("start_year");
        private final By PropertyTax = By.id("pptytax");
        private final By PMI = By.id("pmi");
        private final By HOI = By.id("hoi");
        private final By HOA = By.id("hoa");
        private final By LoanType = By.name("param[milserve]");
        private final By BuyOrRefi = By.name("param[refiorbuy]");
        private final By Calculate = By.name("cal");

        public Home(WebDriver driver) {
                super(driver);
        }

        //enter Homevalue
        public Home typeHomePrice(String value) {
                LOGGER.debug("Entered home price is:"+ value);
                Acton.element(driver, HomeValue).setValue(value);
                return this;
        }

        //enter down payment
        public Home typeDownPayment(String value) {
                Acton.wait(driver, DownPayment).waitForElementToBeVisisble();
                LOGGER.debug("Entered down payment is:"+ value);
                Acton.element(driver, DownPayment).setValue(value);
                return this;
        }

        //click on the $ radio button for the downpayment option
        public Home clickDownPaymentInDollar() {
                LOGGER.debug("Clicked on the Down Payment in dollar");
                Acton.element(driver, DownPaymentInDollar).click();
                return this;
        }

        //enter loan amount
        public Home typeLoanAmount(String value) {
                LOGGER.debug("Entered Loan Amount is:"+ value);
                Acton.element(driver, LoanAmount).setValue(value);
                return this;
        }

        //enter interest rate
        public Home typeInterestRate(String value) {
                LOGGER.debug("Entered Interest Rate is:"+ value);
                Acton.element(driver, InterestRate).setValue(value);
                return this;
        }

        //enter loan term
        public Home typeLoanTermInYears(String value) {
                LOGGER.debug("Entered Loan term is:"+ value);
                Acton.element(driver, LoanTerm).setValue(value);
                return this;
        }

        //select month
        public Home selectMonth(String month) {
                LOGGER.debug("Selected month is:"+ month);
                Acton.element(driver, StartMonth).selectValue(month);
                return this;
        }

        //enter year
        public Home typeYear(String year) {
                LOGGER.debug("Entered year is is:"+ year);
                Acton.element(driver, StartYear).setValue(year);
                return this;
        }
        // enter property tax
        public Home typePropertyTax(String value) {
                LOGGER.debug("Entered Property Tax is:"+ value);
                Acton.element(driver, PropertyTax).setValue(value);
                return this;
        }
        //enter the pmi
        public Home typePmi(String value){
                LOGGER.debug("Entered PMI is:"+ value);
                Acton.element(driver,PMI).setValue(value);
                return this;
        }
        public Home typeHOI (String value){
                LOGGER.debug("Entered HOI is:"+ value);
                Acton.element(driver,HOI).setValue(value);
                return this;
        }
        public Home typeHOA(String value){
                LOGGER.debug("Entered HOA is:"+ value);
                Acton.element(driver, HOA).setValue(value);
                return this;
        }
        //selecting the loan type
        public Home selectLoneType (String value){
                LOGGER.debug("Selected Loan Type is:"+ value);
                Acton.element(driver, LoanType).selectValue(value);
                return this;
        }
        //selecting "BUY" from but or refi dropdown
        public Home selectBuyOrRefi (String value){
                LOGGER.debug("Selected Buy or Refi option is:"+ value);
                Acton.element(driver,BuyOrRefi).selectValue(value);
                return this;
        }
        public Home clickOnCalculateButton (){
                LOGGER.debug("Click on the Calculate Button");
                Acton.element(driver, Calculate).click();
                return this;
        }
        //validating the total monthly payment is accurate
        public Home validateMonthlyPayment (String totalMonthlyPayment){
                LOGGER.debug("Validating total monthly payment");
                By monthlyPaymentLocator = By.xpath("//*[@id='calc']//h3[text()='"+ totalMonthlyPayment +"']");
                Acton.wait(driver,monthlyPaymentLocator).waitForElementToBeVisisble();
                AssertThat.elementAssertions(driver,monthlyPaymentLocator).elementExist();
                return this;
        }
}


