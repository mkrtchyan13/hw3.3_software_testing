package entity;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Entity;

import static org.testng.Assert.*;

public class EntityTests extends BaseTest{
    @Test
    public void checkModal() {
        Entity entityPage = homePage.clickSearch().clickSearched().clickEntity();
        entityPage.clickImage();
        assertEquals(entityPage.imgExists(), true);
    }

    @Test
    public void openImg() {
        Entity entityPage = homePage.clickSearch().clickSearched().clickEntity();
        entityPage.clickImage();
    }
}