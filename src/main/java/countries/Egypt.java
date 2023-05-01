package countries;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Egypt {
    SHAFT.GUI.WebDriver driver;

    public String country() {
        return "eg-en";
    }
    
    public  String currency() {
        return "Egyptian pound";
    }

    public  String price() {
        return "20.00";
    }
    
    public  String type() {
        return "CLASSIC";
    }
    


}
