package com.nopcommerce.utility;

import com.nopcommerce.drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;




import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

public class Utility extends DriverManager
{
    public void clickOnElement(By by)
    {
        WebElement loginLink =driver.findElement(by);
        loginLink.click();

    }
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();

    }
    public void sendTextToElement(By by, String text) //pass locator and text which we need to send
    {
        driver.findElement(by).sendKeys(text);
        Random random=new Random();
        int randomInt=random.nextInt(100);
    }
    public void verifyTheText(String expText,By by)
    {
        String actualMsg=getTextFromElement(by);
        Assert.assertEquals(expText,actualMsg);
    }
    public void clearButton(By by){
        WebElement login= driver.findElement((by));
        login.clear();
    }

    //***********************Alert Methods***********************//

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * This method will accept alert
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /**
     * This method will dismiss alert
     */
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * This method will get text from alert
     */
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    /**
     * This method will send text to alert
     */
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    //*************************** Action Methods ***************************************//

    public void mouseHover(By by)
    {
        Actions actions=new Actions(driver);
        WebElement hoverElement=driver.findElement(by);
        actions.moveToElement(hoverElement).build().perform();
    }
    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverOnElement(WebElement menu){
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).build().perform();
    }

    /*public void verifyTheText(String expText,By by)
    {
        String actualMsg=getTextFromElement(by);
        Assert.assertEquals(expText,actualMsg);
    }*/

    //**********************Select class methods*************//
    /*public void selectFromDropDown(By by,String txt)
    {
        List<WebElement> items= driver.findElements(by);
        for (WebElement option:items)
        {
            if(option.getText().equalsIgnoreCase(txt))
            {
                option.click();
            }
        }
    }
    public void selectFromDropDownUsingSelectClass(By by, String text)
    {
        WebElement dropDown= driver.findElement(by);
        Select select=new Select(dropDown);
        List <WebElement> elements=select.getOptions();
        for (WebElement item:elements)
        {
            System.out.println(item.getText());
            if(item.getText().equalsIgnoreCase(text))
            {
                select.selectByVisibleText(text);
                item.click();
            }
        }
    }*/
    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text)
    {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    /**
     * This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }
    /**
     * This method will select the option by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }
    /**
     * This method will select the option by contains text
     */
    public void selectByContainsTextFromDropDown(By by, String text)
    {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }
    //*************************** Window Handle Methods ***************************************//

    /**
     * This method will close all windows
     */
    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    /**
     * This method will switch to parent window
     */
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    /**
     * This method will find that we switch to right window
     */
    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

    /*public void listDropDown(By by, String text, By by1)

    {
        List<WebElement> itemList = driver.findElements(by);
        for (WebElement item : itemList) {
            if (item.getText().equalsIgnoreCase(text)) {
                System.out.println(item.getText());
                Assert.assertEquals("Verify", text, item.getText());
                clickOnElement(by1);
            }
        }
    }*/
    //******************************Wait Methods***********************//
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));


    }
    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }
}
