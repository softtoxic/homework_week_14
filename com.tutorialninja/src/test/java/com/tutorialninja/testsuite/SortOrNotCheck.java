package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToDesktop;
import com.tutorialninja.pages.ProductsInAlphaBeticalOrderOrNot;
import com.tutorialninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class SortOrNotCheck extends BaseTest {
    String expectedText,actualText;
    NavigateToDesktop nd1 = new NavigateToDesktop();
    ProductsInAlphaBeticalOrderOrNot sort1 = new ProductsInAlphaBeticalOrderOrNot();

    @Test
    public void sort()
    {
        nd1.clickDesktop();
        nd1.showAllDesktop();

        sort1.verifySortFromAToZ();
    }
}
