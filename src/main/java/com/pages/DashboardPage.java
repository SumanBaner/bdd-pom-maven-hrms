package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Test

    private WebDriver driver;

    private static final By DASHBOARD_ICON = By.xpath("//span[contains(text(), 'Dashboard')]");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isDashboardIconVisible(){
        return driver.findElement(DASHBOARD_ICON).isDisplayed();
    }

}
