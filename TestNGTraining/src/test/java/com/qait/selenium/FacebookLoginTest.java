package com.qait.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLoginTest {

    WebDriver driver;
    String url = "https://facebook.com";

    @BeforeClass
    public void LaunchWebdriverBrowser(){
        driver = new ChromeDriver();
    }
    
    @Test
    public void LaunchFacebookURL(){
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
    }

    @Test(dependsOnMethods = "LaunchFacebookURL")
    public void FacebookLogin_IncorrectCredentials(){
        driver.findElement(By.id("email")).sendKeys("Fakemail@fake.com");
        driver.findElement(By.id("pass")).sendKeys("PakePassword");
        driver.findElement(By.name("login")).click();
    }

    @AfterClass
    public void closeBrowserSession(){
        driver.close();
    }

}
