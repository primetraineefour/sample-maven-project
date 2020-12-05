package com.nopcommerce.demo.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay
 */
public class TestNg_SoftAssert {

    @Test
    public void testSum(){
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("\nRunning Test -----> test sum");
        Assert.assertTrue(result == 40);
        System.out.println("\nLine after assert 1");
        Assert.assertTrue(result == 30);
        System.out.println("\nLine after assert 2");
    }

    @Test
    public void testSum1(){
        SoftAssert softAssert = new SoftAssert();
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("\nRunning Test -----> test sum1");
        softAssert.assertTrue(result == 40, "Result compare with 40");
        System.out.println("\nLine after assert 1");
        softAssert.assertTrue(result == 30,"Result compare with 30");
        System.out.println("\nLine after assert 2");
        softAssert.assertAll();
    }
}
