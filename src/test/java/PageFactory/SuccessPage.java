package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {



    private WebDriver driver;
    public SuccessPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
