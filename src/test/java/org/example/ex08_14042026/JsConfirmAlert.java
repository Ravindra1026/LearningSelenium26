package org.example.ex08_14042026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JsConfirmAlert {
    @Test
    public void testMethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsConfirm = driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']"));
        jsConfirm.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text);

        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();

        Assert.assertEquals(result,"You clicked: Ok");

        Thread.sleep(5000);

        driver.quit();


    }
}
