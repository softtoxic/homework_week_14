package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginLogout extends Utility {
    By email = By.xpath("//input[@id='input-email']");
    By password = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");
    By linkMyAccount = By.xpath("//span[normalize-space()='My Account']");
    By logout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By accountLogoutText = By.xpath("//h1[normalize-space()='Account Logout']");
    By continueButton = By.xpath("//a[@class='btn btn-primary']");

    public void enterEmail(String email1)
    {
        sendTextToElement(email, email1);
    }

    public void enterPassword(String pass1)
    {
        sendTextToElement(password, pass1);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }

    public String myAccountClick()
    {
        return getTextFromElement(myAccount);
    }

    public void clickOnLink()
    {
        clickOnElement(linkMyAccount);
    }

    public void clickOnLogoutButton()
    {
        clickOnElement(logout);
    }
    public String logoutTextVerify()
    {
        return getTextFromElement(accountLogoutText);
    }
    public void clickToConfirm()
    {
        clickOnElement(continueButton);
    }
}
