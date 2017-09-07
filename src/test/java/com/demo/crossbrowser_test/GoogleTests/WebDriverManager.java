package com.demo.crossbrowser_test.GoogleTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {
    public static Wait<WebDriver> wait;
    public static String url;

    public static WebDriver startDriver(String type) throws MalformedURLException {
        WebDriver d;
        if (type.equals("chrome")) {
            DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
            desiredCapabilities.setCapability("version","");
            desiredCapabilities.setCapability("platform","LINUX");
            d = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"),desiredCapabilities);
        } else if (type.equals("firefox")) {
            DesiredCapabilities desiredCapabilitiesff = DesiredCapabilities.firefox();
            desiredCapabilitiesff.setCapability("version","");
            desiredCapabilitiesff.setCapability("platform","LINUX");
            d = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"),desiredCapabilitiesff   );
        } else if (type.equals("headless")) {
            DesiredCapabilities desiredCapabilitiespjs = DesiredCapabilities.phantomjs();
            desiredCapabilitiespjs.setJavascriptEnabled(true);
            d = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"),desiredCapabilitiespjs  );
        } else {
            throw new IllegalArgumentException("Browser type not supported: " + type);
        }
        return d;
    }

    public static void startBrowser(WebDriver driver, String url) {
        driver.get(getUrl(url));
        driver.manage().window().maximize();
    }

    public static java.lang.String getUrl(String url) {
        return url;
    }

    public static void stopDriver(WebDriver driver) {
        driver.quit();
    }

}