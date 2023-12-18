package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    @FindBy(id = "option-label-size-143-item-169")
    WebElement sizeLBtn;
    @FindBy(id = "option-label-color-93-item-56")
    WebElement colorOrgBtn;
    @FindBy(id = "product-addtocart-button")
    WebElement addCartBtn;
    @FindBy(linkText = "My Cart")
    WebElement showCartBtn;
    @FindBy(id = "top-cart-btn-checkout")
    WebElement checkoutBtn;

    private WebDriver driver;
    public ProductDetailPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setSizeL(){
        sizeLBtn.click();
    }
    public void setColorOrg(){
        colorOrgBtn.click();
    }
    public void setAddCart(){
        addCartBtn.click();
    }
    public void setShowCart(){
        showCartBtn.click();
    }
    public void setCheckoutBtn(){
        checkoutBtn.click();
    }
}
