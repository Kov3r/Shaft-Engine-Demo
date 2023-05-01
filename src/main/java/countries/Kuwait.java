package countries;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Kuwait {
    SHAFT.GUI.WebDriver driver;

    public String country() {
        return "ku-en";
    }
    
    public String currency() {
        return "Kuwaiti Dinar";
    }

    public String price() {
        return "20.00";
    }
    
    public String type() {
        return "CLASSIC";
    }
    


}
