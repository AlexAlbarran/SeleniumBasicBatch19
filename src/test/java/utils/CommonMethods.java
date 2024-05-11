package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.sql.Driver;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() throws IOException {

        switch (ConfigReader.read("browser")) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));
    }


}


