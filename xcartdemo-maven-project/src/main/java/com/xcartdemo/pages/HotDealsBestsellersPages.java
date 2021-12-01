package com.xcartdemo.pages;

import com.xcartdemo.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsBestsellersPages extends Utility
{
    By hotDeals=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[@class='leaf has-sub']//span[contains(text(),'Hot deals')]");
    By bestSellers=By.linkText("Bestsellers");
    By verifyBestsellerText=By.xpath("//h1[contains(text(),'Bestsellers')]");
    By sortBy=By.xpath("//span[contains(text(),'Sort by:')]");
    //By selectAToZInDropDown=By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']//li[@class='list-type-grid ']//a[@data-sort-order='asc' or text()='Name A - Z']");
    //By selectAToZInDropDown=By.cssSelector("a[data-sort-by='translations.name'][data-sort-order='asc']");
    //By selectAToZInDropDown=By.xpath("//a[normalize-space()='Name A - Z']");
    //By selectAToZInDropDown=By.className("sort-arrow sort-arrow-asc");
    //By selectAToZInDropDown=By.xpath("(//i[@class='sort-arrow sort-arrow-asc'])[1]");
    //By selectAToZInDropDown=By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']//li[@class='list-type-grid']//a[@data-sort-order='asc']");
    By selectFromDropDown=By.xpath("//li[@class='list-type-grid']");
    public void mouseHover()
    {
        mouseHover(hotDeals);
        mouseHover(bestSellers);
    }
    public void clickOnBestseller()
    {
        clickOnElement(bestSellers);
        verifyTheText("Bestsellers",verifyBestsellerText);
    }
    public void mouseHoverOnSortBy()
    {
        mouseHover(sortBy);
    }
    public void selectNameZToAFromDropDown()
    {
        selectFromDropDown(selectFromDropDown,"Name Z - A");
    }
    public void selectPriceFromHighToLow()
    {
        selectFromDropDown(selectFromDropDown,"Price High - Low");

    }
    public void selectPriceByRatesFromDropDown()
    {
        selectFromDropDown(selectFromDropDown, "Rates");
    }
}
