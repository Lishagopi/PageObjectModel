package com.quinbay.qa.training.test;
import com.quinbay.qa.training.pages.PageExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import pages.PageExample;

import java.util.concurrent.TimeUnit;

public class TestExample {
    public static void main(String[] args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(3000);
        PageExample p=new PageExample(driver);
        p.SearchBoxFun("Tshirt");
        p.AddToCart();
        p.viewCart();
        p.checkOut();
        p.FirstnameFun("Lisha");
        p.LastnameFun("Gopi");
        p.CompanyFun("QuinBay");
        Thread.sleep(3000);


    }

}
