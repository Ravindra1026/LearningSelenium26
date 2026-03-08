package org.example.ex01_08032026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium03 {
    public static void main(String[]args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
    }
}
