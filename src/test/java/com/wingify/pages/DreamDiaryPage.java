 package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DreamDiaryPage {
    private WebDriver driver;

    private By rows = By.cssSelector("table tbody tr");

    public DreamDiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getTotalEntries() {
        return driver.findElements(rows).size();
    }

    public boolean areDreamTypesValid() {
        List<WebElement> rowElements = driver.findElements(rows);
        for (WebElement row : rowElements) {
            String dreamType = row.findElements(By.tagName("td")).get(2).getText().trim();
            if (!dreamType.equalsIgnoreCase("Good") && !dreamType.equalsIgnoreCase("Bad")) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllFieldsFilled() {
        List<WebElement> rowElements = driver.findElements(rows);
        for (WebElement row : rowElements) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() != 3 || cells.get(0).getText().trim().isEmpty()
                    || cells.get(1).getText().trim().isEmpty()
                    || cells.get(2).getText().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
