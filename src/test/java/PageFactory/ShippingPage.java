package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {



    private WebDriver driver;
    public ShippingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
