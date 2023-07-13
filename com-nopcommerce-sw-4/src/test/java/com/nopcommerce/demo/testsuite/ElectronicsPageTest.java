package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.browserfactory.pages.CartMenuPage;
import com.nopcommerce.demo.browserfactory.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class ElectronicsPageTest extends BaseTest {
    String actualText,expectedText;
    ElectronicsPage electronics = new ElectronicsPage();
    CartMenuPage cart1 = new CartMenuPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    {
        electronics.verifyUserShouldNavigateToCellPhonesPageSuccessfully();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException
    {
        //electronics.verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully();
        electronics.clickOnElectronics();
        electronics.clickOnCellPhones();

        expectedText="Cell phones";
        actualText=electronics.verifyCellPhonePageHeader();
        Assert.assertEquals(actualText,expectedText,"Cell Phone Page Header Text Not Matched");


        electronics.clickOnListView();
        Thread.sleep(3000);

        electronics.clickOnProduct();

        expectedText="Nokia Lumia 1020";
        actualText=electronics.verifyProductText();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia Header Text Not Matched");

        expectedText="$349.00";
        actualText=electronics.verifyProductPrise();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia Prise Not Matched");

        Thread.sleep(1000);

        electronics.changeProductQuantity("2");
        electronics.clickOnProductAddToCart();

        expectedText="The product has been added to your shopping cart";
        actualText=electronics.productAddedCartSuccessMSG();
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia 2010 Product Has Been Added Message Not Matched");

        electronics.closeSuccessMSG();
        Thread.sleep(1000);

        electronics.clickAndGOTOCART();

        expectedText="Shopping cart";
        actualText=electronics.verifyShoppingCartMSG();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart Header Text Not Matched");

        Thread.sleep(3000);

        expectedText="$698.00";
        actualText= electronics.verifyTotal();
        Assert.assertEquals(actualText,expectedText,"Total Cart Prise Not Matched");

        electronics.iAgreeTerm();
        electronics.clickCheckout();

        expectedText="Welcome, Please Sign In!";
        actualText=electronics.signIN();
        Assert.assertEquals(actualText,expectedText,"Welcome Sign In Message Not Matched");

        electronics.clickOnElectronicRegister();

        expectedText="Register";
        actualText= electronics.verifyRegisterText();
        Assert.assertEquals(actualText,expectedText,"Register Header Text Not Matched");

        electronics.eleRegisterFirstName("abc");
        electronics.eleRegisterLastName("xyz");
        electronics.eleRegisterEmail("abc@gmail.com");
        electronics.sendPassword("abc@1234");
        electronics.sendConfirmPassword("xyz@1234");
        electronics.clickElectronicRegisterComplete();

        expectedText="Your registration completed";
        actualText=electronics.verifyYourRegistrationComplete();
        Assert.assertEquals(actualText,expectedText,"Registration Complete Message Not Matched");

        electronics.clickFinishRegistration();

        electronics.clickOnLoginLnk();
        electronics.sendEmailText("abc@gmail.com");
        electronics.sendPassword("abc@1234");
        electronics.clickLoginButton();

        String expectedShopping = "Shopping cart";
        String actualShopping = electronics.verifyElectroningShoppingCart();
        Assert.assertEquals(actualShopping, expectedShopping,"Shopping Cart Message Not Matched");

        electronics.cartTermsCondition();
        electronics.checkOut();

        electronics.firstName("abc");
        electronics.lastName("xyz");
        electronics.eleEmail("abc@gmail.com");
        electronics.eleCountry("United States");
        //cart1.eleState("Alaska");
        cart1.selectState("Alaska");
        electronics.eleCity("New york");
        electronics.eleAdd("Katargam");
        electronics.eleZip("395004");
        electronics.elePhone("9906688066");

        cart1.clickOnContinueRegister();
        cart1.clickOnRadioNextDay();
        cart1.clickOnNextDayButton();
        Thread.sleep(3000);

        cart1.selectCreditCardOption();
        cart1.selectCardTypeOption();
        cart1.cardHolderName("abc xyz");
        cart1.cardNumber("4400268052254288");
        cart1.selectExpiryMonth("12");
        cart1.selectExpiryYear("2012");
        cart1.enterCVV("888");
        cart1.cardOptionContinueButton();

        expectedText="Payment Method: Credit Card";
        actualText=cart1.verifyPaymentMethod();
        Assert.assertEquals(actualText,expectedText,"Payment Method Display Message Not Matched");

        expectedText="Shipping Method: Next Day Air";
        actualText=cart1.verifyShippingMethod();
        Assert.assertEquals(actualText,expectedText,"Shipping Method Not Matched");

        expectedText="$698.00";
        actualText=cart1.verifyTotalCart();
        Assert.assertEquals(actualText,expectedText,"Total Cart After Card Details Not Matched");

        cart1.clickOnConfirm();

        expectedText="Thank you";
        actualText=cart1.verifyThankYOu();
        Assert.assertEquals(actualText,expectedText,"Thank You Text Message Not Matched");

        expectedText="Your order has been successfully processed!";
        actualText= cart1.orderSuccessfullyProcessed();
        Assert.assertEquals(actualText,expectedText,"Order Confirm Message Not Matched");

        cart1.finishProcess();


    }

}
