 package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DreamsTotalPage {
    WebDriver driver;

    public DreamsTotalPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getStat(String label) {
        return Integer.parseInt(driver.findElement(By.xpath("//li[contains(text(),'" + label + "')]")).getText().replaceAll("[^0-9]", ""));
    }

    public boolean containsRecurring(String dream) {
        return driver.getPageSource().contains(dream);
    }
}
