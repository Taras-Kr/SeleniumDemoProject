package com.taraskrasitskyi.ebay.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.taraskrasitskyi.ebay.ui.locators.CategoryPageLocators.*;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getCaption(){
        return driver.findElement(CAPTION.getPath()).getText();
    }

    public String getTextLastChainNavigateLink(){
        List<WebElement> navLinkElements = driver.findElements(NAVIGATE_LINK.getPath());
        return navLinkElements.get(navLinkElements.size()-1).getText();
    }
}
