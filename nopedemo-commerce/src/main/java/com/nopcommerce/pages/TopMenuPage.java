package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility
{
    String[] tabs = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};

    public void clickOnTabs(){
        for (String names : tabs) {
            clickOntab(By.linkText(names),names);
        }

    }
    public void clickOntab(By by,String name)
    {
        clickOnElement(by);
        //verifyTheText("not displayed", name);
    }
}
