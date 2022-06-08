package org.pbansal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {

        // It's an old method.
        // to find chromedriver.exe at local machine to invoke chrome browser.
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\chromedriver_win32\\chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "C:\\Users\\prate\\geckodriver\\geckodriver.exe");

        WebDriverManager.chromedriver().setup(); // It's a new method to invoke chrome browser.
        // WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.edgedriver().setup();

        // to use methods exposed by WebDriver Interface, we need to create an object of ChromeDriver
        // which only exposes methods provided by WebDriver Interface.
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new EdgeDriver();

        // basic selenium commands
        driver.get("https://www.google.com/"); // open up the given website.
        System.out.println(driver.getTitle()); // gives title of the webpage in the console output.
        System.out.println(driver.getCurrentUrl()); // gives url of the webpage in the console output.
        // System.out.println(driver.getPageSource()); This command is useful if we cannot get a page source from the browser manually.
        driver.navigate().to("https://www.datacom.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.close(); // this method closes the current webpage opened by the selenium.
        // driver.quit(); // this method closes all the webpages opened by the selenium.



    }
}