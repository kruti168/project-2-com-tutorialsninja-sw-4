package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        homePage.mouseHoverOnDesktopsTabAndClick();
        homePage.selectMenu("Show AllDesktops");
        homePage.verifyTheTextDesktops();

    }
     @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

        homePage.mouseHoverOnLaptopAndNotebooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        homePage.verifyTextLaptopsAndNotebooks();
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.mouseHoverOnComponents();
        homePage.selectMenu("Show AllComponents");
        homePage.verifyTextComponents();

    }

}
