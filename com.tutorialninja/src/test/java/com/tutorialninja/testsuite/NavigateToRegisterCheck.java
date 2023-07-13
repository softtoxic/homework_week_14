package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToRegister;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToRegisterCheck extends BaseTest {
    String expectedText,actualText;
    NavigateToRegister nr = new NavigateToRegister();

    @Test
    public void VerifyRegisterLink()
    {
        nr.clickOnRegister();

        expectedText="Register Account";
        actualText=nr.verifyRegisterText();
        Assert.assertEquals(actualText,expectedText,"Register page not displayed");
    }
}
