package com.demoqa.tests.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue);
    }
}
