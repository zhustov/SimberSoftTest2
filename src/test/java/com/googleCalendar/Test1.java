package com.googleCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test1 extends WebDriverConfig {

   @Test
   public void test1() {
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

       //Нажать "("
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")).click();
       //Нажать "1"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")).click();
       //Нажать "+"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
       //Нажать "2"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
       //Нажать ")"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();
       //Нажать "*"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
       //Нажать "3"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
       //Нажать "-"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();
       //Нажать "4"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")).click();
       //Нажать "0"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
       //Нажать "/"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
       //Нажать "5"
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
       //Нажать "="
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();

       //driver.manage().window().maximize();

       //В переменную "ans" занести значение из тэга span
       String ans = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")).getText();
       //Проверить переменную, сравнить значения
       Assert.assertTrue(ans.equals("(1 + 2) × 3 - 40 ÷ 5 ="));
       //Вывести в консоль полученное значение
       System.out.println(ans);

       //В переменную "res" занести значение из тэга span
       String res = driver.findElement(By.xpath("//*[@id=\"cwos\"]")).getText();
       //Проверить переменную, сравнить значения
       Assert.assertTrue(res.equals("1"));
       //Вывести в консоль полученное значение
       System.out.println(res);

   }

}


