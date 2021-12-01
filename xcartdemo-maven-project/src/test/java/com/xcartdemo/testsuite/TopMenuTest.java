package com.xcartdemo.testsuite;

import com.xcartdemo.pages.HomePage;
import com.xcartdemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase
{
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully()
    {
        homePage.clickOnShippingLink();
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully()
    {
        homePage.clickOnNewLink();
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully()
    {
        homePage.clickOnComingSoonLink();
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully()
    {
        homePage.clickOnContactUsLink();
    }
}
