package com.demoqa.tests.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"));
        modalDialogsPage.clickCloseButton();

    }
}
