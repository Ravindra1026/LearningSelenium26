package org.example.ex03_15032026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium04 {
    private static final Logger log = LoggerFactory.getLogger(Selenium04.class);

    @Test
    public void testMethod(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentButton.click();

        WebElement userName = driver.findElement(By.id("txt-username"));
        userName.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        driver.quit();


    }
}
