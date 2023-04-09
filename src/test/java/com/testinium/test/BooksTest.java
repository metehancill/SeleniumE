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
    public void Books() {
        Methods methods = new Methods();
        //Sort for 'Yüksek Oylama'
        methods.selectByText(By.cssSelector("select#review-sort-selection"), "Yüksek Oylama");
        methods.click(By.xpath("//ul[@class='js-ajaxCt js-bookCt']/li[@class='has-open-menu']/span[.='Tüm Kitaplar']"));
        methods.click(By.xpath("//a[.='Hobi']"));


        List<WebElement> productList = driver.findElements(By.xpath("//ul[@class='product-grid jcarousel-skin-opencart']//li"));
        int listSize = productList.size();
        Random random = new Random();
        int randomNumber = random.nextInt(listSize);
        WebElement randomProduct = productList.get(randomNumber);
        methods.waitBySeconds(2);
        randomProduct.click();
        methods.waitBySeconds(2);

        //Adding to Cart
        methods.click(By.xpath("//a[@id='button-cart']"));
        methods.waitBySeconds(3);

    }
}
