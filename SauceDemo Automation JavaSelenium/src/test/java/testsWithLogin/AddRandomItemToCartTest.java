package testsWithLogin;

import org.testng.annotations.Test;
import pages.HomePage;

public class AddRandomItemToCartTest extends BaseTestWithLogin{
    @Test
    public void addRandomItemToCart(){
        HomePage homePage = new HomePage(driver);
        homePage.addRandomToCart();
        homePage.navigateToShoppingCart().verifyItemIsInCart();
    }
}
