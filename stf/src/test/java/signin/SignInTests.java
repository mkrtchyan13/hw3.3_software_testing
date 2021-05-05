package signin;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SecureAreaPage;
import pages.SignInPage;

import static org.testng.Assert.assertTrue;

public class SignInTests extends BaseTest {
    @Test
    public void checkLogin(){
        SignInPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("aaa@gmail.com");
        loginPage.setPasswordField("blah");
        loginPage.submit();
        assertTrue(loginPage.errorExists());
    }
    //for getting screenshot
    @Test
    public void testSuccessfulLogin(){
        SignInPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("blah@gmail.com");
        loginPage.setPasswordField("blah4");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                .contains("Hello Darling, welcome to your dashboard! Track your orders, update your details and manage your settings."));
    }

    @Test
    public void errorMail(){
        SignInPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("aa");
        assertTrue(loginPage.mailerrorExists());
    }


}
