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
        driver.findElement(By.name("q")).sendKeys("Docker selenium");
        driver.findElement(By.cssSelector("input[value='Google Search']")).submit();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.cssSelector("div#resultStats")).getText().contains("results"));
    }


    @Test
    public void testGoogleSearch1() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("vodQA");
        driver.findElement(By.cssSelector("input[value='Google Search']")).submit();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.cssSelector("div#resultStats")).getText().contains("results"));
    }
}

