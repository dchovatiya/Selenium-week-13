package com.xcartdemo.pages;
import com.xcartdemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingBestSellersPages extends Utility
{
    By hotDeals=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[@class='leaf has-sub']//span[contains(text(),'Hot deals')]");
    By bestSellers=By.linkText("Bestsellers");
    By verifyBestsellerText=By.xpath("//h1[contains(text(),'Bestsellers')]");
    By sortBy=By.xpath("//span[contains(text(),'Sort by:')]");
    By selectFromDropDown=By.xpath("//li[@class='list-type-grid']");
    By productSelection=By.xpath("//a[normalize-space()='Vinyl Idolz: Ghostbusters']");
    By addToCart=By.xpath("//button[contains(@type,'submit')]//span[contains(text(),'Add to cart')]");
    By textMsgAfterAddToCart=By.xpath("//div[@id='status-messages']//ul");
    By closeSign=By.xpath("//a[@title='Close']");
    By yourCartOnTop=By.xpath("//div[@title='Your cart']");
    By viewCartButton=(By.xpath("//a[@class='regular-button cart']//span[contains(text(),'View cart')]"));
    By msgAfterAddingViewCart=By.xpath("//h1[@id='page-title']");
    By emptyYourCart=By.xpath("//a[normalize-space()='Empty your cart']");
    By msgAfterAlertMsg=By.xpath("//div[@id='status-messages']//ul");
    By yourCartIsEmpty=By.xpath("//h1[@id='page-title']");


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
    public void selectNameAToZFromDropDown()
    {
        selectFromDropDown(selectFromDropDown,"Name A - Z");
    }
    public void clickOnProductGhostBusters() throws InterruptedException
    {
        Thread.sleep(2000);
        clickOnElement(productSelection);
        clickOnElement(addToCart);

        Thread.sleep(2000);
        verifyTheText("Product has been added to your cart",textMsgAfterAddToCart);
        clickOnElement(closeSign);
        clickOnElement(yourCartOnTop);

        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(viewCartButton,40);
        clickOnElement(viewCartButton);
        verifyTheText("Your shopping cart - 1 items",msgAfterAddingViewCart);
        clickOnElement(emptyYourCart);
    }
    public void alertSwitch()
    {
        switchToAlert();
        System.out.println(getTextFromAlert());
        acceptAlert();
    }
    public void emptyYourCart() throws InterruptedException
    {
        Thread.sleep(2000);
        verifyTheText("Item(s) deleted from your cart",msgAfterAlertMsg);
        verifyTheText("Your cart is empty",yourCartIsEmpty);
    }
}
