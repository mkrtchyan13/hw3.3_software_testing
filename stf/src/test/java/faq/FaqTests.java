package faq;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Faq;
import static org.testng.Assert.assertTrue;

public class FaqTests extends BaseTest {
    @Test
    public void checkContent(){
        Faq helpPage = homePage.clickFaq();
        assertTrue(helpPage.contentExists());
    }
}