package com.nopcommerce.demo.homework;

import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByTest extends TestBase {

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //Mouse hove on Computer Menu and click on desktop
        mouseHoverToElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),\"Computers\")]"));
        clickOnElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),'Computers')]//parent::li//ul//a[contains(text(), 'Desktops')]"));
        //sort by position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: Z to A");

        //Getting list of web elements of product name
        List<WebElement> deskTopPCs = getListOfElements(By.xpath("//h2[@class='product-title']"));

        //Declaring the String List to store product name
        List<String> deskTopNames = new ArrayList<>();

        for (WebElement deskTop : deskTopPCs) {
            deskTopNames.add(deskTop.getText());
        }

        // Create the temp list of product name and sort it using Collections.sort method
        List<String> tempList = new ArrayList<>();
        tempList.addAll(deskTopNames);

        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(deskTopNames);
        System.out.println(tempList);
        Assert.assertEquals(deskTopNames, tempList);
    }

}
