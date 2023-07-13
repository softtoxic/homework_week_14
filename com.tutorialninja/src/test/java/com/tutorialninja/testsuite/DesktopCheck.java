package com.tutorialninja.testsuite;

import com.tutorialninja.pages.NavigateToDesktop;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopCheck extends BaseTest {
    String expectedText,actualText;
    NavigateToDesktop nd = new NavigateToDesktop();

    @Test
    public void desktopTest()
    {
        nd.clickDesktop();
        nd.showAllDesktop();

        expectedText="Desktops";
        actualText=nd.verifyDesktop();
        Assert.assertEquals(actualText,expectedText,"Desktop Text Not Matched");
    }
}
