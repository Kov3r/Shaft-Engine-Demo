package GuiTests;

import GuiPages.homePage;
import countries.Egypt;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("DEMO")
@Feature("GUI")
public class EgTest {
    SHAFT.GUI.WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }


    @Description("Given the browser is open, When i navigate to the website url" +
            "Then price, currency, type are visible & valid ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Classic Bundle")
    @Test(description = "Check if Price, Currency, Type are valid ")


    public void Validate_data_in_home_page() {
    	Egypt egypt = new Egypt();
        new homePage(driver)
                .NavigateToUrl(egypt.country());

        
        driver.assertThat()
        .element(homePage.TypeLocator())
        .text()
        .contains(egypt.type())
        .withCustomReportMessage("Verify type is valid")
        .perform();

        
        driver.assertThat()
        .element(homePage.CurrencyLocator())
        .text()
        .contains(egypt.currency())
        .withCustomReportMessage("Verify currency is valid")
        .perform();
        
        
        driver.assertThat()
        .element(homePage.PriceLocator())
        .text()
        .contains(egypt.price())
        .withCustomReportMessage("Verify price is valid")
        .perform();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
