package com.nopcommerce.demo.browserfactory.pages;

import com.nopcommerce.demo.browserfactory.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By menu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    public void clickOnTopMenu() {
        //clickMenu(menu);
    }
}
