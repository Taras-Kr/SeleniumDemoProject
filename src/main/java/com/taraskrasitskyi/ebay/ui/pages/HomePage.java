package com.taraskrasitskyi.ebay.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage openCategoryFromTopMenu (By category){
        driver.findElement(category).click();
        return new CategoryPage(driver);
    }
}
