package com.demo.crossbrowser_test.GoogleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by harithah on 4/21/17.
 */
public class GoogleTest {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser_type")
    public void setUp( String browser_type) throws MalformedURLException {
        driver=WebDriverManager.startDriver(browser_type);
        WebDriverManager.startBrowser(driver);
    }


    @AfterMethod
    public void tearDown() {
        WebDriverManager.stopDriver(driver);
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.findElement(By.name("user[name]")).sendKeys("Haritha");
        driver.findElement(By.name("user[email]")).sendKeys("harithahari13@gmail.com");
        driver.findElement(By.name("user[age]")).sendKeys("30");
        driver.findElement(By.name("commit")).submit();
    }
}

