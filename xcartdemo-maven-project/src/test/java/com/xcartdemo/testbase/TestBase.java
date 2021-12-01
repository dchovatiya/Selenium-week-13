package com.xcartdemo.testbase;

import com.xcartdemo.propertyreader.PropertyReader;
import com.xcartdemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility
{
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp()
    {
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown()
    {
        closeBrowser();
    }
}
