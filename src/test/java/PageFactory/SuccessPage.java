package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {

    @FindBy(xpath = "//*[contains(text(),'Thank you for your purchase!')]")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//*[contains(text(),'Your order # is: ')]")
    private WebElement orderNumber;

    private WebDriver driver;
    public SuccessPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void assertConfirmationMessageDisplayed() {
        Assert.assertTrue("Confirmation message not found", confirmationMessage.isDisplayed());
    }

    public void assertOrderNumberDisplayed() {
        Assert.assertTrue("Order number not found", orderNumber.isDisplayed());
    }

    public String getOrderNumberText() {
        return orderNumber.getText();
    }

    public void assertOrderNumberFormat() {
        String orderNumberText = getOrderNumberText();
        Assert.assertTrue("Invalid order number format", orderNumberText.matches("Your order # is: \\d+"));
    }
}
