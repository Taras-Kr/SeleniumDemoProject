package com.taraskrasitsky.ebay.ui;

import com.taraskrasitsky.ebay.utils.TestRunner;
import com.taraskrasitskyi.ebay.ui.pages.CategoryPage;
import com.taraskrasitskyi.ebay.ui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.taraskrasitskyi.ebay.ui.locators.HomePageLocators.*;

public class TopMenuTest extends TestRunner {

    @Test(description = "Verify that an unregistered user can open category 'Electronics' from the top menu")
    public void verifiesThatCategoryOpens() {
        CategoryPage categoryPage = new HomePage(driver).openCategoryFromTopMenu(TOP_MENU_ELECTRONICS.getPath());
        String actualCaption = categoryPage.getCaption();
        Assert.assertEquals(actualCaption, "Electronics");
        String actualLinkCaption = categoryPage.getTextLastChainNavigateLink();
        Assert.assertEquals(actualLinkCaption, "Electronics");
    }
}
