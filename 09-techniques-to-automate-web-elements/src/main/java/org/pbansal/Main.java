package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Handling Static Dropdowns - can be identified with select tag.
        driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
        Select chooseOptionStaticDropdown = new Select(driver.findElement(By.id("ddl_Adult_MST"))); // select class can be used to capture static dropdown.
        chooseOptionStaticDropdown.selectByValue("1"); //value starts with 1
        Thread.sleep(2000);
        chooseOptionStaticDropdown.selectByIndex(4); // index as usaual starts with 0
        Thread.sleep(2000);
        chooseOptionStaticDropdown.selectByVisibleText("7");
        Thread.sleep(5000);
        driver.close();

//        Handling Dynamic Dropdowns
//        Handling Checkboxes
//        Handling Radios
//        Handling TextButtons
//        Handling Alert - Java Popups
//        Selenium Webdriver Form Methods


    }
}