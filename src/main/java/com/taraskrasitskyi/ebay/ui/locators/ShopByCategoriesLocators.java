package com.taraskrasitskyi.ebay.ui.locators;

import org.openqa.selenium.By;

public enum ShopByCategoriesLocators implements BaseLocators{
    CATEGORIES_LIST(By.xpath("//h3[@class='gh-sbc-parent']/a")),
    CATEGORY_FROM_LIST(By.xpath("(//h3[@class='gh-sbc-parent']/a)[%s]")),
    CATEGORY_FROM_LIST_(By.cssSelector("(//h3[@class='gh-sbc-parent']/a)[%s]"));

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
