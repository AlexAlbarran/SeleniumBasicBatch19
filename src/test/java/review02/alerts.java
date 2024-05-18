package review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("mojo jojo");
        alert.accept();
    }
}
