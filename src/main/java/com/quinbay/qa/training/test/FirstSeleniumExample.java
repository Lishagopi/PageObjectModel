package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstSeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("woocommerce-product-search-field-0"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        if (elements.isEmpty())
            System.out.println("\n\n Element not found");
        else
            System.out.println("\n\n Element Found");
        //driver.close();
        WebElement item= driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        item.click();
        WebElement addtocart = driver.findElement(By.name("add-to-cart"));
        addtocart.click();
        WebElement viewcart = driver.findElement(By.linkText("View cart"));
        viewcart.click();
        WebElement checkout = driver.findElement(By.linkText("Checkout"));
        checkout.click();
        WebElement firstname = driver.findElement(By.id("billing_first_name"));
        firstname.sendKeys("lisha");
        WebElement lastname = driver.findElement(By.id("billing_last_name"));
        lastname.sendKeys("Gopi");
        WebElement companyname = driver.findElement(By.id("billing_company"));
        companyname.sendKeys("QuinBay");
        Select country = new Select(driver.findElement(By.id("billing_country")));
        country.selectByVisibleText("India");
        WebElement housename = driver.findElement(By.name("billing_address_1"));
        housename.sendKeys("1/17-1,School main street");
        WebElement apartment = driver.findElement(By.name("billing_address_2"));
        apartment.sendKeys("pernaickenpatti");
        WebElement town = driver.findElement(By.name("billing_city"));
        town.sendKeys("Sivakasi");
        /*WebElement state = driver.findElement(By.xpath("//select[@name='billing_state']"));
        Select sl = new Select(state);
        sl.selectByVisibleText("Tamil Nadu");*/
        WebElement pincode = driver.findElement(By.name("billing_postcode"));
        pincode.sendKeys("626123");
        WebElement phonenumber = driver.findElement(By.name("billing_phone"));
        phonenumber.sendKeys("9790244649");
        WebElement email = driver.findElement(By.name("billing_email"));
        email.sendKeys("lishagopi12@gmail.com");
        WebElement createacc = driver.findElement(By.id("createaccount"));
        //Thread.sleep(3000);
        createacc.click();
        WebElement password = driver.findElement(By.name("account_password"));
        password.sendKeys("Gopi@2000##");
        WebElement cod = driver.findElement(By.xpath("//label[contains(text(),'Cash on delivery')]"));
        cod.click();
        WebElement placeorder = driver.findElement(By.id("place_order"));
        placeorder.submit();
        Thread.sleep(3000);
        driver.close();
    }}















