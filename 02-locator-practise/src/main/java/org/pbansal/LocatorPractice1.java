package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorPractice1 {
    public static void main(String[] args) throws InterruptedException {

            // setup chrome driver
            WebDriverManager.chromedriver().setup();

            // setup driver interface for chromedriver class
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait - its waiting for an element to appear.

            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("prateekbansalind@gmail.com");
            driver.findElement(By.name("inputPassword")).sendKeys("123456");
            driver.findElement(By.className("signInBtn")).click();
            // to find correct css selector --> go to chrome dev console --> type $('tagname.classValue')
            System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // Css Selector : tagname.classValue or tagname#idValue
            driver.findElement(By.linkText("Forgot your password?")).click();
            Thread.sleep(1000); // this is a way in java to give pause for given seconds before executes the another line.
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("prateek");
            // to check xpath if its correct or not --> open console on browser --> type $x('//input[@placeholder="Name"]')
            driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("prateekbansalind@gmail.com");
            // driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
            driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890"); // //parentTag/childTag
            driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // .className
            System.out.println(driver.findElement(By.cssSelector("form p")).getText());  // parenttag childtag
            driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("pbansal");
            driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // tagname[attr*=value] --> regular expressions
            driver.findElement(By.cssSelector("input[name='chkboxOne']")).click();
            driver.findElement(By.cssSelector("input[name='chkboxTwo']")).click();
            driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

            // close browser
            // driver.close();
    }
}