package com.taraskrasitskyi.ebay.ui.locators;

import org.openqa.selenium.By;

public enum ShopByCategoriesLocators implements BaseLocators{
    CATEGORIES_LIST(By.xpath("//h3[@class='gh-sbc-parent']/a")),
    CATEGORY_FROM_LIST(By.xpath("(//h3[@class='gh-sbc-parent']/a)[%s]")),
    SEE_ALL_CATEGORIES(By.xpath("//a[@id='gh-shop-see-all']"));

    By path;

    ShopByCategoriesLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

    public String getString(){
        return path.toString().substring(10);
    }
}
