package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By mouseHoverDesktops = By.linkText("Desktops");
    By clickShowAllDesktops = By.linkText("Show AllDesktops");
    By verifyZToA = By.id("input-sort");
    By selectAToZ = By.id("input-sort");
    By selectHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By enterQty1 = By.name("quantity");
    By clickOnAddtoCart = By.xpath("//button[@id='button-cart']");
    By veryfySuccessMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickOnShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyShoppingCart = By.xpath("//div[@id='content']//h1\")).contains(\"Shopping Cart\")");
    By verifyProductHPLP3065 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyModal21 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By verify£7473 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    //Mouse hover on Desktops Tab.and click
    public void mouseHoverOnDesktopsTabAndClick(){

        mouseHoverToElementAndClick(mouseHoverDesktops);
    }
    //Click on “Show All Desktops”
    public void clickOnShowAllDesktops(){

        clickOnElement(clickShowAllDesktops);
    }
    //Select Sort By position "Name: Z to A"
    public void selectSortByPositionNameZToA(){

        List<WebElement>products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String>originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String>afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //1.4 Verify the Product will arrange in Descending order.
        verifyText(driver, verifyZToA," afterSortByZToAProductsName");
    }
    //2.3 Select Sort By position "Name: A to Z"
    public void selectSortByPositionNameAToZ(){

        selectByVisibleTextFromDropDown(selectAToZ, "Name (A - Z)");
    }//Select product “HP LP3065”
    public void selectProductHPLP3065(){

        clickOnElement(selectHPLP3065);
    }
    //Verify text "HP LP3065"
    public void verifyTextHPLP3065(){

        verifyText(driver,verifyHPLP3065,"HP LP3065");

    }//2.6 Select Delivery Date "2022-11-30"
    public void selectDeliveryDate() {

        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }//2.7.Enter Qty "1” using Select class.
         public void enterQty1UsingSelectClass(){
             sendTextToElement(enterQty1, "1");
        }
        //2.8Click on “Add to Cart” button
    public void clickOnAddToCartButton(){

        clickOnElement(clickOnAddtoCart);
    }//2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    public void verifySuccessMessage(){

        verifyText(driver,veryfySuccessMessage,"Success: You have added HP LP3065 to your shopping cart!");
    }
    //2.10 Click on link “shopping cart” display into success message
    public void clickOnLinkShoppingCart(){

        clickOnElement(clickOnShoppingCart);
    }//2.11 Verify the text "Shopping Cart"
     //2.12 Verify the Product name "HP LP3065"

    public void verifyShoppinCart(){

       verifyText(driver,verifyShoppingCart,"Shopping Cart");
       waitUntilVisibilityOfElementLocated(By.xpath("//div[@id='content']//h1\")).contains(\"Shopping Cart\")"),10);



    }//2.12 Verify the Product name "HP LP3065"
    public void verifyProductHPLP3065(){

        verifyText(driver,verifyProductHPLP3065,"HP LP3065");

    }//2.13 Verify the Delivery Date "2022-11-30"
    public void verifyDeliveryDate(){

    }//2.14 Verify the Model "Product21"
    public void verifyModalProduct21(){

        verifyText(driver,verifyModal21,"Product 21");
    }
    //2.15 Verify the Todat "£74.73"
    public void verifyTotal£7473(){

        verifyText(driver,verify£7473,"£74.73");

    }

    }



