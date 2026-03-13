package org.example.ex02_13032026;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void testMethod01(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.navigate().to("https://thetestingacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());

    }
}
