package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToLaptop;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopCheck extends BaseTest {
    String expectedText,actualText;
    NavigateToLaptop nl = new NavigateToLaptop();

    @Test
    public void laptopCheck()
    {
        nl.mouseHoverOnLaptop();
        nl.mouseHoverAndClick();

        expectedText="Laptops & Notebooks";
        actualText=nl.verifyLaptopHeaderText();
        Assert.assertEquals(actualText,expectedText,"Laptop Header Page Text Not Matched");
    }
}
