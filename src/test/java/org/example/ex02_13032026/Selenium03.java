package org.example.ex02_13032026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

public class Selenium03 {
    @Test
    public void testMethod() throws Exception {
        // katalon-demo-cura.herokuapp.com
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // TestNG Assertion
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        // AssertJ Assertion
        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service").isNotBlank().isNotEmpty();

        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        }
        else{
            throw new Exception("Heading not Found");
        }
        driver.quit();
    }
}
