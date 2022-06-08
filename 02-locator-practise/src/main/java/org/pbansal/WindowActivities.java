package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowActivities {
    public static void main(String[] args) throws InterruptedException {

        // setup chrome driver
        WebDriverManager.chromedriver().setup();

        // setup driver interface for chromedriver class
        WebDriver driver = new ChromeDriver();

        // setup the browser size to its maximum limit
        driver.manage().window().maximize();

        driver.get("https://www.google.com");  // driver.get() - this method will take you to the webpage and wait for the page to load all the elements.
        driver.navigate().to("https://www.amazon.com"); // driver.navigate().to() - this method will take just take you to the webpage.
        driver.navigate().back();
        driver.navigate().to("https://www.wwe.com");
        driver.navigate().back();
        driver.close();

    }
}