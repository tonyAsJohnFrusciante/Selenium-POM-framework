package com.demoqa.tests.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

import static utilities.GetUtility.*;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual & Expected URL's do not Match \n");
    }
}
