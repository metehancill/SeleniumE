package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(String email, String password) {
        Methods methods = new Methods();
        methods.click(By.xpath(".//div[@Class= 'menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id= 'login-email']"), email);
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id= 'login-password']"), password);
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='js-popup-accept-button']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath(".//button[@Class= 'ky-btn ky-btn-orange w-100 ky-login-btn']"));
        methods.waitBySeconds(3);

    }

}
