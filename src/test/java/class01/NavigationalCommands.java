package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // smaller window
        //driver.manage().window().fullscreen();

        driver.get("https://www.google.com");  // doesn't keep history and cannot go back and forward
                                            // waits for the webpage to load before going to the next command


        driver.navigate().to("https://www.facebook.com"); // keeps history and can go back and forward
                                            // doesn't wait for the webpage to load before going to the next command

        // slow down the code
        Thread.sleep(2000);

        // go to google.com back
        driver.navigate().back();

        // slow down the code
        Thread.sleep(2000);

        // go forward to fb
        driver.navigate().forward();

        // slow down the code
        Thread.sleep(2000);

        // refresh
        driver.navigate().refresh();

        // close browser
        //driver.close();
    }
}
