package methods;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageMethods extends HomePage {
    public HomePageMethods(WebDriver driver) {
        super(driver);
    }
    public void performLogout(){
        openBurgerMenu();
        clickLogoutButton();
    }
}
