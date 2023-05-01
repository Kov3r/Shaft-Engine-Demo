package countries;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Bahrain {
    SHAFT.GUI.WebDriver driver;

    public String country() {
        return "ba-en";
    }
    
    public String currency() {
        return "Bahraini dinar";
    }

    public String price() {
        return "20.00";
    }
    
    public String type() {
        return "CLASSIC";
    }
    


}
