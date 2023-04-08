package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("--diasable-notification");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome 11");
        caps.setCapability("os", "Mac");
        chromeOptions.merge(caps);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com");
    }

    //@After
    public void tearDown(){
        if (driver != null) {
            driver.close();// sekmeleri kapatır.
            //driver.quit();//chrome'u kapatır.
        }
    }

}
