package GuiPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class homePage {
    private SHAFT.GUI.WebDriver driver;
    private final String URL = System.getProperty("URL");


    public homePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @return homePage
     */
    public homePage NavigateToUrl(String country) {
        driver.browser().navigateToURL(URL+country);
        return this;
    }
    
    public static By TypeLocator() {
    	return By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div[2]/h4");
        
    }
    
    public static By CurrencyLocator() {
    	return By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div");
        
    }

    public static By PriceLocator() {
    	return By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div[3]/div/b");
        
    }

}
