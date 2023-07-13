package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class NavigateToComponents extends Utility {
    By components = By.xpath("//a[normalize-space()='Components']");
    By showAllOption =By.xpath("//a[normalize-space()='Show AllComponents']");
    By verifyComponentText =By.xpath("//h2[normalize-space()='Components']");
    public void mouseHoverOnComponents()
    {
        mouseHoverToElement(components);
    }
    public void showAllComponentsOption()
    {
        mouseHoverToElement(showAllOption);
        mouseHoverToElementAndClick(showAllOption);
    }
    public String verifyComponentText()
    {
        return getTextFromElement(verifyComponentText);
    }
}
