package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNG_Grouping {

    @Test(groups = {"sanity", "regression"})
    public void loginTest1(){
        System.out.println("Running test - loginTest 1");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void loginTest2(){
        System.out.println("Running test - loginTest 2");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest3(){
        System.out.println("Running test - loginTest 3");
    }

    @Test(groups = {"smoke", "regression1"})
    public void loginTest4(){
        System.out.println("Running test - loginTest 4");
    }

    @Test(groups = {"regression", "regression1"})
    public void registrationTest1(){
        System.out.println("Running test - registrationTest 1");
    }

    @Test(groups = {"regression", "regression1"})
    public void computerTest1(){
        System.out.println("Running test - computerTest 1");
    }

    @Test(groups = {"regression", "regression1"})
    public void computerTest2(){
        System.out.println("Running test - computerTest 2");
    }

}
