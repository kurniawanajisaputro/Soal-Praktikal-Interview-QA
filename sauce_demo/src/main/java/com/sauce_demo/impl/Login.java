package com.sauce_demo.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/07/2024 21:35
@Last Modified 01/07/2024 21:35
Version 1.0
*/
import com.sauce_demo.connection.Constants;
import com.sauce_demo.connection.DriverSingleton;
import com.sauce_demo.page.BurgerPage;
import com.sauce_demo.page.LoginPage;
import com.sauce_demo.page.ProdukPage;
import com.sauce_demo.util.GlobalFunction;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Login {
    public static WebDriver driver;
    private LoginPage loginPage ;
    private ProdukPage produkPage;
    private BurgerPage burgerPage;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
        produkPage = new ProdukPage(driver);
        burgerPage = new BurgerPage(driver);
    }
    @Test(priority = 0)
    public void validLogin()throws InterruptedException{
        loginPage.inputUsername("standard_user");//STEP-2
        loginPage.inputPassword("secret_sauce");//STEP-3
        loginPage.clickLogin();//STEP-4
        Thread.sleep(2000);
        String strValidation = produkPage.getTextProductValidation();
        System.out.println("Home Page Validation "+strValidation);
        Assert.assertEquals("Products",strValidation);//STEP-5
    }
    @Test(priority = 1)
    public void addToCart(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        produkPage.clickButtonAddProduct1();
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        produkPage.getTextRemoveProduct1();
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @Test(priority = 2)
    public void Logout(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        burgerPage.clickButtonHamburger();
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        burgerPage.clickButtonLogout();
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasiLogout = loginPage.loginValidation();
        Assert.assertEquals("Swag Labs", validasiLogout);
    }
    @AfterTest
    public void closeDriver(){
        DriverSingleton.closeObjectInstance();
    }
}
