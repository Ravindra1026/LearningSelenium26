package org.example.ex04_18032026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_xpath {
    @Test
    public void testMethod() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//input[@id = 'username']"));
        email.sendKeys("ravi02@mailinator.com");

        WebElement password = driver.findElement(By.xpath(" //input[@id = 'password']"));
        password.sendKeys("Test@123");

        WebElement signInButton = driver.findElement(By.xpath(" //button[@id = 'frm-btn']"));
        signInButton.click();

        Thread.sleep(10000);

        WebElement labelFreeTrial = driver.findElement(By.xpath("//span[contains(text(),'free trial')]"));
        String actualText = labelFreeTrial.getText();


        Assert.assertEquals(actualText,"Your free trial has expired");





        driver.quit();


    }
}
