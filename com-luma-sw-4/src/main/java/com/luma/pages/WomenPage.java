package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    By women = By.xpath("//a[@id='ui-id-4']");
    By top = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacket = By.xpath("//a[@id='ui-id-11']");
    By sortBy = By.xpath("//div[2]//div[3]//select[1]");


    public void mouseHoverOnWomenMenu()  {
        mouseHoverToElement(women);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(top);
    }

    // Click on Jackets
    public void clickOnJacket(){
        clickOnElement(jacket);
    }

    // Select Sort By filter “Product Name” alphabetical order
    public void selectSortByProductName(){
        selectByValueFromDropDown(sortBy,"name");
    }

    //Select Sort By filter “Price”

    public void selectSortByPrice(){
        selectByValueFromDropDown(sortBy,"price");
    }

}
