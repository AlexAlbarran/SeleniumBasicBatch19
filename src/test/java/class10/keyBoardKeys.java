package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class keyBoardKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/keypress.php");

        WebElement inputKeys = driver.findElement(By.xpath("//input[@class='form-control']"));

        inputKeys.sendKeys(Keys.ENTER);
//
        Thread.sleep(2000);
        inputKeys.sendKeys(Keys.END);
    }
}
