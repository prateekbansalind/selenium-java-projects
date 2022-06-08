package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LocatorPractice2 {
    public static void main(String[] args) throws InterruptedException {

            // setup chrome driver
            WebDriverManager.chromedriver().setup();

            // setup driver interface for chromedriver class
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait - its waiting for an element to appear.
            String userName = "pbansal";
            String password = getPassword(driver);

            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys(userName);
            driver.findElement(By.name("inputPassword")).sendKeys(password);
            driver.findElement(By.className("signInBtn")).click();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.tagName("p")).getText());
            Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
            System.out.println(driver.findElement(By.tagName("h2")).getText());
            Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+userName+",");
            driver.findElement(By.xpath("//*[text()='Log Out']")).click(); // find web element locator based on text

            // close browser
            driver.close();
    }

    // method to capture password.
        public static String getPassword(WebDriver driver) throws InterruptedException {
                driver.get("https://rahulshettyacademy.com/locatorspractice/");
                driver.findElement(By.linkText("Forgot your password?")).click();
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // .className
                String passwordSuggestion = driver.findElement(By.cssSelector("form p")).getText();
                // Please use temporary password 'rahulshettyacademy' to Login.
                String password = passwordSuggestion.split("'")[1].split("'")[0];
                return password;

        }
}

