 package com.wingify.tests;

import com.wingify.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class DreamDiaryTest extends BaseTest {

    @Test
    public void verifyDreamDiaryDetails() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");

        List<String> rows = driver.findElements(By.cssSelector("table tbody tr"))
                .stream()
                .map(r -> r.getText())
                .toList();

        // ✅ Check if there are exactly 10 rows
        Assert.assertEquals(rows.size(), 10, "Expected 10 dream entries");

        for (int i = 1; i <= 10; i++) {
            By rowSelector = By.cssSelector("table tbody tr:nth-child(" + i + ") td");

            List<String> columns = driver.findElements(rowSelector)
                    .stream()
                    .map(e -> e.getText())
                    .toList();

            // ✅ Check if 3 columns are present
            Assert.assertEquals(columns.size(), 3, "Each row must have 3 columns");

            // ✅ Check if Dream Type is only "Good" or "Bad"
            String type = columns.get(2);
            Assert.assertTrue(type.equals("Good") || type.equals("Bad"), "Dream type must be Good or Bad");
        }
    }
}

