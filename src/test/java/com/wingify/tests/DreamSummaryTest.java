 package com.wingify.tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DreamSummaryPage;

public class DreamSummaryTest extends BaseTest {

    @Test
    public void verifyDreamSummaryStats() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");
        DreamSummaryPage summaryPage = new DreamSummaryPage(driver);

        Assert.assertEquals(summaryPage.getGoodDreamCount(), 6, "Expected 6 good dreams");
        Assert.assertEquals(summaryPage.getBadDreamCount(), 4, "Expected 4 bad dreams");
        Assert.assertEquals(summaryPage.getTotalDreamCount(), 10, "Expected 10 total dreams");
        Assert.assertEquals(summaryPage.getRecurringDreamCount(), 2, "Expected 2 recurring dreams");

        Assert.assertTrue(summaryPage.hasRecurringDream("Flying over mountains"), "'Flying over mountains' should be recurring");
        Assert.assertTrue(summaryPage.hasRecurringDream("Lost in maze"), "'Lost in maze' should be recurring");
    }
}
