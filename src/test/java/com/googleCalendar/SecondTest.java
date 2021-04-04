package com.googleCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SecondTest extends WebDriverSettings {

    @Test
    public void secondTest() {

        driver.get("https://google.com/");  // пришли на станицу google.com
        String title = driver.getTitle(); // получить title страницы, записать в переменную
        Assert.assertTrue(title.equals("Google"));  // проверка title сайта
        System.out.println("Точно попали на Google");  // вывод в консоль
        driver.findElement(By.name("q")).sendKeys("Калькулятор");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

    }
}
