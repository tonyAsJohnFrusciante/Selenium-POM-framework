package com.demoqa.tests.screenshots;

import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
