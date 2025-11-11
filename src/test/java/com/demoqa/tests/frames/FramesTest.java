package com.demoqa.tests.frames;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText);
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }

    @Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxTest = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxTest, expectedSmallBoxText);
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }
}
