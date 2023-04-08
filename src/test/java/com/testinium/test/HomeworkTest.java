package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.pages.HomePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class HomeworkTest extends BaseTest {

    @Before
    public void homeTest() {
        HomePage homePage = new HomePage();
        homePage.home();
        System.out.println("Anasayfa Açıldı...");
    }

    @Test
    public void test1() {

        LoginTest loginTest = new LoginTest();
        loginTest.loginTest("cilmetehan15@gmail.com", "metehan123");

    }

    @Test
    public void test2() {
        System.out.println("Ürün Favorilere Eklenmesi...");
        ProductTest productTest = new ProductTest();
        productTest.ProductTest("Oyuncak");

    }

    @Test
    public void test3() {
        Methods methods = new Methods();
        BooksTest booksTest = new BooksTest();
        HomePage homePage = new HomePage();
        homePage.home();

        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite[href='puan-katalogu']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".[src='https://img.kitapyurdu.com/v1/getImage/fn:4359433/wh:14a4e2d16']"));

        booksTest.Books();

    }

}
