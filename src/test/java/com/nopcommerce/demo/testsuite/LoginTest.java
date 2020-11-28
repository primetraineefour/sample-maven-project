package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class LoginTest extends TestBase {


    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        clickOnElement(By.className("ico-login"));
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){
        clickOnElement(By.className("ico-login"));
        sendTextToElement(By.id("Email"), "abc@gmail.com");
        sendTextToElement(By.id("Password"), "123456");
        clickOnElement(By.xpath("//input[@class='button-1 login-button']"));
        String expectedMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
