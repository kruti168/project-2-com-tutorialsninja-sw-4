package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();



   @Test
  public void verifyProductsPriceDisplayHighToLowSuccessfully(){

     laptopsAndNotebooksPage.mouseHoverOnLaptopAndNotebooksClick();
     laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();
     laptopsAndNotebooksPage.sortByPriceHighToLow();
     laptopsAndNotebooksPage.verifyProductPriceHighToLow();
}
@Test
     public void verifyThatUserPlaceOrderSuccessfully(){

    laptopsAndNotebooksPage.mouseHoverOnLaptopAndNotebooksClick();
    laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();
    laptopsAndNotebooksPage.sortByPriceHighToLow();
    laptopsAndNotebooksPage.selectProductMacBook();
    laptopsAndNotebooksPage.verifyTextMacBook();
    laptopsAndNotebooksPage.clickOnAddToCart();
    laptopsAndNotebooksPage.verifySuccessMessage();
    laptopsAndNotebooksPage.clickOnShoppingCart();
    laptopsAndNotebooksPage.verifyTextShoppingCart();
    laptopsAndNotebooksPage.verifyProductNameMacBook();
    laptopsAndNotebooksPage.changeQty2();
    laptopsAndNotebooksPage.clickOnUpdateTab();
    laptopsAndNotebooksPage.verifyMessageSuccessYouHaveModifiedYourShoppingCart();
    laptopsAndNotebooksPage.verifyTotal73745();
    laptopsAndNotebooksPage.clickOnCheckoutButton();
    laptopsAndNotebooksPage.verifyTheTextNewCustomer();
    laptopsAndNotebooksPage.clickOnGuestCheckoutButton();
    laptopsAndNotebooksPage.clickOnContinueButton();
    laptopsAndNotebooksPage.enterFirstName("Prime");
    laptopsAndNotebooksPage.enterLastName("Testing");
    laptopsAndNotebooksPage.enterEmail("prime00888@gmail.com");
    laptopsAndNotebooksPage.enterPassword("Prime123456");
    laptopsAndNotebooksPage.enterAddress("101,keats court, Wembley");
    laptopsAndNotebooksPage.enterCity("London");
    laptopsAndNotebooksPage.enterPostcode("HA0 3NZ");
    laptopsAndNotebooksPage.sortByDropDownCountry("United Kingdom");
    laptopsAndNotebooksPage.sortByDropDownRegion("Greater London");
    laptopsAndNotebooksPage.clickOnGuestContinueButton();
    laptopsAndNotebooksPage.enterComments();
    laptopsAndNotebooksPage.clickOnCheckBox();
    laptopsAndNotebooksPage.clickOnContinue();
    laptopsAndNotebooksPage.warningMessage();

}

}
