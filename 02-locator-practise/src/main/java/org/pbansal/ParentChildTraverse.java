package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParentChildTraverse {
    public static void main(String[] args) throws InterruptedException {

        // setup chrome driver
        WebDriverManager.chromedriver().setup();

        // setup driver interface for chromedriver class
        WebDriver driver = new ChromeDriver();

        // setup the browser size to its maximum limit
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='o3j99 ikrT4e om7nvf']/form/div/div/div/div/div/input")).sendKeys("prateek bansal");
        driver.findElement(By.xpath("//div[@jscontroller='cnjECf']/div/center/input")).click();
        driver.findElement(By.xpath("//a[@class='ekf0x hSQtef']/div/h3")).click();
        driver.findElement(By.xpath("//img[@alt='Prateek Bansal - Associate Quality Assurance Automation Engineer - Datacom  | LinkedIn']")).click();
        String linkedinURL = "https://nz.linkedin.com/in/prateekbansalind";
        driver.findElement(By.xpath("//a[@href='"+linkedinURL+"']")).click();
    }
}