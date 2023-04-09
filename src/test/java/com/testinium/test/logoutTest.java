package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class logoutTest extends BaseTest {
    @Test
    public void logout() {
        Methods methods = new Methods();
        //Logout
        methods.click(By.xpath("//*[@class='checkout-logo']"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@class='menu top login']//ul//li//a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@class='menu top login']//ul//li//div//ul//li[4]//a"));
    }
}
