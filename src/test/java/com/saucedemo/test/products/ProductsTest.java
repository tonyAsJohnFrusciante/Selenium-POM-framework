package com.saucedemo.test.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import com.saucedemo.base.BaseTest;


public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() throws InterruptedException {
        ProductsPage productsPage = loginPage
                .logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Product Header is not Displayed \n");
    }
}
