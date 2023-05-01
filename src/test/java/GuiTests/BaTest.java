package GuiTests;

import GuiPages.homePage;
import countries.Bahrain;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("Automation Exercise")
@Feature("GUI")
public class BaTest {
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
    	Bahrain bahrain = new Bahrain();
        new homePage(driver)
                .NavigateToUrl(bahrain.country());

        
        driver.assertThat()
        .element(homePage.TypeLocator())
        .text()
        .contains(bahrain.type())
        .withCustomReportMessage("Verify type is valid")
        .perform();

        
        driver.assertThat()
        .element(homePage.CurrencyLocator())
        .text()
        .contains(bahrain.currency())
        .withCustomReportMessage("Verify currency is valid")
        .perform();
        
        
        driver.assertThat()
        .element(homePage.PriceLocator())
        .text()
        .contains(bahrain.price())
        .withCustomReportMessage("Verify price is valid")
        .perform();
    }

    @AfterMethod
    public void AfterMethod() {
        driver.quit();
    }
}
