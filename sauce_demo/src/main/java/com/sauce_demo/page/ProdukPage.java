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

public class ProdukPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement textProductLogo;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement textProductPage;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement textCartQuantity;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement textProductName1;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement buttonAddCart1;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement buttonRemoveCart1;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement getTextProductName2;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement buttonAddCart2;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement buttonRemoveCart2;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    private WebElement getTextProductName3;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement buttonAddCart3;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    private WebElement buttonRemoveCart3;


    public ProdukPage(WebDriver driver){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public String getTextProductValidation()
    {
        return (this.textProductPage == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textProductPage)).getText();
    }

    public void clickButtonAddProduct1()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonAddCart1)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Add Product Tidak Ditemukan !!");
        }
    }

    public void clickButtonAddProduct2()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonAddCart2)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Add Product Tidak Ditemukan !!");
        }
    }

    public void clickButtonAddProduct3()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonAddCart3)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Add Product Tidak Ditemukan !!");
        }
    }

    public String getTextRemoveProduct1()
    {
        return (this.buttonRemoveCart1 == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonRemoveCart1)).getText();
    }

    public String getTextRemoveProduct2()
    {
        return (this.buttonRemoveCart2 == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonRemoveCart2)).getText();
    }

    public String getTextRemoveProduct3()
    {
        return (this.buttonRemoveCart3 == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonRemoveCart3)).getText();
    }

    public String getTextCartQuantity()
    {
        return (this.textCartQuantity == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textCartQuantity)).getText();
    }




}
