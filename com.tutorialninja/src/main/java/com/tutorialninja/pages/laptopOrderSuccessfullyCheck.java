package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class laptopOrderSuccessfullyCheck extends Utility {
    By highLowPrise = By.xpath("//select[@id='input-sort']");
    By macBook = By.linkText("MacBook");
    By macBookHeader = By.xpath("//h1[contains(text(),'MacBook')]");
    By addCart = By.xpath("//button[@id='button-cart']");
    By verifySuccessMSG = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartHeader = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By prodName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By qty = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifyCartMSG = By.xpath("//div[@id='checkout-cart']/div[1]");
    By total = By.xpath("//tbody//tr//td[6]");
    By checkout = By.xpath("//a[@class='btn btn-primary']");
    By checkoutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomer = By.xpath("//a[@class='accordion-toggle']");
    By verifyNewCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By radio = By.xpath("//input[@value='guest']");
    By con = By.xpath("//input[@id='button-account']");

    By fName = By.xpath("//input[@id='input-payment-firstname']");
    By lName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-email']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By state = By.xpath("//select[@id='input-payment-zone']");
    By finalContinue = By.xpath("//input[@id='button-guest']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@name='agree']");
    By conf1 =By.xpath("//input[@id='button-payment-method']");
    By payment = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void selectHighToLowPrise(String priseOption) {
        WebElement priseDropDown = driver.findElement(highLowPrise);
        Select select = new Select(priseDropDown);
        select.selectByVisibleText(priseOption);
    }

    public void selectProduct() {
        clickOnElement(macBook);
    }

    public String verifyProductHeader() {
        return getTextFromElement(macBookHeader);
    }

    public void addCartLaptop() {
        clickOnElement(addCart);
    }

    public String verifySuccessMSGCart() {
        return getTextFromElement(verifySuccessMSG);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String verifyShoppingCartHeader() {
        return getTextFromElement(shoppingCartHeader);
    }

    public String verifyProductName() {
        return getTextFromElement(prodName);
    }

    public void changeQuantity(String quantity) {
        sendTextToElement(qty, quantity);
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

    public String verifyCartModifyMSGG() {
        return getTextFromElement(modifyCartMSG);
    }

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    public void clickOnChecout() {
        clickOnElement(checkout);
    }

    public String verifyCheckoutText() {
        return getTextFromElement(checkoutText);
    }

    public void clickOnNewCustomer() {
        clickOnElement(newCustomer);
    }

    public String verifyNewCustomerHeaderText() {
        return getTextFromElement(verifyNewCustomerText);
    }

    public void clickOnGuestRadioButton() {
        clickOnElement(radio);
    }

    public void clickOnContinue() {
        clickOnElement(con);
    }

    public void enterFirstName(String fname1) {
        sendTextToElement(fName, fname1);
    }

    public void enterLastName(String lName1) {
        sendTextToElement(lName, lName1);
    }

    public void enterEmail(String email1) {
        sendTextToElement(email, email1);
    }

    public void enterPhoneNumber(String telephone1) {
        sendTextToElement(telephone, telephone1);
    }

    public void enterAddress(String address1) {
        sendTextToElement(address, address1);
    }

    public void enterCity(String city1) {
        sendTextToElement(city, city1);
    }

    public void enterPstCode(String postcode1) {
        sendTextToElement(postcode, postcode1);
    }

    public void selectCountry(String country1) {
        WebElement dropdown2 = driver.findElement(country);
        Select select3 = new Select(dropdown2);
        select3.selectByVisibleText(country1);
    }

    public void selectState(String state1) {
        WebElement dropdown1 = driver.findElement(state);
        Select select2 = new Select(dropdown1);
        select2.selectByVisibleText(state1);
    }

    public void clickOnCartFinal() {
        clickOnElement(finalContinue);
    }

    public void addComments(String coments)
    {
        sendTextToElement(comments,coments);
    }
    public void agreeTerms()
    {
        clickOnElement(agree);
    }
    public void f1()
    {
        clickOnElement(conf1);
    }
    public String verifyPaymentMethod()
    {
        return getTextFromElement(payment);
    }


}
