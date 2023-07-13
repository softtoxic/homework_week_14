package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class NavigateToLoginPage extends Utility {
    By myAccount= By.xpath("//span[normalize-space()='My Account']");
    By login = By.xpath("//a[normalize-space()='Login']");
    By verifyLogin = By.xpath("//h2[contains(text(),'Returning Customer')]");
    public void clickOnMyAccount()
    {
        clickOnElement(myAccount);
    }
    public void clickOnLogin()
    {
        clickOnElement(login);
    }

    public String verifyTextRegisterAccount()
    {
        return getTextFromElement(verifyLogin);
    }
}
