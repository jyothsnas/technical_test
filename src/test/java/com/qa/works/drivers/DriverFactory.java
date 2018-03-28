package com.qa.works.drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    private String browser = (System.getProperty("browser") == null) ? "" : System.getProperty("browser");


    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }

    public WebDriver openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;

            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
        }
        driver.get("http://www.qaworks.com/");
        return driver;

    }

    public void closeBrowser() {
        driver.quit();
    }

    public DriverFactory maxBrowser() {
        driver.manage().window().maximize();
        return this;
    }

    public DriverFactory applyWaits() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
