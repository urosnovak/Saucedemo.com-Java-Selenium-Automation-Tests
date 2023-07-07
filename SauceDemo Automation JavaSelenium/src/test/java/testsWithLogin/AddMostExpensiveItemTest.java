package testsWithLogin;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShoppingCartPage;

public class AddMostExpensiveItemTest extends BaseTestWithLogin{
    @Test
    public void addMostExpensiveItem(){
        HomePage homePage = new HomePage(driver);
        homePage.addMostExpensiveItemToCart();
        String itemName = homePage.returnMostExpensiveItemName();
        homePage.navigateToShoppingCart();
        Reporter.log("OVO MI LOGUJEMO!");

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        Assert.assertEquals(shoppingCartPage.returnCartItemName(), itemName);
    }
}
