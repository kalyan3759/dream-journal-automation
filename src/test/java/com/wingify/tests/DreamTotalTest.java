 package com.wingify.tests;

import com.wingify.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DreamTotalTest extends BaseTest {

    @Test
    public void verifyDreamSummaryStats() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");

        // ✅ Check each summary count
        Assert.assertEquals(getValue("good-dreams"), "6");
        Assert.assertEquals(getValue("bad-dreams"), "4");
        Assert.assertEquals(getValue("total-dreams"), "10");
        Assert.assertEquals(getValue("recurring-dreams"), "2");

        // ✅ Check recurring dreams names
        String recurringText = driver.findElement(By.id("recurring-list")).getText();
        Assert.assertTrue(recurringText.contains("Flying over mountains"));
        Assert.assertTrue(recurringText.contains("Lost in maze"));
    }

    private String getValue(String id) {
        return driver.findElement(By.id(id)).getText().trim();
    }
}
