package com.BriteERP.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Driver {


    //1-Make constructor private
    private Driver() {

    }


    private static WebDriver driver;


    public static WebDriver getDriver() {

        // we use public access modifier, bec we will call it by its name

        if(driver == null) {
            String browser =  ConfigurationReader.getProperty("browser");

            switch (browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

            }
        }

        return driver;

    }


    public static void closeDriver() {
        if( driver != null ) {
            driver.quit();
            driver=null;
        }
    }



}
