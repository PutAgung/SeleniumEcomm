package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(xpath = "//*[contains(text(), 'Place Order')]")
    WebElement placeOrderBtn;

    private WebDriver driver;
    public PaymentPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setAddCart(){
        placeOrderBtn.click();
    }
}
