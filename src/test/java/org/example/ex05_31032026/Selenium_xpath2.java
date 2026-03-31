package org.example.ex05_31032026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_xpath2 {
    @Test
    public void testMethod() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchButton = driver.findElement(By.xpath("//button[ @id = 'gh-search-btn']"));
        searchButton.click();

        List <WebElement> searchTitle = driver.findElements(By.xpath("//div[@class = 's-card__title']"));
        List <WebElement> priceTitle = driver.findElements(By.xpath("//span[@class = 'su-styled-text primary bold large-1 s-card__price']"));
        int size = Math.min(searchTitle.size(),priceTitle.size());

        for (int i=0; i<size; i++){
            System.out.println("Title : " + searchTitle.get(i).getText() + " || " + "Price : " + priceTitle.get(i).getText());

        }

        Thread.sleep(5000);




        driver.quit();



    }
}
