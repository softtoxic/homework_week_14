package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class NavigateToRegister extends Utility {
    By myAccount= By.xpath("//span[normalize-space()='My Account']");
    By register = By.xpath("//a[normalize-space()='Register']");
    By verifyRegisterText = By.xpath("//h1[contains(text(),'Register Account')]");

    public void clickOnRegister()
    {
        clickOnElement(myAccount);
        clickOnElement(register);
    }
    public String verifyRegisterText()
    {
        return getTextFromElement(verifyRegisterText);
    }
}
