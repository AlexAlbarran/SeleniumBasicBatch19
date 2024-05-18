package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class jsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        //        to draw a boundary around the WebElement
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: yellow; border: 2px solid red;');", hoverBtn);

        // to right click on a button
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='show_context_menu']"));
        String jsScript = "var evt = document.createEvent('MouseEvents');"
               + "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, 2, null);"
               + "arguments[0].dispatchEvent(evt);";
        js.executeScript(jsScript,rightClickBtn);

        // how to scroll on a page
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-1000)");

        WebElement syntaxInfo = driver.findElement(By.xpath("//p[text()='Monday – Friday']"));
        js.executeScript("arguments[0].scrollIntoView(true)",syntaxInfo);


    }
}
