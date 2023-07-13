package com.nopcommerce.demo.browserfactory.pages;

import com.nopcommerce.demo.browserfactory.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By nameZToA = By.xpath("//option[contains(text(),'Name: Z to A')]");

    public void clickOnComputerMenu() {
        mouseHoverToElement(computer);
    }

    public void clickOnDeskTop() {
        mouseHoverToElement(desktop);
        mouseHoverToElementAndClick(desktop);
    }

    public void selectSortFromZToA() {
        clickOnElement(nameZToA);
    }

}
