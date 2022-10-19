package com.taraskrasitskyi.ebay.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.taraskrasitskyi.ebay.ui.locators.CategoryPageLocators.*;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get page caption")
    public String getCaption(){
        return driver.findElement(CAPTION.getPath()).getText();
    }

    @Step("Get text from last chain navigate link")
    public String getTextLastChainNavigateLink(){
        List<WebElement> navLinkElements = driver.findElements(NAVIGATE_LINK.getPath());
        return navLinkElements.get(navLinkElements.size()-1).getText();
    }
}
