package com.luma.testsuite;

import com.luma.pages.WomenPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        womenPage.mouseHoverOnWomenMenu();
        womenPage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.selectSortByProductName();

    }
    @Test
    public void verifyTheSortByPriceFilter(){

        womenPage.mouseHoverOnWomenMenu();
        womenPage.mouseHoverOnTops();
        womenPage.clickOnJacket();
        womenPage.selectSortByPrice();
    }
}
