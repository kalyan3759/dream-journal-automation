 package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class DreamsDiaryPage {
    WebDriver driver;

    private By rows = By.cssSelector("table tbody tr");

    public DreamsDiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getDreamCount() {
        return driver.findElements(rows).size();
    }

    public boolean isDreamTypeValid() {
        List<String> validTypes = List.of("Good", "Bad");
        return driver.findElements(rows).stream()
            .allMatch(row -> validTypes.contains(row.findElements(By.tagName("td")).get(2).getText()));
    }

    public boolean isAllColumnsFilled() {
        return driver.findElements(rows).stream()
            .allMatch(row -> row.findElements(By.tagName("td")).stream().allMatch(cell -> !cell.getText().isEmpty()));
    }
}
