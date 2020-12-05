package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

    public static void main(String[] args) {
        By loginLink = By.linkText("Log in");
        WebElement element = driver.findElement(loginLink);
        System.out.println(element);
    }

}
