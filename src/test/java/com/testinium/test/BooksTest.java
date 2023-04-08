package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BooksTest extends BaseTest {
    @Test
    public void Books(){
        Methods methods = new Methods();
        methods.selectByText(By.cssSelector("select#review-sort-selection"), "Yüksek Oylama");
        methods.click(By.xpath("//ul[@class='js-ajaxCt js-bookCt']/li[@class='has-open-menu']/span[.='Tüm Kitaplar']"));
        methods.click(By.xpath("//a[.='Hobi']"));

        int random = methods.random();

        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])["+random+"]"));
        methods.click(By.xpath("(//*[@class='product-cr'])["+random+"]//*[@class='hover-menu']//*[@class='add-to-cart']"));
        methods.waitBySeconds(2);

    }
}
