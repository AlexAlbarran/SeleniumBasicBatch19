package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        //instance of chromeDriver
        WebDriver driver=new ChromeDriver();

        // open the Chrome browser and navigate to a particular website
        driver.get("https://facebook.com");

        // maximize the window
       driver.manage().window().maximize();

        //enter full screen mode,  I commented it because I want to stay in maximize mode
        //driver.manage().window().fullscreen();

        //get the title of the webpage
        String title = driver.getTitle();
        System.out.println("The title of the webpage is "+title);

        // just for observation, delete after use
        Thread.sleep(4000);

        driver.quit();
    }
}
