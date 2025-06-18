 package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By loadingSpinner = By.className("loading");
    private By mainContent = By.cssSelector(".main");
    private By myDreamsButton = By.xpath("//button[contains(text(),'My Dreams')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("https://arjitnigam.github.io/myDreams/");
    }

    public boolean isLoadingAnimationShown() {
        try {
            return driver.findElement(loadingSpinner).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isContentVisible() {
        try {
            return driver.findElement(mainContent).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isMyDreamsButtonVisible() {
        try {
            return driver.findElement(myDreamsButton).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickMyDreamsButton() {
        driver.findElement(myDreamsButton).click();
    }

    public boolean areTabsOpened() {
        return driver.getWindowHandles().size() >= 3;
    }
}
