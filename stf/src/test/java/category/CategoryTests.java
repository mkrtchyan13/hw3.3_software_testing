package category;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SearchedPage;

public class CategoryTests extends BaseTest {
    @Test
    public void checkFilterOffers() {
        SearchedPage categoryPage = homePage.clickSearch().clickSearched();
        categoryPage.clickFilterOffer();
    }
}