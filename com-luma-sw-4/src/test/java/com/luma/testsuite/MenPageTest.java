package com.luma.testsuite;

import com.luma.pages.MenPage;
import com.luma.testbase.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class MenPageTest extends BaseTest {
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // * Mouse Hover on Men Menu
        Thread.sleep(2000);
        menPage.mouseHoverOnElementMen();
        // * Mouse Hover on Bottoms
        menPage.mouseHoverOnElementBottom();
        // * Click on Pants
        menPage.clickOnElementPants();

        //‘Cronus Yoga Pant’ and click on size32.
        menPage.mouseHoverOnElementCronusYogaPant();
        menPage.mouseHooverOnCronusYogaPantAndClickOnSize32();

        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on colour
        Thread.sleep(2000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
        menPage.mouseHooverOnCronusYogaPantAndClickColourBlack();

        // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        Thread.sleep(2000);
        menPage.mouseHooverOnCronusYogaPantAndClickAddToCart();
        // * Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = menPage.getTextCronusYogaPantToYourShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage);

        //* Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartLink();
        //* Verify the text ‘Shopping Cart.’
        String expectedShoppingCartMessage = "Shopping Cart";
        String actualShoppingCartMessage = menPage.getTextShoppingCartMessage();
        Assert.assertEquals(actualShoppingCartMessage, expectedShoppingCartMessage);
        //* Verify the product name ‘Cronus Yoga Pant’
        String expectedProductMessage = "Cronus Yoga Pant";
        String actualProductMessage = menPage.getTextProductName();
        Assert.assertEquals(actualProductMessage, expectedProductMessage);


        //* Verify the product size ‘32’
        String expectedSizeMessage = "32";
        String actualSizeMessage = menPage.getTextSizeMessage();
        Assert.assertEquals(actualSizeMessage, expectedSizeMessage);

        //* Verify the product colour ‘Black’
        String expectedColourMessage = "Black";
        String actualColourMessage = menPage.getTextColorMessage();
        Assert.assertEquals(actualColourMessage, expectedColourMessage);

    }
}
