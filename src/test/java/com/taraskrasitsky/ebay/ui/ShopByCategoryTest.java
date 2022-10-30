package com.taraskrasitsky.ebay.ui;

import com.taraskrasitsky.ebay.utils.ExpectedDataReader;
import com.taraskrasitsky.ebay.utils.TestRunner;
import com.taraskrasitskyi.ebay.ui.elements.ShopByCategoryMenu;
import com.taraskrasitskyi.ebay.ui.pages.CategoryPage;
import com.taraskrasitskyi.ebay.ui.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ShopByCategoryTest extends TestRunner {

    @Test(description = "Verify that the user can open each main category from the ShopByCategory menu")
    @Description("Verify that the user can open each main category from the ShopByCategory menu")
    @TmsLink(value = "SEL-3")
    public void verifyThatCategoriesOpen() {
        HomePage homePage = new HomePage(driver);
        int categoriesCount = homePage
                .getHeader()
                .openShopByCategoryMenu()
                .categoriesCount();
        CategoryPage categoryPage;
        ShopByCategoryMenu shopByCategoryMenu;
        ExpectedDataReader edReader = new ExpectedDataReader("src/test/resources/expecteddata/verifyThatCategoriesOpen_expected.csv");
        List<String> expectedLinkTexts = edReader.getColumn(1);
        List<String> expectedPageHeaders = edReader.getColumn(2);
        for (int i = 0; i < categoriesCount; i++) {
            shopByCategoryMenu = homePage
                    .getHeader()
                    .openShopByCategoryMenu();
            List<WebElement> categoriesList = shopByCategoryMenu.getMenuMainItemsList();
            categoryPage = shopByCategoryMenu.openCategory(categoriesList.get(i));
            softAssert.assertEquals(categoryPage.getLastChainNavigateLinkText(), expectedLinkTexts.get(i));
            softAssert.assertEquals(categoryPage.getPageCaption(), expectedPageHeaders.get(i));
            homePage = categoryPage.getHomePage();
        }
        softAssert.assertAll();
    }
}
