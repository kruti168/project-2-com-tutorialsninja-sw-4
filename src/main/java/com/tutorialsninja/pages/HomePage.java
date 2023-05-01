package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By mouseHoverClickDesktop = By.linkText("Desktops");
    By verifyText1 = By.xpath("//h2[contains(text(),'Desktops')]");
    By mouseHoverLaptopAndNotebooks = By.linkText("Laptops & Notebooks");
    By verifyTextLaptop = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By mouseHoverComponents = By.linkText("Components");
    By verifyTextComponents = By.xpath("//h2[contains(text(),'Components')]");




    public void selectMenu(String menu){
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }

    }// Mouse hover on “Desktops” Tab and click
    public void mouseHoverOnDesktopsTabAndClick(){

       mouseHoverToElementAndClick(mouseHoverClickDesktop);

    }//Verify the text ‘Desktops’
    public void verifyTheTextDesktops(){

        verifyText(driver,verifyText1,"Desktops");

    }//Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHoverOnLaptopAndNotebooks(){

        mouseHoverToElementAndClick(mouseHoverLaptopAndNotebooks);
    }//Verify the text ‘Laptops & Notebooks’
    public void verifyTextLaptopsAndNotebooks(){

        verifyText(driver,verifyTextLaptop,"Show AllLaptops & Notebooks");
    }//Mouse hover on “Components” Tab and click
    public void mouseHoverOnComponents(){

        mouseHoverToElementAndClick(mouseHoverComponents);
    }//Verify the text ‘Components’
    public void verifyTextComponents(){

        verifyText(driver,verifyTextComponents,"Components");
    }

}
