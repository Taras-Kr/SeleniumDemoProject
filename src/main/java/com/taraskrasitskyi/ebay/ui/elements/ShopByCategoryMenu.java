package com.taraskrasitskyi.ebay.ui.elements;

import com.taraskrasitskyi.ebay.ui.pages.BasePage;
import com.taraskrasitskyi.ebay.ui.pages.CategoryPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.taraskrasitskyi.ebay.ui.locators.ShopByCategoriesLocators.CATEGORIES_LIST;
import static com.taraskrasitskyi.ebay.ui.locators.ShopByCategoriesLocators.CATEGORY_FROM_LIST;

public class ShopByCategoryMenu extends BasePage {

    public ShopByCategoryMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Get categories list")
    public List<WebElement> getMenuMainItemsList() {
        List<WebElement> categories = driver.findElements(CATEGORIES_LIST.getPath());
        return categories;
    }

    public int categoriesCount(){
        List<WebElement> categories = getMenuMainItemsList();
        getHeader().openShopByCategoryMenu();
        return categories.size();
    }

    @Step("Open category")
    public CategoryPage openCategory(WebElement category) {
        category.click();
        return new CategoryPage(driver);
    }

}
