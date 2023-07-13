package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.browserfactory.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TopMenuPageTest extends BaseTest {
    //  com.nopcommerce.demo.pages.TopMenuPages topMenu = new com.nopcommerce.demo.pages.TopMenuPages();
    ComputerPage alphabetical = new ComputerPage();

    @Test
    public void test() {
        //  topMenu.clickOnTopMenu();

    }

    @Test
    public void computerTab() {
      //  alphabetical.verifyProductArrangeInAlphaBaticalOrder();
        alphabetical.clickOnComputerMenu();
        alphabetical.clickOnDeskTop();
        alphabetical.selectSortFromZToA();

        //Verify the product in Descending Order
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();

        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

        //1.4 Verify the Product will arrange in Descending order.
          Assert.assertEquals(originalProductsName, afterSortByZToAProductsName,"Sorting Order Not Matched");
    }
}
