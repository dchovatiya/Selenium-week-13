package com.xcartdemo.pages;

import com.xcartdemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealsSalePages extends Utility
{
    By hotDeals=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//span[contains(text(),'Hot deals')]");
    By saleLink=By.linkText("Sale");
    By verifySaleText=By.xpath("//h1[contains(text(),'Sale')]");
    By sortBy=By.xpath("//span[contains(text(),'Sort by:')]");
    //By selectAToZInDropDown=By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']//li[@class='list-type-grid ']//a[@data-sort-order='asc' or text()='Name A - Z']");
    //By selectAToZInDropDown=By.cssSelector("a[data-sort-by='translations.name'][data-sort-order='asc']");
    //By selectAToZInDropDown=By.xpath("//a[normalize-space()='Name A - Z']");
    //By selectAToZInDropDown=By.className("sort-arrow sort-arrow-asc");
    //By selectAToZInDropDown=By.xpath("(//i[@class='sort-arrow sort-arrow-asc'])[1]");
    //By selectAToZInDropDown=By.xpath("//ul[@id='XLite-Module-CDev-Sale-View-SalePage-sortby-1']//li[@class='list-type-grid']//a[@data-sort-order='asc']");
    By selectFromDropDown=By.xpath("(//i[@class='sort-arrow sort-arrow-asc']");
    //By originalList=By.xpath("//h5[@class='product-name']");
    //By firstProduct=By.xpath("//div[@class='product productid-16 product-added']//a[contains(text(),'Avengers: Fabrikations Plush [Related Products]')]");
    //By secondProduct=By.xpath("//div[@class='product productid-15 low-stock']//a[contains(text(),'Soft Kitty Singing Plush [Sale] [Reviews]')]");

    public void mouseHoverOnHotDealsAndSale()
    {
        mouseHover(hotDeals);
        mouseHover(saleLink);
    }
    public void clickOnSale()
    {
        clickOnElement(saleLink);
        verifyTheText("Sale",verifySaleText);
    }
    public void mouseHoverOnSortBy()
    {
        mouseHover(sortBy);
    }
    public void selectNameAToZFromDropDown()
    {
        selectByVisibleTextFromDropDown(selectFromDropDown," Name A - Z");
    }
    /*public void verifyProductArrangeInAlphabeticalOrder()
    {
        verifyingProductsArrangement(originalList);
     }*/
    public void selectPriceFromLowToHigh()
    {
        selectByVisibleTextFromDropDown(selectFromDropDown, "Price Low - High");
    }
    public void selectPriceByRatesFromDropDown()
    {
        selectByVisibleTextFromDropDown(selectFromDropDown, "Rates");
    }
}
