package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToLaptop;
import com.tutorialninja.pages.ProductAddedToShoppingCart;
import com.tutorialninja.pages.laptopOrderSuccessfullyCheck;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class laptopOrderCheck extends BaseTest {
    String expectedText,actualText;

    ProductAddedToShoppingCart addCart = new ProductAddedToShoppingCart();
    NavigateToLaptop nl1 = new NavigateToLaptop();
    laptopOrderSuccessfullyCheck laptopOrder= new laptopOrderSuccessfullyCheck();
    @Test
    public void laptopOrderSuccessfully()
    {
        addCart.changeCurrency();
        nl1.mouseHoverOnLaptop();
        nl1.mouseHoverAndClick();

        laptopOrder.selectHighToLowPrise("Price (High > Low)");
        laptopOrder.selectProduct();

        expectedText="MacBook";
        actualText=laptopOrder.verifyProductHeader();
        Assert.assertEquals(actualText,expectedText,"MacBook Product Header Text not Matched");

        laptopOrder.addCartLaptop();

        expectedText="Success: You have added MacBook to your shopping cart!\n×";
        actualText=laptopOrder.verifySuccessMSGCart();
        Assert.assertEquals(actualText,expectedText,"Success Cart Message Not Matched");

        laptopOrder.clickOnShoppingCart();

        expectedText="Shopping Cart  (0.00kg)";
        actualText=laptopOrder.verifyShoppingCartHeader();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart Message Not Matched");

        laptopOrder.verifyProductName();
        laptopOrder.changeQuantity("2");
        laptopOrder.clickOnUpdate();

        expectedText="Success: You have modified your shopping cart!\n×";
        actualText=laptopOrder.verifyCartModifyMSGG();
        Assert.assertEquals(actualText,expectedText,"Modify Cart Message Not Matched");

        expectedText="£737.45";
        actualText=laptopOrder.verifyTotal();
        Assert.assertEquals(actualText,expectedText,"Total Prise Not Matched");

        laptopOrder.clickOnChecout();

        expectedText="Checkout";
        actualText=laptopOrder.verifyCheckoutText();
        Assert.assertEquals(actualText,expectedText,"Checkout Header Text Not Matched");

        laptopOrder.clickOnNewCustomer();

        expectedText="New Customer";
        actualText=laptopOrder.verifyNewCustomerHeaderText();
        Assert.assertEquals(actualText,expectedText,"New Customer Header Text Not Matched");

        laptopOrder.clickOnGuestRadioButton();
        laptopOrder.clickOnContinue();

        laptopOrder.enterFirstName("Vicky");
        laptopOrder.enterLastName("Shah");
        laptopOrder.enterEmail("vicky.shah2928@yahoo.com");
        laptopOrder.enterPhoneNumber("0123456789");
        laptopOrder.enterAddress("26, mayfair road");
        laptopOrder.enterCity("Anand");
        laptopOrder.enterPstCode("388330");

        laptopOrder.selectCountry("United Kingdom");
        laptopOrder.selectState("Aberdeen");

        laptopOrder.clickOnCartFinal();
        laptopOrder.addComments("Please Deliver As Early As Possible");
        laptopOrder.agreeTerms();
        laptopOrder.f1();

        expectedText="Warning: Payment method required!\n×";
        actualText=laptopOrder.verifyPaymentMethod();
        Assert.assertEquals(actualText,expectedText,"Payment Method Not Verify");
    }
}
