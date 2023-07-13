package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class NavigateToLaptop extends Utility {
    By laptopMenu=By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllOption=By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    By verifyLaptopText= By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    public void mouseHoverOnLaptop()
    {
        mouseHoverToElement(laptopMenu);
    }
    public void mouseHoverAndClick()
    {
        mouseHoverToElement(showAllOption);
        mouseHoverToElementAndClick(showAllOption);
    }
    public String verifyLaptopHeaderText()
    {
        return getTextFromElement(verifyLaptopText);
    }

}
