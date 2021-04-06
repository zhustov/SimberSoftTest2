package com.googleCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test3 extends WebDriverConfig {

    @Test
    public void test3() {

        //Открыть гиперссылку google.com
        driver.get("https://google.com/");
        //Получить title страницы, записать в переменную "title"
        String title = driver.getTitle();
        //Проверка title страницы и убедиться, что мы имеено на станице Google
        Assert.assertTrue(title.equals("Google"));
        //Вывести в консоль
        System.out.println("Точно попали на Google");
        //Ввести в поиск Google "Калькулятор"
        driver.findElement(By.name("q")).sendKeys("Калькулятор");
        //Нажать ENTER
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //Кнопка не всегда корректно срабатывает, по-этому принял решение нажимать клавишу "Enter"
        //driver.findElement(By.name("btnK")).click();

        //Нажать "sin"
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")).click();
        //Нажать "="
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

        //В переменную "ans" занести значение из тэга span
        String ans = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")).getText();
        //Проверить переменную, сравнить значения
        Assert.assertTrue(ans.equals("sin() ="));
        //Вывести в консоль полученное значение
        System.out.println(ans);

        //В переменную "res" занести значение из тэга span
        String res = driver.findElement(By.xpath("//*[@id=\"cwos\"]")).getText();
        //Проверить переменную, сравнить значения
        Assert.assertTrue(res.equals("Error"));
        //Вывести в консоль полученное значение
        System.out.println(res);
    }
}
