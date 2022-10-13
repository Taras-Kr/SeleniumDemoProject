package com.taraskrasitskyi.ebay.ui.locators;


import org.openqa.selenium.By;

public enum HomePageLocators implements BaseLocators {
    TOP_MENU_ELECTRONICS(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Electronics']"));

    private final By path;

    HomePageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
