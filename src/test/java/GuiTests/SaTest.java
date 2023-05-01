package GuiTests;

import GuiPages.homePage;
import countries.SaudiArabia;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("Automation Exercise")
@Feature("GUI")
public class SaTest {
    SHAFT.GUI.WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }


    @Description("Given the browser is open, When i navigate to Jawwy TV url" +
            "Then price, currency, type are visible & valid ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Personalised Bundle")
    @Test(description = "Price, Currency, Type are valid ")


    public void Validate_data_in_home_page() {
    	SaudiArabia saudi = new SaudiArabia();
        new homePage(driver)
                .NavigateToUrl(saudi.country());

        
        driver.assertThat()
        .element(homePage.TypeLocator())
        .text()
        .contains(saudi.type())
        .withCustomReportMessage("Verify type is valid")
        .perform();

        
        driver.assertThat()
        .element(homePage.CurrencyLocator())
        .text()
        .contains(saudi.currency())
        .withCustomReportMessage("Verify currency is valid")
        .perform();
        
        
        driver.assertThat()
        .element(homePage.PriceLocator())
        .text()
        .contains(saudi.price())
        .withCustomReportMessage("Verify price is valid")
        .perform();
    }

    @AfterMethod
    public void AfterMethod() {
        driver.quit();
    }
}
