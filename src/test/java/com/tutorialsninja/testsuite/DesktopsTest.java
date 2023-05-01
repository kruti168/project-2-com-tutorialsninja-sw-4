package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductArrangeInAlphabaticalOrder(){

     desktopsPage.mouseHoverOnDesktopsTabAndClick();
     desktopsPage.clickOnShowAllDesktops();
     desktopsPage.selectSortByPositionNameZToA();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
     desktopsPage.mouseHoverOnDesktopsTabAndClick();
     desktopsPage.clickOnShowAllDesktops();
     desktopsPage.selectSortByPositionNameAToZ();
     desktopsPage.selectProductHPLP3065();
     desktopsPage.verifyTextHPLP3065();
     desktopsPage.selectDeliveryDate();
     desktopsPage.enterQty1UsingSelectClass();
     desktopsPage.clickOnAddToCartButton();
     desktopsPage.verifySuccessMessage();
     desktopsPage.clickOnLinkShoppingCart();
   //  desktopsPage.verifyShoppinCart();
     desktopsPage.verifyProductHPLP3065();
  //   desktopsPage.verifyDeliveryDate();
     desktopsPage.verifyModalProduct21();
     desktopsPage.verifyTotal£7473();

    }
}
