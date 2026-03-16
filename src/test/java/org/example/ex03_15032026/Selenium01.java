package org.example.ex03_15032026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void testMethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");
        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin123");
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();
        Thread.sleep(3000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));

        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");
        assertThat(errorMessage.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");


        driver.quit();

    }
}
