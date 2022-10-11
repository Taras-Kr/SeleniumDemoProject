package com.taraskrasitsky.ebay.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestRunner {
    protected static WebDriver driver;
    private PropertiesProvider properties = new PropertiesProvider();

    @BeforeClass
    public void getDriver() {

        switch (properties.getBrowser()) {
            case "chrome": {
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", properties.getChromeBrowser());
                break;
            }
            case "firefox": {
                driver = new FirefoxDriver();
                System.setProperty("webdriver.gecko.driver", properties.getFireFoxBrowser());
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid browser");
            }
        }
        driver.manage().window().maximize();
        driver.get(properties.getBaseUrl());
    }

    @AfterClass
    public void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }

}
