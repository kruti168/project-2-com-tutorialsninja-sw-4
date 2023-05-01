package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    By mouseHoverLaptopAndClick = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By clickOnAllLaptopAndNotebooks = By.linkText("Show AllLaptops & Notebooks");
    By sortPrice = By.xpath("//select[@id='input-sort']");
    By selectMacbook = By.linkText("MacBook");
    By verifyTextMacbook = By.xpath("//h1[contains(text(),'MacBook')]");
    By clickAddToCart = By.xpath("//button[@id='button-cart']");
    By verifySuccess = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickOnShopping = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTextShoppinCart = By.xpath("//div[@id='content']//h1");
    By verifyMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By changeQty2 = By.xpath("//input[contains(@name, 'quantity')]");
    By clickOnupdate = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By verifySuccessMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    By verify£73745  = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By clickOncheckout = By.xpath("//a[contains(text(),'Checkout')]");
    By verifyNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");
    By clickOnguestButton = By.xpath("//label[normalize-space()='Guest Checkout']");
    By clickonContinueButton = By.xpath("//input[@id='button-account']");
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");
    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");
    By emailField = By.xpath("//input[@id='input-payment-email']");
    By passwordField = By.xpath("//input[@id='input-payment-telephone']");
    By addressField = By.xpath("//input[@id='input-payment-address-1']");
    By cityField = By.xpath("//input[@id='input-payment-city']");
    By postcodeField = By.xpath("//input[@id='input-payment-postcode']");
    By countryField = By.xpath("//select[@id='input-payment-country']");
    By regionField = By.xpath("//select[@name='zone_id']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By comments = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    By checkBox = By.xpath("//input[@name='agree']");
    By continueBtn = By.xpath("//input[@id='button-payment-method']");
    By warningMessage = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
    By guestButton = By.xpath("//input[@id='button-guest']");


    public void mouseHoverOnLaptopAndNotebooksClick(){
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHoverToElementAndClick(mouseHoverLaptopAndClick);
    }
    public void clickOnShowAllLaptopsAndNotebooks() {
        //1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(clickOnAllLaptopAndNotebooks);
    }
    //1.3 Select Sort By "Price (High > Low)"
    public void sortByPriceHighToLow() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        //1.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);


    }//1.3 Select Sort By "Price (High > Low)"
    public void verifyProductPriceHighToLow(){
        selectByVisibleTextFromDropDown(sortPrice,"Price (High > Low)");

    }//2.4 Select Product “MacBook”
    public void selectProductMacBook(){

       clickOnElement(selectMacbook);
    }
    //2.5 Verify the text “MacBook”
    public void verifyTextMacBook(){

        verifyText(driver,verifyTextMacbook,"MacBook");
    }//2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCart(){

        clickOnElement(clickAddToCart);
    }
    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    public void verifySuccessMessage(){

        verifyText(driver,verifySuccess,"Success: You have added MacBook to your shopping cart!");
    }//2.8 Click on link “shopping cart” display into success message
    public void clickOnShoppingCart(){

        clickOnElement(clickOnShopping);
    }//2.9 Verify the text "Shopping Cart"
    public void verifyTextShoppingCart(){

        verifyText(driver,verifyTextShoppinCart,"Shopping Cart");
    }//2.10 Verify the Product name "MacBook"
    public void verifyProductNameMacBook(){

        verifyText(driver,verifyMacBook,"MacBook");
    }//2.11 Change Quantity "2"
    public void changeQty2(){

        sendTextToElement(changeQty2,"2");

    }//2.12 Click on “Update” Tab
    public void clickOnUpdateTab(){

        clickOnElement(clickOnupdate);
    }//2.13 Verify the message “Success: You have modified your shopping cart!”
    public void verifyMessageSuccessYouHaveModifiedYourShoppingCart(){

        verifyText(driver,verifySuccessMessage,"Success: You have modified your shopping cart!");
    }//2.14 Verify the Total £737.45
    public void verifyTotal73745(){

        verifyText(driver,verify£73745,"£737.45");
    }//2.15 Click on “Checkout” button
    public void clickOnCheckoutButton(){

        clickOnElement(clickOncheckout);
    }//2.17 Verify the Text “New Customer”
    public void verifyTheTextNewCustomer(){

        verifyText(driver,verifyNewCustomer,"New Customer");
    }//2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckoutButton(){

        clickOnElement(clickOnguestButton);
    }//2.19 Click on “Continue” tab
    public void clickOnContinueButton(){

        clickOnElement(clickonContinueButton);
    } //2.20 Fill the mandatory fields, enter email into email field
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void sortByDropDownCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void sortByDropDownRegion(String region) {
        selectByVisibleTextFromDropDown(regionField, region);
    }
    //2.21 Click on “Continue” Button
    public void clickOnContinueButton1()  {
        clickOnElement(continueButton);
    }
    //2.22 Add Comments About your order into text area
    public void enterComments()  {
        sendTextToElement(comments, "Hi I am Prime Testing");
    }
    //2.23 Check the Terms & Conditions check box
    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }
    //2.24 Click on “Continue” button
    public void clickOnContinue() {
        clickOnElement(continueBtn);
    }

    public void clickOnGuestContinueButton(){
        clickOnElement(guestButton);
    }
    public void warningMessage(){
        verifyText(driver,warningMessage,"Warning: No Payment options are available. Please contact us for assistance!");
    }


}








