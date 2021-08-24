package command_providers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssertThat {

        public static ElementAssertions elementAssertions(WebDriver driver, By locator){
            return new ElementAssertions(driver,locator);
        }
    }

