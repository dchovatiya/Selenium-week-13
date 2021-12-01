package com.nopcommerce.testsuite;
import org.openqa.selenium.By;
import com.nopcommerce.pages.ComputersDesktopsPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;


public class TestSuiteTest extends TestBase {
    ComputersDesktopsPage computersDesktopsPage = new ComputersDesktopsPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder()
    {
        computersDesktopsPage.clickOnComputers();
        computersDesktopsPage.selectFromDropDownNameZtoA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computersDesktopsPage.clickOnComputers();
        computersDesktopsPage.selectFromDropDownNameAtoZ();
        computersDesktopsPage.setShoppingCartTillPayment();
        computersDesktopsPage.fillingTheForm();
        computersDesktopsPage.fillCreditCardInfo();
        computersDesktopsPage.fillInformationOfMasterCard();
        computersDesktopsPage.verifyAndConfirmOrder();
        computersDesktopsPage.verifyAndConfirmOrder();
    }
}

