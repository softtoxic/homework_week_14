package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterNewAccount extends Utility {
    By fName = By.xpath("//input[@id='input-firstname']");
    By lName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By subscribe = By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']");
    By privacy=By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By verifyAccountCreated = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By continueButton1 = By.xpath("//a[@class='btn btn-primary']");
    By accountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void enterFirstName(String fname1)
    {
        sendTextToElement(fName,fname1);
    }
    public void enterLastName(String lname1)
    {
        sendTextToElement(lName,lname1);
    }
    public void email(String email1)
    {
        sendTextToElement(email,email1);
    }
    public void enterTelephone(String telephone1)
    {
        sendTextToElement(telephone,telephone1);
    }
    public void enterPassword(String password1)
    {
        sendTextToElement(password,password1);
    }
    public void enterConfirmPassword(String conPassword1)
    {
        sendTextToElement(confirmPassword,conPassword1);
    }
    public void clickSuscribe()
    {
        clickOnElement(subscribe);
    }
    public void clickOnPrivacy()
    {
        clickOnElement(privacy);
    }
    public void clickOnContinue()
    {
        clickOnElement(continueButton);
    }

    public String cartVerify()
    {
        return getTextFromElement(verifyAccountCreated);
    }

    public void clickOnConButton()
    {
        clickOnElement(continueButton1);
    }
    public void clickOnMyAccount()
    {
        clickOnElement(accountLink);
    }

}
