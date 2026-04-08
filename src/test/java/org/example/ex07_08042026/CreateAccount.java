package org.example.ex07_08042026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class CreateAccount {
    @Test
    public void testMethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='btn-login']"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement createAccountBtn = driver.findElement(By.xpath("//span[text() = 'Create Account']"));
        createAccountBtn.click();

        Thread.sleep(5000);

        WebElement name = driver.findElement(By.xpath("//input[@data-name='name']"));
        name.sendKeys("Vikas Gupta");

        WebElement website = driver.findElement(By.xpath("//input[@data-name='website']"));
        website.sendKeys("vikas.com");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("vikas@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@maxlength='36']"));
        phone.sendKeys("9867234516");




        Thread.sleep(5000);
        driver.quit();


    }
}
