 package com.wingify.tests;

import com.wingify.base.BaseTest;
import com.wingify.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DreamHomeTest extends BaseTest {

    @Test(description = "Verify the homepage loads correctly")
    public void verifyHomePageLoading() {
        HomePage home = new HomePage(driver);
        home.navigateToHomePage();

        assertTrue(home.isLoadingAnimationShown(), "❌ Loading animation did not appear.");
        assertTrue(home.isContentVisible(), "❌ Main content is not visible.");
        assertTrue(home.isMyDreamsButtonVisible(), "❌ 'My Dreams' button is not visible.");
    }

    @Test(description = "Verify clicking 'My Dreams' opens new tabs")
    public void verifyMyDreamsButtonOpensTabs() {
        HomePage home = new HomePage(driver);
        home.navigateToHomePage();

        assertTrue(home.isMyDreamsButtonVisible(), "❌ 'My Dreams' button is not visible.");
        home.clickMyDreamsButton();

        try {
            Thread.sleep(2000); // Ideally WebDriverWait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        assertTrue(home.areTabsOpened(), "❌ Not enough tabs opened.");
    }
}
