package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testinium.driver.BaseTest.driver;

public class orderTest extends BaseTest {

    @Test
    public void orderCaseTest() {
        Methods methods = new Methods();
        //Go to Cart
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/div[2]/div[2]/div/a"));
        methods.waitBySeconds(2);

        //Adding item to Cart
        driver.findElement(By.xpath("//tbody//tr//td[@class='quantity']//input")).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//tbody//tr//td[@class='quantity']//input"), "5");
        methods.waitClick(By.xpath("//tbody//tr//td[@class='quantity']//i"));

        //New Adress
        methods.click(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/a[2]"));

        //Cargo Adress test
        WebElement inputName = methods.findElement(By.xpath("//input[@id='address-firstname-companyname']"));
        inputName.sendKeys("Metehan");
        methods.waitBySeconds(2);
        WebElement inputSurname = methods.findElement(By.xpath("//input[@id='address-lastname-title']"));
        inputSurname.sendKeys("Çil");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-country-id']"), "Türkiye");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "KARTAL");
        methods.waitBySeconds(2);

        WebElement inputDistrict = methods.findElement(By.xpath("//input[@id='district']"));
        inputDistrict.sendKeys("SOĞANLIK YENİ MAH");
        methods.waitBySeconds(3);

        WebElement inputAdress = methods.findElement(By.xpath("//textarea[@id='address-address-text']"));
        inputAdress.sendKeys("Soğanlık Yeni Mah, Pamukkale Sk. No:11 Kartal/İstanbul");
        methods.waitBySeconds(2);

        WebElement inputPostcode = methods.findElement(By.xpath("//input[@id='address-postcode']"));
        inputPostcode.sendKeys("34880");
        methods.waitBySeconds(2);

        WebElement inputPhone = methods.findElement(By.xpath("//input[@id='address-mobile-telephone']"));
        inputPhone.sendKeys("5554443322");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(3);

        //Card Info
        WebElement inputCardName = methods.findElement(By.xpath("//input[@id='credit-card-owner']"));
        inputCardName.sendKeys("Metehan Çil");
        methods.waitBySeconds(2);

        WebElement inputCardNum = methods.findElement(By.xpath("//input[@id='credit_card_number_1']"));
        inputCardNum.sendKeys("0000111122223333");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "07");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2027");
        methods.waitBySeconds(2);

        WebElement inputSecureCode = methods.findElement(By.xpath("//input[@id='credit-card-security-code']"));
        inputSecureCode.sendKeys("456");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(3);

        //Error Message
        Assert.assertEquals("Kart numarası geçersiz. Kontrol ediniz!", driver.findElement(By.xpath("(//*[@data-group='credit-card-inputs'])[4]//span")).getText());
        methods.waitBySeconds(2);
    }

}
