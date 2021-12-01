package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase
{
    TopMenuPage topMenuPage=new TopMenuPage();
    @Test
    public void verifyAllTopMenuTest()
    {
        topMenuPage.clickOnTabs();
    }
}
