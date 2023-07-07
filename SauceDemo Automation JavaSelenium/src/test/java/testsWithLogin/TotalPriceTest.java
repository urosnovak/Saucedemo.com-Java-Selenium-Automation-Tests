package testsWithLogin;

import dataGenerator.DataGenerator;
import methods.CheckoutMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ShoppingCartPage;


public class TotalPriceTest extends BaseTestWithLogin{
    @Test
    public void checkPrice() {
        HomePage homePage = new HomePage(driver);
        homePage.addCheapestItemToCart();
        double cheapestItemPrice = homePage.returnCheapestItemPrice();

        double randomItemPrice = homePage.pickRandomItem();
        double expectedTotalPrice = cheapestItemPrice + randomItemPrice;

        homePage.navigateToShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.navigateToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutMethods checkoutMethods = new CheckoutMethods(driver);
        checkoutMethods.fillInCheckoutDetails(DataGenerator.generateFirstName(), DataGenerator.generateLastName(), DataGenerator.generatePostalCode());

        Assert.assertEquals(checkoutPage.returnTotalPrice(), expectedTotalPrice);
    }
}

