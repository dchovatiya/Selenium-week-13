package com.xcartdemo.pages;

import com.xcartdemo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingSalesPage extends Utility
{
    By hotDeals=By.xpath("//ul[@class='nav navbar-nav top-main-menu']" +
            "//li[@class='leaf has-sub']" +
            "//span[contains(text(),'Hot deals')]");
    By saleLink=By.linkText("Sale");
    By verifySaleText=By.xpath("//h1[contains(text(),'Sale')]");
    By sortBy=By.xpath("//span[contains(text(),'Sort by:')]");
    By listItems=By.linkText("Name A - Z");
    By selectFromDropDown=By.linkText("Name A - Z");

    By imgAvengers=By.xpath("//img[@class='photo ls-is-cached lazyloaded']");
    By addToCart=By.xpath("//div[@class='add-to-cart-button']" +
            "//span[contains(text(),'Add to cart')]");
    By verifyTxtAfterCart=By.xpath("//div[@id='status-messages']//ul");
    By closeSign=By.xpath("By.xpath(//a[contains(@class,'close')]))");
    By yourCartBtn=By.xpath("By.linkText(//div[@title='Your cart'])");
    By viewCart=By.xpath("//span[contains(text(),'View cart')]");
    By verifyYSCMsg=By.xpath("//h1[contains(@id,'page-title')]");
    By ChangeItemToCart=By.xpath("//input[@id='amount16']");
    By verifyShopCartItems=By.xpath("//h1[contains(@id,'page-title')]");
    By verifySubTtl=By.xpath("//span[starts-with(text(),'29')]");
    By verifyTotal=By.xpath("//span[starts-with(text(),'37')]");
    By chkOutBtn=By.xpath("//span[normalize-space()='Go to checkout']");
    By verifyLgnTxt=(By.xpath("//h1[contains(@id,'page-title')]"));
    By emailId=By.id("email");
    By continueBtn=By.xpath("//span[contains(text(),'Continue')]");
    By verifyScrChkOut=By.xpath("//h1[contains(@id,'page-title')]");

    //Locators of form
    By firstName=By.id("shippingaddress-firstname");
    By lastName=By.id("shippingaddress-lastname");
    By address=By.id("shippingaddress-street");
    By cityName=By.id("shippingaddress-city");
    By countryName=By.id("shippingaddress-country-code");
    By state=By.id("shippingaddress-custom-state");
    By zipCode=By.id("shippingaddress-zipcode");
    By email=By.id("email");
    By chkBox=By.xpath("//input[@id='create_profile']");
    By radioBtnLclShipping=By.xpath("//input[@id='method128']");
    By paymentMethodCOD=By.xpath("//input[@id='pmethod6']");
    By placeOrderBtn=By.xpath("//div[@class='button-row']//span[contains(.,'Place order: $37.03')]");
    By VerifyOrderTxt=By.xpath("");

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
        driver.navigate().refresh();
        mouseHover(listItems);
        selectFromDropDown(selectFromDropDown,"Name A - Z");
    }
    public void setAddToCart() throws InterruptedException
    {
        Thread.sleep(2000);
        //waitUntilVisibilityOfElementLocated(addToCart,40);
        mouseHover(imgAvengers);
        clickOnElement(addToCart);
        verifyTheText("Product has been added to your cart",verifyTxtAfterCart);

        Thread.sleep(2000);
        clickOnElement(closeSign);
        clickOnElement(yourCartBtn);

        Thread.sleep(2000);
        clickOnElement(viewCart);
        verifyTheText("Your shopping cart - 1 item",verifyYSCMsg);
        sendTextToElement(ChangeItemToCart,"2");
        verifyTheText("Your shopping cart - 2 items",verifyShopCartItems);

        Thread.sleep(2000);
        //Verify the total (expected 39.98,real=29.98)
        verifyTheText("39.98",verifySubTtl);

        //Verify the total (expected 46.18,real=37.03)
        verifyTheText("46.18",verifyTotal);
        clickOnElement(chkOutBtn);

        Thread.sleep(2000);
        //Verify login to your account text
        verifyTheText("Log in to your account",verifyLgnTxt);
        sendTextToElement(emailId,"Prime123@gmail.com");
        clickOnElement(continueBtn);

        //Verify secure checkout
        verifyTheText("Secure Checkout",verifyScrChkOut);
    }
    public void fillTheForm() throws InterruptedException
    {
        Thread.sleep(2000);
        sendTextToElement(firstName,"Dimple");
        sendTextToElement(lastName,"Patel");
        sendTextToElement(address,"512 Harrow");
        sendTextToElement(cityName,"London");
        selectByVisibleTextFromDropDown(countryName,"United Kingdom");
        sendTextToElement(state,"Glenwood");
        sendTextToElement(zipCode,"90001");
        sendTextToElement(email,"Abc123@gmail.com");

        Thread.sleep(2000);
        clickOnElement(chkBox);
        clickOnElement(radioBtnLclShipping);

        Thread.sleep(2000);
        clickOnElement(paymentMethodCOD);
        clickOnElement(placeOrderBtn);
        verifyTheText("Thank you for your order",VerifyOrderTxt);
    }
}
