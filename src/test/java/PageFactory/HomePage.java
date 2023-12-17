package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseProduct(String product) {
        WebElement dynamicProduct =
                driver.findElement(By.xpath("//*[contains(text(),'" + product + "')]"));
        dynamicProduct.click();
    }
}
