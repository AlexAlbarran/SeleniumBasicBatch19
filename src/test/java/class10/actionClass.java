package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        //  find the hover button
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        // this will hover over the Hover button so you can see the text
        Actions action=new Actions(driver);
        action.moveToElement(hoverBtn).perform();
        // observe the hover and click
        Thread.sleep(2000);

        // get the button right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        action.contextClick(rightClickBtn).perform();

        // Drag the "Drag me to the target" box to "Drop here"
        // dragable
        WebElement dragable = driver.findElement(By.id("draggable"));
        // droplocation
        WebElement dropLoc = driver.findElement(By.id("droppable"));

        action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();

        // another simple way to do the darg and drop
       // action.dragAndDrop(dragable,dropLoc).perform();

    }
}
