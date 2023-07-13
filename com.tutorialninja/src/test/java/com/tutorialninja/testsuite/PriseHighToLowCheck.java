package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToLaptop;
import com.tutorialninja.pages.PriseDisplayHighToLow;
import com.tutorialninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class PriseHighToLowCheck extends BaseTest {
    NavigateToLaptop nl1 = new NavigateToLaptop();
    PriseDisplayHighToLow prdis = new PriseDisplayHighToLow();

    @Test
    public void checkPriseHighToLow()
    {
        nl1.mouseHoverOnLaptop();
        nl1.mouseHoverAndClick();
        prdis.priseHighToLow();
    }
}
