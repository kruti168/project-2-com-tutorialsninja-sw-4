package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountPage extends Utility {
       By clickonMyAccount = By.xpath("//span[contains(text(),'My Account')]");
       By verifyRegister = By.xpath("//h1[contains(text(),'Register Account')]");
       By verifyReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
       By firstName = By.id("input-firstname");
       By lastName = By.id("input-lastname");
       By email = By.id("input-email");
       By telephone = By.id("input-telephone");
       By password = By.id("input-password");
       By passwordConfirm = By.id("input-confirm");
       By subscribe = By.xpath("//label[normalize-space()='Yes']");
       By privacyPolicy = By.xpath("//input[@name='agree']");
       By continueButton = By.xpath("//input[@value='Continue']");
       By verifyAccountCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
       By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
       By verifyAccountlogout = By.xpath("//h1[contains(text(),'Account Logout')]");
       By clickoncontinue3 = By.xpath("//a[contains(text(),'Continue')]");
       By myAccount = By.xpath("//span[normalize-space()='My Account']");
       By login = By.linkText("Login");
       By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
       By enterEmail = By.id("input-email");
       By enterPassword = By.id("input-password");
       By login1 = By.linkText("Login");

    public void selectMyAccountOptions(String option){
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }


    }
    public void clickOnMyAccountLink(){
        clickOnElement(clickonMyAccount);
    }
    //1.3 Verify the text “Register Account”.
    public void verifyTheTextRegister(){
      verifyText(driver,verifyRegister,"Register Account");
    }
    //2.3 Verify the text “Returning Customer”.
    public void verifyReturningCustomer(){

        verifyText(driver,verifyReturningCustomer,"Returning Customer");
    }
    public void typeFirstName() {
        sendTextToElement(firstName, "Prime");
    }
    public void typeLastName() {
        sendTextToElement(lastName, "Testing");
    }
    public void typeEmail() {
        sendTextToElement(email, "prime444@gmail.com");
    }
    public void typeTelephone(){
        sendTextToElement(telephone,"01547895656");
    }
    public void typePassword() {
        sendTextToElement(password, "Prime123");
    }
    public void typeconfirmPassword(){
        sendTextToElement(passwordConfirm,"Prime123");
    }
    public void clickSubscribe(){
        clickOnElement(subscribe);
    }
    public void clickOnPrivacy(){
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void VerifyAccountHasBeenCreated(){

        verifyText(driver,verifyAccountCreated,"");
    }
    public void clickOnContinue1(){

        clickOnElement(clickOnContinue);

    }public void verifyAccountLogout(){

        verifyText(driver,verifyAccountlogout,"Account Logout");
    }
    public void clickOnContinue2(){

        clickOnElement(clickoncontinue3);
    }public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public void enterEmail(){

        sendTextToElement(enterEmail,"prime444@gamil.com");
    }
    public void enterPassWord(){

        sendTextToElement(enterPassword,"Prime123");
    }
    public void clickOnLogin1(){
        clickOnElement(login1);
    }

}
