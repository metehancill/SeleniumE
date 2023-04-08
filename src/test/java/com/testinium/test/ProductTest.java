package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

    @Test
    public void ProductTest(String productName) {
        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"), productName);
        methods.click(By.cssSelector(".common-sprite.button-search"));

        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[4]/div[2]/div[3]/a[4]/i"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/h2")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi!"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[5]/div[2]/div[3]/a[4]/i"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/h2")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi!"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[6]/div[2]/div[3]/a[5]/i"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/h2")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi!"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[7]/div[2]/div[3]/a[4]/i"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/h2")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi!"));
        methods.waitBySeconds(2);


    }


//
//    @Test
//    public void getAttribute(){
//
//    Methods methods = new Methods();
//    String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
//        System.out.println("Alınan text: "+attribute);
//        methods.waitBySeconds(3);
//    }
//
//    @Test
//    public void getTextTest(){
//        Methods methods = new Methods();
//        String text = methods.getText(By.cssSelector(".common-sprite"));
//        System.out.println("Alınan text: "+text);
//        methods.waitBySeconds(3);
//    }
//
//    @Test
//    public void valueTest(){
//        Methods methods = new Methods();
//        methods.sendKeys(By.id("search-input"),"testinium");
//        String value = methods.getValue(By.id("search-input"));
//        System.out.println("Alınan Text: "+value);
//        Assert.assertEquals("testinium",value);
//        methods.waitBySeconds(5);
//    }

}
