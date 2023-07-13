package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToRegister;
import com.tutorialninja.pages.RegisterNewAccount;
import com.tutorialninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class RegisterNewAccountCheck extends BaseTest {
    String expectedText,actualText;
    NavigateToRegister nr1 = new NavigateToRegister();
    RegisterNewAccount ra1 = new RegisterNewAccount();

    @Test
    public void verifyThatUserRegisterAccountSuccessfully()
    {
        nr1.clickOnRegister();
        ra1.enterFirstName("abc");
        ra1.enterLastName("xyz");
        ra1.email("abc@gmail.com");
        ra1.enterTelephone("05558886669");
        ra1.enterPassword("abc@1234");
        ra1.enterConfirmPassword("xyz@1234");
        ra1.clickSuscribe();
        ra1.clickOnPrivacy();
        ra1.clickOnContinue();
        ra1.cartVerify();
        ra1.clickOnConButton();
        ra1.clickOnMyAccount();
    }
}
