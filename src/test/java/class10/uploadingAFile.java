package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class uploadingAFile {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement imageUpload = driver.findElement(By.xpath("//input[@id='image-file']"));
        imageUpload.sendKeys("C:\\Users\\IronMan\\Desktop\\SYNTAX.JPG");

    }
}
