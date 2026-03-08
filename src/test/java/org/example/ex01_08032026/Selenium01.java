package org.example.ex01_08032026;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void test_selenium(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
