package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    AccountPage accountPage = new AccountPage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

       accountPage.clickOnMyAccountLink();
       accountPage.selectMyAccountOptions("Register");
       accountPage.verifyTheTextRegister();
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        accountPage.clickOnMyAccountLink();
        accountPage.selectMyAccountOptions("Login");
        accountPage.verifyReturningCustomer();

    }@Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        accountPage.clickOnMyAccountLink();
        accountPage.selectMyAccountOptions("Register");
        accountPage.typeFirstName();
        accountPage.typeLastName();
        accountPage.typeEmail();
        accountPage.typeTelephone();
        accountPage.typePassword();
        accountPage.typeconfirmPassword();
        accountPage.clickSubscribe();
        accountPage.clickOnPrivacy();
        accountPage.clickOnContinue();
        accountPage.VerifyAccountHasBeenCreated();
        accountPage.clickOnContinue1();
        accountPage.clickOnMyAccountLink();
        accountPage.selectMyAccountOptions("Logout");
        accountPage.verifyAccountLogout();
        accountPage.clickOnContinue1();


    }@Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        accountPage.clickOnMyAccountLink();
        accountPage.selectMyAccountOptions("Login");
        accountPage.clickOnMyAccount();
        accountPage.clickOnRegister();
        accountPage.clickOnLogin();
        accountPage.enterEmail();
        accountPage.clickOnLogin1();
        accountPage.clickOnMyAccountLink();
        accountPage.selectMyAccountOptions("Logout");



    }

}
