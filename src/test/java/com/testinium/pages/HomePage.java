package com.testinium.pages;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    public HomePage (){
        methods= new Methods();
    }

    public void home(){
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath(".//div[@Class= 'logo-icon']")));

    }
}
