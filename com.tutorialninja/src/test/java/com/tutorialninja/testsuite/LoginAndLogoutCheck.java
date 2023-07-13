package com.tutorialninja.testsuite;

import com.tutorialninja.pages.LoginLogout;
import com.tutorialninja.pages.NavigateToLoginPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAndLogoutCheck extends BaseTest {
    String expectedText, actualText;
    NavigateToLoginPage navlog = new NavigateToLoginPage();
    LoginLogout ll = new LoginLogout();

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        navlog.clickOnMyAccount();
        navlog.clickOnLogin();

        ll.enterEmail("abc@gmail.com");
        ll.enterPassword("xyz@1234");
        ll.clickOnLoginButton();

        expectedText = "My Account";
        actualText = ll.myAccountClick();
        Assert.assertEquals(actualText, expectedText, "My Account Header Test Not Matched");

        ll.clickOnLink();
        ll.clickOnLogoutButton();

        expectedText = "Account Logout";
        actualText = ll.logoutTextVerify();
        Assert.assertEquals(actualText, expectedText, "Logout Header Text Not Matched");

    }
}
