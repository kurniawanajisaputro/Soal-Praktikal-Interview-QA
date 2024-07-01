package com.sauce_demo.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 01/07/2024 21:26
@Last Modified 01/07/2024 21:26
Version 1.0
*/

import com.sauce_demo.connection.Constants;
import com.sauce_demo.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BurgerPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement buttonHamburgerProduct;

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
    private WebElement buttonAllItems;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement buttonLogout;

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
    private WebElement buttonResetApp;

    public BurgerPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void clickButtonHamburger()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonHamburgerProduct)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Tidak Ditemukan !!");
        }
    }

    public void clickButtonLogout()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonLogout)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Tidak Ditemukan !!");
        }
    }

    public void clickButtonReset()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonResetApp)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Tidak Ditemukan !!");
        }
    }
}
