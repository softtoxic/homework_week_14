package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class ProductAddedToShoppingCart extends Utility {
    By currency =By.xpath("//span[contains(text(),'Currency')]");
    By gbp= By.xpath("//button[@name='GBP']");
    By showall =By.xpath("//a[normalize-space()='Show AllDesktops']");
    By sortAToZ = By.xpath("//select[@id='input-sort']");
    By HPLP3065 =By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyProductNameHeader = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By deliveryDate =By.xpath("//input[@id='input-option225']");
    By addCart= By.xpath("//button[@id='button-cart']");
    By cartMSG= By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart= By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartHeader = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By prodName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By dDate =By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By model=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    public void changeCurrency()
    {
        clickOnElement(currency);
        clickOnElement(gbp);
    }
    public void clickShowAll()
    {
        clickOnElement(showall);
    }
    public void sortAToZ()
    {
        selectByVisibleTextFromDropDown(sortAToZ,"Name (A - Z)");
    }
    public void selectProduct()
    {
        clickOnElement(HPLP3065);
    }

    public String verifyProductHeader()
    {
        return getTextFromElement(verifyProductNameHeader);
    }
    public void selectDeliveryDate(String date)
    {

        driver.findElement(deliveryDate).clear();
        sendTextToElement(deliveryDate,date);
    }
    public void clickAddToCart()
    {
        clickOnElement(addCart);
    }
    public String verifyCartMessageSuccessfully()
    {
        return getTextFromElement(cartMSG);
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
    }
    public String VerifyShoppingCartHeader()
    {
        return getTextFromElement(shoppingCartHeader);
    }
    public String verifyProductName()
    {
        return getTextFromElement(prodName);
    }

    public String verifyDeliveryDate()
    {
        return getTextFromElement(dDate);
    }
    public String verifyModel()
    {
        return getTextFromElement(model);
    }
    public String verifyTotal()
    {
        return  getTextFromElement(total);
    }
}
