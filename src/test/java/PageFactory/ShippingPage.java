package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {
    @FindBy(id = "customer-email")
    WebElement userEmail;
    @FindBy(id = "FML3YCR")
    WebElement userFirstName;
    @FindBy(id = "T5WNAER")
    WebElement userLastName;
    @FindBy(id = "company")
    WebElement userCompany;
    @FindBy(id = "KL5IDGS")
    WebElement userAddress;
    @FindBy(id = "PTR1JRR")
    WebElement userCity;
    @FindBy(id = "BF23WNR")
    WebElement userState;
    @FindBy(id = "GMQ5SIW")
    WebElement userZipCode;
    @FindBy(id = "AJ8U7L4")
    WebElement userCountry;
    @FindBy(id = "N0WW47V")
    WebElement userPhone;
    @FindBy(css = "input[type=radio][value=flatrate_flatrate]")
    WebElement flatRateRadioButton;
    @FindBy(css = "span[data-bind='i18n: \"Next\"']")
    WebElement nextButton;
    private WebDriver driver;
    public ShippingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterDefaultKeys() {
        userEmail.sendKeys("sampleEmail@gmail");
        userFirstName.sendKeys("Putra");
        userLastName.sendKeys("Agung");
        userCompany.sendKeys("MyCompanyName");
        userAddress.sendKeys("Jalan Swasembada");
        userCity.sendKeys("Jakarta");
        userZipCode.sendKeys("12345");
        userPhone.sendKeys("0812312323");
    }
    public void selectState(int index) {
        Select dropdown = new Select(userState);
        dropdown.selectByIndex(index);
    }
    public void selectCountry(int index) {
        Select dropdown = new Select(userCountry);
        dropdown.selectByIndex(index);
    }
    public void clickFlatRateRadioButton() {
        if (!flatRateRadioButton.isSelected()) {
            flatRateRadioButton.click();
        }
    }
    public void clickNextButton() {
        nextButton.click();
    }
}
