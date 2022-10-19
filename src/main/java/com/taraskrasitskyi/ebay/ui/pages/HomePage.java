package com.taraskrasitskyi.ebay.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open category {category} from the top menu")
    public CategoryPage openCategoryFromTopMenu (By category){
        driver.findElement(category).click();
        return new CategoryPage(driver);
    }
}
