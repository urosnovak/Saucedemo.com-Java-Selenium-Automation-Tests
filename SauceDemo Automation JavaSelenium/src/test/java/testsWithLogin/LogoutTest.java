package testsWithLogin;

import methods.HomePageMethods;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LogoutTest extends BaseTestWithLogin{
    @Test
    public void logout(){
        HomePageMethods homePageMethods = new HomePageMethods(driver);
        homePageMethods.performLogout();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogout("Login");
    }
}
