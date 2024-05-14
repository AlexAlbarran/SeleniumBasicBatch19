package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        WebElement button1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();

        WebElement textElement= driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        System.out.println(textElement.getText());

        WebElement button2= driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
        WebElement maleBtn= driver.findElement(By.xpath("//input[@value='Male']"));
        maleBtn.click();

        WebElement button3= driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        button3.click();
        WebElement opt1= driver.findElement(By.xpath("//input[@value='Option-1']"));
        opt1.click();
        WebElement opt2= driver.findElement(By.xpath("//input[@value='Option-2']"));
        opt2.click();

    }
}
