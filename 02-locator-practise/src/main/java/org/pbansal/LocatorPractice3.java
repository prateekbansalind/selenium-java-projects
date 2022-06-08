package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorPractice3 {
    public static void main(String[] args) throws InterruptedException {

        // setup chrome driver
        WebDriverManager.chromedriver().setup();

        // setup driver interface for chromedriver class
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait - its waiting for an element to appear.

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // //header/div/button[1]/following-sibling::button[1]
        String selectionText = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
        System.out.println(selectionText);
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
    }
}