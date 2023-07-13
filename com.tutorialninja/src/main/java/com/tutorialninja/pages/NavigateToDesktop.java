package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class NavigateToDesktop extends Utility {
    By desktopMenu= By.xpath("//a[normalize-space()='Desktops']");
    By showAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");
    By desktopHeaderText=By.xpath("//h2[normalize-space()='Desktops']");

    public void clickDesktop()
    {
        mouseHoverToElement(desktopMenu);
    }
    public void showAllDesktop()
    {
        mouseHoverToElement(showAllDesktop);
        mouseHoverToElementAndClick(showAllDesktop);
    }
    public String verifyDesktop()
    {
        return getTextFromElement(desktopHeaderText);
    }
}
