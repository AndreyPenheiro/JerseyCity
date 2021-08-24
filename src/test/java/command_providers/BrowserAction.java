package command_providers;


import org.openqa.selenium.WebDriver;


public class BrowserAction {
    private WebDriver driver;

    public BrowserAction(WebDriver driver)
    {
        this.driver = driver;
    }
    //openBrowser is used to launch browser
    public BrowserAction openBrowser(String url) {
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().window().maximize();
        return this;
    }

    //closeBrowser is used to close entire browser session
    public BrowserAction closeBrowser() {
        driver.quit();
        return this;
    }

    //captureTitle is used to capture the title of the browser
    public String captureTitle(){
        return driver.getTitle();
    }
}
