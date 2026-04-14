package org.example.ex07_08042026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class CreateContact {
    @Test
    public void test_method() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://demo.us.espocrm.com/?l=en_US#Contact");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='btn-login']"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement createContactBtn = driver.findElement(By.xpath("//span[text() ='Create Contact']"));
        createContactBtn.click();

        Thread.sleep(3000);

        //WebElement firstName =




        driver.quit();
    }
}
