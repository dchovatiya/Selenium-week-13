package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputersDesktopsPage extends Utility {
    By computers = By.linkText("Computers");
    By desktops = By.linkText("Desktops");
    By sortBy = By.xpath("//select[@id='products-orderby']");
    By nameZToA=By.xpath("//select[contains(.,'Name: Z to A')]");
    By addToCartBtn=By.xpath("//button[contains(.,'Add to cart')]");
    By verifyTxt=By.xpath("//h1[contains(.,'Build your own computer')]");
    By processorOne=By.xpath("//select[@id='product_attribute_1']");
    By ram8GB=By.xpath("//select[@id='product_attribute_2']");
    By radioHDD=By.xpath("//input[@id='product_attribute_3_7']");
    By radioOS=By.xpath("//input[@id='product_attribute_4_9']");
    By chkBoxSoftware1=By.xpath("//input[@id='product_attribute_5_10']");
    By chkBoxSoftware3=By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice=By.xpath("//span[@id='price-value-1']");
    By addToCartBtn1=By.xpath("//button[@id='add-to-cart-button-1']");
    By msgAftAddToCart=By.xpath("//p[contains(.,'The product has been added to your shopping cart')]");
    By close=By.xpath("//span[contains(@title,'Close')]");
    By shoppingCart=By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']");
    By goToCart=By.xpath("//button[@class='button-1 cart-button']");
    By verifyTxtShoppingCart=By.xpath("//div[@class='page-title']//h1[.='Shopping cart']");
    By changeQty=By.xpath("//td[@class='quantity']/child::input");
    By updateShoppingCartBtn=By.xpath("//button[@class='button-2 update-cart-button']");
    By verifyMsg=By.xpath("//td[@class='cart-total-right']//span[starts-with(text(),'$2,950.00')]");
    By chkBox=By.xpath("//input[@id='termsofservice']");
    By checkOutBtn=By.xpath("//button[@id='checkout']");
    By verifyWelcomeMsg=By.xpath("//div[@class='page login-page']//h1[.='Welcome, Please Sign In!']");
    By chkOutAsGuestBtn=By.xpath("//button[contains(@class,'button-1 checkout-as-guest-button')]");

    //Locators for the form
    By firstNm=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNm=By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailId=By.xpath("//input[@id='BillingNewAddress_Email']");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCd=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNum=By.id("BillingNewAddress_PhoneNumber");
    By continueBtn=By.xpath("//button[@onclick='Billing.save()']");

    //Locators for radio buttons
    By radioBtnNxtDay=By.xpath("//input[@id='shippingoption_1']");
    By getContinueBtn=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radioBtnCC=By.xpath("//input[@id='paymentmethod_1']");
    By conBtn=By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    //Locators for card
    By selectCC=By.xpath("//select[@id='CreditCardType']");
    By cardholderName=By.id("CardholderName");
    By CardNum=By.id("CardNumber");
    By ExpirationMonth=By.id("ExpireMonth");
    By ExpirationYear=By.id("ExpireYear");
    By CardCode=By.id("CardCode");
    By paymentBtn=By.xpath("//div[@id='payment-info-buttons-container']");
    By verifyPayMethod=By.xpath("//li[@class='payment-method']");
    By verifyShippingMethod=By.xpath("//li[@class='shipping-method']");
    By verifyTotal=By.xpath("//td[@class='cart-total-right']//span[contains(.,'$2,960.00')]");
    By confirmOrderBtn=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By verifyTYText=By.xpath("//div[@class='page-title']");
    By verifyYourOrderSucText=By.xpath("//div[@class='title']//strong[contains(text(),'Your order has been successfully processed!')]");
    By contBtn=By.xpath("//div[@class='buttons']");
    By verifyWelMsg=By.xpath("//div[@class='topic-block-title']");

    public void clickOnComputers()
    {
        clickOnElement(computers);
        clickOnElement(desktops);
        clickOnElement(sortBy);
    }
    public void selectFromDropDownNameZtoA()
    {
        selectByVisibleTextFromDropDown(nameZToA,"Name: Z to A");
        //Remaining verifying
    }
    public void selectFromDropDownNameAtoZ()
    {
        selectByVisibleTextFromDropDown(nameZToA,"Name: A to Z");
        //Remaining verifying
    }
    public void setShoppingCartTillPayment() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(addToCartBtn);
        verifyTheText("Build your own computer",verifyTxt);
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(processorOne,"2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(ram8GB,"8GB [+$60.00]");

        Thread.sleep(2000);
        clickOnElement(radioHDD);
        clickOnElement(radioOS);
        Thread.sleep(2000);
        clickOnElement(chkBoxSoftware1);
        clickOnElement(chkBoxSoftware3);
        //verifyTheText("$1,475.00",verifyPrice);
        clickOnElement(addToCartBtn1);

        Thread.sleep(2000);
        verifyTheText("The product has been added to your shopping cart",msgAftAddToCart);
        clickOnElement(close);
        Thread.sleep(2000);
        mouseHover(shoppingCart);
        clickOnElement(goToCart);
        verifyTheText("Shopping cart",verifyTxtShoppingCart);
        clickOnElement(changeQty);
        Thread.sleep(2000);
        clearButton(changeQty);
        sendTextToElement(changeQty,"2");


        Thread.sleep(2000);
        clickOnElement(updateShoppingCartBtn);
        //verifyTheText("2,950.00",verifyMsg);
        Thread.sleep(2000);
        clickOnElement(chkBox);
        clickOnElement(checkOutBtn);
        verifyTheText("Welcome, Please Sign In!",verifyWelcomeMsg);
        clickOnElement(chkOutAsGuestBtn);
    }
    public void fillingTheForm() throws InterruptedException
    {
        Thread.sleep(2000);
        sendTextToElement(firstNm,"Jason");
        sendTextToElement(lastNm,"Patel");
        sendTextToElement(emailId,"Abc123@yahoo.com");
        sendTextToElement(country,"United Kingdom");
        sendTextToElement(city,"Cardiff");
        sendTextToElement(address,"512 Harrow");
        sendTextToElement(postalCd,"90001");
        sendTextToElement(phoneNum,"07456049865");
        clickOnElement(continueBtn);
    }
    public void fillCreditCardInfo() throws InterruptedException
    {
        Thread.sleep(2000);
        clickOnElement(radioBtnNxtDay);
        clickOnElement(getContinueBtn);
        clickOnElement(radioBtnCC);
        clickOnElement(conBtn);
    }
    public void fillInformationOfMasterCard() throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(selectCC,"Master card");
        sendTextToElement(cardholderName,"Ricky Sheikh");
        sendTextToElement(CardNum,"4883342685779068");
        selectByIndexFromDropDown(ExpirationMonth,03);
        selectByVisibleTextFromDropDown(ExpirationYear,"2028");
        Thread.sleep(2000);
        sendTextToElement(CardCode,"864");
        clickOnElement(paymentBtn);
    }
    public void verifyAndConfirmOrder() throws InterruptedException
    {
        Thread.sleep(2000);
        verifyTheText("Payment Method: Credit Card",verifyPayMethod);
        verifyTheText("Shipping Method: Next Day Air",verifyShippingMethod);
        //verifyTheText("$2,960.00",verifyTotal);
        Thread.sleep(2000);
        clickOnElement(confirmOrderBtn);
        verifyTheText("Checkout",verifyTYText);
        Thread.sleep(2000);
        verifyTheText("Your order has been successfully processed!",verifyYourOrderSucText);
        Thread.sleep(2000);
        clickOnElement(contBtn);
        verifyTheText("Welcome to our store",verifyWelMsg);
    }
}