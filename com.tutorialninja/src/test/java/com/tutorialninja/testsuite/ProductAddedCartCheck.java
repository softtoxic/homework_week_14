package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToDesktop;
import com.tutorialninja.pages.ProductAddedToShoppingCart;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductAddedCartCheck extends BaseTest {
    String expectedText, actualText;
    NavigateToDesktop nd2 = new NavigateToDesktop();
    ProductAddedToShoppingCart prod = new ProductAddedToShoppingCart();

    @Test
    public void verifyToAddCart() throws InterruptedException {
        prod.changeCurrency();
        nd2.clickDesktop();
        prod.clickShowAll();
        prod.sortAToZ();
        prod.selectProduct();

        expectedText = "HP LP3065";
        actualText = prod.verifyProductHeader();
        Assert.assertEquals(actualText, expectedText, "Product Name Not Matched");

        prod.verifyProductHeader();
        prod.selectDeliveryDate("2022-11-30");
        prod.clickAddToCart();

        expectedText = "Success: You have added HP LP3065 to your shopping cart!\n×";
        actualText = prod.verifyCartMessageSuccessfully();
        Assert.assertEquals(actualText, expectedText, "Product Added To Cart Successfully Not Matched");

        Thread.sleep(1000);
        prod.clickOnShoppingCart();

        expectedText = "Shopping Cart  (1.00kg)";
        actualText = prod.VerifyShoppingCartHeader();
        Assert.assertEquals(actualText, expectedText, "Shopping Cart Header Text Not Matched");

        expectedText = "HP LP3065";
        actualText = prod.verifyProductName();
        Assert.assertEquals(actualText, expectedText, "Product Name Not Matched");

        expectedText = "Delivery Date:2022-11-30";
        actualText = prod.verifyDeliveryDate();
        Assert.assertEquals(actualText, expectedText, "Delivery Date Not Matched");

        expectedText = "Product 21";
        actualText = prod.verifyModel();
        Assert.assertEquals(actualText, expectedText, "Model Name Not Matched");

        expectedText = "£74.73";
        actualText = prod.verifyTotal();
        Assert.assertEquals(actualText, expectedText, "Total Prise Not Matched");
    }
}
