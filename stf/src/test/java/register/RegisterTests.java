package register;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Register;

import static org.testng.Assert.assertEquals;

public class RegisterTests extends BaseTest {
    @Test
    public void checkTitle() {
        Register registerPage = homePage.clickSignIn().goRegister();
        assertEquals(registerPage.getTitleText(), "Unlock exclusive offers, events and personalised content, gain early access to new products, be able to check out faster and track your online orders!");
    }
}