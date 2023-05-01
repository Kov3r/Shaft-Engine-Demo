package countries;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SaudiArabia {
    SHAFT.GUI.WebDriver driver;

    public String country() {
        return "sa-en";
    }
    
    public String currency() {
        return "Saudi Riyal";
    }

    public String price() {
        return "20.00";
    }
    
    public String type() {
        return "CLASSIC";
    }
    


}
