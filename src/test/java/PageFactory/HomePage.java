package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseProduct(String product) {
        String dynamicXPath = "//a[@class='product-item-link' and contains(text(), '" + product + "')]";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Scroll to the element to make it visible
        WebElement productElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dynamicXPath)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", productElement);

        // Wait for the element to be clickable after scrolling
        productElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXPath)));
        productElement.click();
    }
}
