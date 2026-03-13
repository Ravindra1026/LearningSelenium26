package org.example.ex02_13032026;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void testMethod01() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://sdet.live");
        Thread.sleep(3000);
        // Close vs quit

       // driver.close();

        driver.quit();

    }
}
