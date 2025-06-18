 package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DreamSummaryPage {
    private WebDriver driver;

    private By goodDreams = By.id("good-dreams");
    private By badDreams = By.id("bad-dreams");
    private By totalDreams = By.id("total-dreams");
    private By recurringDreams = By.id("recurring-dreams");
    private By summaryTable = By.cssSelector("table tbody");

    public DreamSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getGoodDreamCount() {
        return Integer.parseInt(driver.findElement(goodDreams).getText());
    }

    public int getBadDreamCount() {
        return Integer.parseInt(driver.findElement(badDreams).getText());
    }

    public int getTotalDreamCount() {
        return Integer.parseInt(driver.findElement(totalDreams).getText());
    }

    public int getRecurringDreamCount() {
        return Integer.parseInt(driver.findElement(recurringDreams).getText());
    }

    public boolean hasRecurringDream(String dreamName) {
        return driver.findElement(summaryTable).getText().contains(dreamName);
    }
}
