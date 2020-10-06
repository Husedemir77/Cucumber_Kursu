package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if (driver == null){
            // System.SetProperty'nin karşılığı olarak projeyi chromedriver'la
            // çalışacak şekilde buraya set etmis olduk

            WebDriverManager.chromedriver().setup(); // System.Setproperty nin karsiligi
            driver = new ChromeDriver();


//            WebDriverManager.firefoxdriver().setup();  // firefoy icinde böyle yazacaktik
//            driver = new FirefoxDriver();

        }


        return driver;
    }


    public static void quitDriver()
    {

        if (driver != null){
            driver.quit();
            driver=null;
        }


    }
}
