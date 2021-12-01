package com.xcartdemo.testsuite;

import com.xcartdemo.pages.HotDealsBestsellersPages;
import com.xcartdemo.pages.HotDealsSalePages;
import com.xcartdemo.testbase.TestBase;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase
{
    HotDealsSalePages hotDealsSale=new HotDealsSalePages();
    HotDealsBestsellersPages hotDealsBestsellers=new HotDealsBestsellersPages();
    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        hotDealsSale.mouseHoverOnHotDealsAndSale();
        hotDealsSale.clickOnSale();
        hotDealsSale.mouseHoverOnSortBy();
        hotDealsSale.selectNameAToZFromDropDown();
        //hotDealsSale.verifyProductArrangeInAlphabeticalOrder();
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        hotDealsSale.mouseHoverOnHotDealsAndSale();
        hotDealsSale.clickOnSale();
        hotDealsSale.mouseHoverOnSortBy();
        Thread.sleep(4000);
        hotDealsSale.selectPriceFromLowToHigh();
        //hotDealsSale.verifyProductArrangeInAlphabeticalOrder();
    }
    @Test
    public void verifySalesProductsArrangedByRates() throws InterruptedException {
        hotDealsSale.mouseHoverOnHotDealsAndSale();
        hotDealsSale.clickOnSale();
        hotDealsSale.mouseHoverOnSortBy();
        Thread.sleep(5000);
        hotDealsSale.selectPriceByRatesFromDropDown();
        //hotDealsSale.verifyProductArrangeInAlphabeticalOrder();
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        hotDealsBestsellers.mouseHover();
        hotDealsBestsellers.clickOnBestseller();
        Thread.sleep(4000);
        hotDealsBestsellers.mouseHoverOnSortBy();
        hotDealsBestsellers.selectNameZToAFromDropDown();
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        hotDealsBestsellers.mouseHover();
        hotDealsBestsellers.clickOnBestseller();
        Thread.sleep(4000);
        hotDealsBestsellers.mouseHoverOnSortBy();
        hotDealsBestsellers.selectPriceFromHighToLow();
    }
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        hotDealsBestsellers.mouseHover();
        hotDealsBestsellers.clickOnBestseller();
        Thread.sleep(4000);
        hotDealsBestsellers.mouseHoverOnSortBy();
        hotDealsBestsellers.selectPriceByRatesFromDropDown();
    }
}
