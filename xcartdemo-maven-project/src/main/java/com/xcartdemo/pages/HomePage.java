package com.xcartdemo.pages;

import com.xcartdemo.utility.Utility;
import org.openqa.selenium.By;

/**
 * Store the element and do the action on that
 */

public class HomePage extends Utility
{
    By shippingLink=By.linkText("Shipping");
    By shippingText=By.xpath("//h1[contains(text(),'Shipping')]");

    By newLink=By.linkText("New!");
    By newText=By.xpath("//h1[@id='page-title']");

    By comingSoonLink=By.linkText("Coming soon");
    By comingSoonText=By.xpath("//h1[@class='title']");

    By contactUsLink=By.linkText("Contact us");
    By contactUsText=By.xpath("//h1[contains(text(),'Contact us')]");

    public void clickOnShippingLink()
    {
        clickOnElement(shippingLink);
        verifyTheText("Shipping",shippingText);
    }
    public void clickOnNewLink()
    {
        clickOnElement(newLink);
        verifyTheText("New arrivals",newText);
    }
    public void clickOnComingSoonLink()
    {
        clickOnElement(comingSoonLink);
        verifyTheText("Coming soon",comingSoonText);

    }
    public void clickOnContactUsLink()
    {
        clickOnElement(contactUsLink);
        verifyTheText("Contact us",contactUsText);

    }

   /*public void verifyAllTheTextOfTheLinks()
    {
        verifyTheText("Shipping",shippingText);
        verifyTheText("New arrivals",newLink);
        verifyTheText("Coming soon",comingSoonText);
        verifyTheText("Contact us",contactUsText);
    }*/
}
