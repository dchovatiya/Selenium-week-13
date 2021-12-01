package com.xcartdemo.drivermanager;

import com.xcartdemo.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class DriverManager
{
    public static WebDriver driver;
    public String url= PropertyReader.getInstance().getProperty("url");
    public void selectBrowser(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new ChromeDriver();

        }else if(browser.equalsIgnoreCase("ie"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new InternetExplorerDriver();
        }else
        {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);
    }
    public void closeBrowser()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
