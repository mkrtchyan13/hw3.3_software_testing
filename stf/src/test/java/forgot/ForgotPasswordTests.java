package forgot;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTest {
    @Test
    public void checkTitle() {
        ForgotPassword forgotPasswordPage = homePage.clickSignIn().goForgotPassword();
        assertEquals(forgotPasswordPage.getTitleText(), "FORGOT YOUR PASSWORD?");
    }
}