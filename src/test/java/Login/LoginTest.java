package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


@Test
public class LoginTest extends BaseTests {
    public void testSuccessfulLogin(){
        LoginPage loginPage= homePage.clickFormAuthentiactionLink();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertTrue( secureAreaPage.getAlertText().
                        contains("You logged into a secure area!"),"Alert are incorrect");
    }
}
