package org.example.ex01_08032026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void test_selenium(){
        WebDriver driver = new EdgeDriver();  //dynamic dispatch

        //WebDriver class is parent class to all individual drivers.

        // method 1: WebDriver driver = new EdgeDriver();
       // method 2: ChromeDriver driver1 = new ChromeDriver();

        // When to use which method
        // method 2 is used when you have to run your test cases on only one browser
        // method 1 is used when you need to run test on multiple browser.



    }
}
