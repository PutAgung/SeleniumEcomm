package Steps;

import Config.BrowserSetup;
import PageFactory.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;



public class TransactionSteps {
    private final WebDriver driver;
    private final HomePage homePage;
    private final ProductDetailPage detailPage;
    private final PaymentPage paymentPage;
    private final ShippingPage shippingPage;
    private final SuccessPage successPage;

//    public TransactionSteps() {
//
//    }
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
    @Given("^I am on the product details page for (.*)")
    public void navigateToProductDetailsPage(String product) {
        homePage.chooseProduct(product);
        System.out.println("Navigating to the product details page for: " + product);
    }

    @When("^I add the product to the cart$")
    public void addToCart() throws InterruptedException{
        detailPage.setSizeL();
        detailPage.setColorOrg();
        detailPage.setAddCart();
        Thread.sleep(2000);
        detailPage.setShowCart();
        System.out.println("Adding the product to the cart");
    }

    @And("^I proceed to checkout$")
    public void proceedToCheckout() {
        detailPage.setCheckoutBtn();
        System.out.println("Proceeding to checkout");
    }

    @And("^I enter shipping details$")
    public void enterShippingDetails() throws InterruptedException {
        Thread.sleep(2000);
        shippingPage.enterDefaultKeys();
        shippingPage.selectState(3);
        shippingPage.selectCountry(2);
        shippingPage.clickFlatRateRadioButton();
        shippingPage.clickNextButton();
        System.out.println("Entering shipping details");
    }

    @And("^I complete the purchase$")
    public void completePurchase() {
        paymentPage.setAddCart();
        System.out.println("Completing the purchase");
    }

    @Then("^I should see a confirmation message$")
    public void verifyConfirmationMessage() {
        successPage.waitForPageToLoad();
        successPage.assertConfirmationMessageDisplayed();
        successPage.assertOrderNumberDisplayed();
        successPage.assertOrderNumberFormat();
        System.out.println("Verifying the confirmation message");
    }
}
