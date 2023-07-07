package testsWithLogin;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShoppingCartPage;

public class AddBackpackToCartTest extends BaseTestWithLogin{
    @Test
    public void addBackpackTest(){
        HomePage homePage = new HomePage(driver);
        homePage.addBackpackToCart().navigateToShoppingCart();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyBackpackIsInCart("Remove");
    }
}
