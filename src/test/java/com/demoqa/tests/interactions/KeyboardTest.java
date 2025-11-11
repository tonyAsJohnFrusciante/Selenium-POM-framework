package com.demoqa.tests.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Antonis Maragkoudakis");
        textBoxPage.setEmail("test@user.com");
        textBoxPage.setCurrentAddress("1234 Something Avenue");
        textBoxPage.setCurrentAddress("Apartment 1");
        textBoxPage.setCurrentAddress("Ostebro, Copenhagen");
        textBoxPage.clickSubmitButton();
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Apartment 1"));
    }
}
