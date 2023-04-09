package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;

public class favDeleteTest extends BaseTest {
    Methods methods = new Methods();

    @Test
    public void deleteFavorite() {
        //Go to Favorites
        methods.scrollWithAction(By.xpath("//*[@class='menu top my-list']"));
        methods.waitBySeconds(2);
        methods.waitClick(By.xpath("//*[@class='menu top my-list']//div//ul//li//a"));
        methods.waitBySeconds(1);

        //Deleting 3th favorite item
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][3]"));
        methods.waitClick(By.xpath("//*[@class='product-cr'][3]//*[@class='hover-menu']//a[@data-title='Favorilerimden Sil']"));
        methods.waitBySeconds(1);
    }
}
