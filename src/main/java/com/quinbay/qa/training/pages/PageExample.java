package com.quinbay.qa.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PageExample {
    WebDriver driver;

    @FindBy(id = "woocommerce-product-search-field-0")
    WebElement searchBox;
    @FindBy(id ="billing_first_name")
    WebElement firstName;
    @FindBy(id ="billing_last_name")
    WebElement LastName;
    @FindBy(id ="billing_company")
    WebElement CompanyName;
    @FindBy(name="add_to_cart")
    WebElement addToCart;
    @FindBy(name ="view_cart")
    WebElement ViewCart;
    @FindBy(linkText ="Checkout")
    WebElement  CheckOut;

    public PageExample(WebDriver driver) {

        this.driver = driver;
    }
    public void SearchBoxFun(String item)
    {
        searchBox.click();
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.RETURN);
        searchBox.click();
    }
    public void FirstnameFun(String firstname)
    {
        firstName.sendKeys(firstname);
    }
    public void LastnameFun(String lastname)
    {
        LastName.sendKeys(lastname);
    }
    public void CompanyFun(String Companyname)
    {
        CompanyName.sendKeys(Companyname);
    }
    public void AddToCart()
    {
        addToCart.click();
    }
    public void viewCart()
    {
        ViewCart.click();
    }
    public void checkOut()
    {
        CheckOut.click();
    }
}
