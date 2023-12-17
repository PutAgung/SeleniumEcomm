package Steps;

import Config.BrowserSetup;
import PageFactory.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class TransactionSteps {
    private WebDriver driver;
    private HomePage homePage;
    private ProductDetailPage detailPage;
    private PaymentPage paymentPage;
    private ShippingPage shippingPage;
    private SuccessPage successPage;

    public TransactionSteps(BrowserSetup browserSetup) {
        this.driver = browserSetup.initializeDriver();
        this.homePage = new HomePage(driver);
        this.detailPage = new ProductDetailPage(driver);
        this.paymentPage = new PaymentPage(driver);
        this.shippingPage = new ShippingPage(driver);
        this.successPage = new SuccessPage(driver);
    }

    @Before
    public void setUp() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    //-----------------Feature File Steps---------------------//
    @Given("^I am on the product details page for \"(.*)\"$")
    public void navigateToProductDetailsPage(String product) {
        homePage.chooseProduct(product);
        System.out.println("Navigating to the product details page for: " + product);
    }

    @When("^I add the product to the cart$")
    public void addToCart() {
        detailPage.setSizeL();
        detailPage.setColorOrg();
        detailPage.setAddCart();
        detailPage.setShowCart();
        System.out.println("Adding the product to the cart");
    }

    @And("^I proceed to checkout$")
    public void proceedToCheckout() {
        detailPage.setCheckoutBtn();
        System.out.println("Proceeding to checkout");
    }

    @And("^I enter shipping details$")
    public void enterShippingDetails() {

        System.out.println("Entering shipping details");
    }

    @And("^I complete the purchase$")
    public void completePurchase() {

        System.out.println("Completing the purchase");
    }

    @Then("^I should see a confirmation message$")
    public void verifyConfirmationMessage() {

        System.out.println("Verifying the confirmation message");
    }
}
