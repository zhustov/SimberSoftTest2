package com.googleCalendar;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver2/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
