package com.xcartdemo.testsuite;
import com.xcartdemo.pages.ShoppingBestSellersPages;
import com.xcartdemo.pages.ShoppingSalesPage;
import com.xcartdemo.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingTest extends TestBase
{
    ShoppingBestSellersPages shoppingBestSellersPages=new ShoppingBestSellersPages();
    ShoppingSalesPage shoppingSalesPage=new ShoppingSalesPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrications() throws InterruptedException
    {
        shoppingSalesPage.mouseHoverOnHotDealsAndSale();
        shoppingSalesPage.clickOnSale();
        shoppingSalesPage.mouseHoverOnSortBy();
        shoppingSalesPage.selectNameAToZFromDropDown();
        shoppingSalesPage.setAddToCart();
        shoppingSalesPage.fillTheForm();
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException
    {
        shoppingBestSellersPages.mouseHover();
        shoppingBestSellersPages.clickOnBestseller();
        shoppingBestSellersPages.mouseHoverOnSortBy();
        shoppingBestSellersPages.selectNameAToZFromDropDown();

        Thread.sleep(5000);
        shoppingBestSellersPages.clickOnProductGhostBusters();
        shoppingBestSellersPages.alertSwitch();

        Thread.sleep(4000);
        shoppingBestSellersPages.emptyYourCart();
    }
}
