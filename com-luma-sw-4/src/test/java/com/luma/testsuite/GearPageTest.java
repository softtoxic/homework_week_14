package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.testbase.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class GearPageTest extends BaseTest {
    GearPage gearPage = new GearPage();

    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart()throws InterruptedException{
        gearPage.mouseHooverOnGearMenu();
        //Thread.sleep(1000);
        gearPage.clickOnBags();
        //Thread.sleep(1000);
        gearPage.clickOnProductNameOvernightDuffle();

        String expectedText ="Overnight Duffle";
        String actualText = gearPage.getTextOvernightDuffle();
        Assert.assertEquals(actualText,expectedText);

        gearPage.changeQuantity();
        gearPage.clickAddToCart();

        String expectedCartMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartMessage = gearPage.getTextToVerifyText();
        Assert.assertEquals(actualCartMessage,expectedCartMessage);

        gearPage.clickOnShoppingCart();

        String expectedOvernightDuffleMessage = "Overnight Duffle";
        String actualOvernightDuffleMessage = gearPage.getTextToVerifyOvernightDuffleInTheCart();
        Assert.assertEquals(actualOvernightDuffleMessage,expectedOvernightDuffleMessage);

        String expectedQuantityInTheCart = "";
        String actualQuantityInTheCart  = gearPage.getTextToVerifyQuantityInTheCart();
        Assert.assertEquals(actualQuantityInTheCart,expectedQuantityInTheCart);


        String expectedTotalAmount = "$135.00";
        String actualTotalAmount   = gearPage.getTextToVerifyTotalAmountInTheCart();
        Assert.assertEquals(actualTotalAmount,expectedTotalAmount);

        gearPage.changeTheQuantity();
        gearPage.clickOnUpdateShoppingCart();

        String expectedUpdatedTotalAmount = "$225.00";
        String actualUpdatedTotalAmount   = gearPage. getTextToVerifyTotalAmountInTheCartAfterUpdatingQty();
        Assert.assertEquals(actualUpdatedTotalAmount,expectedUpdatedTotalAmount);





    }
}
