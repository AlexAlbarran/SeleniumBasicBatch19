package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        // switching to iframe using index
        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.xpath("//input[@name='Topic']"));
        input.sendKeys("abracadabra Willy");

        // switching back to main frame
        driver.switchTo().defaultContent();

        // switching to iframe using id
        driver.switchTo().frame("dropdownIframe");

        WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
        // using an Object to be able to select fom a dropdown list
        Select sel=new Select(dropdown);
        sel.selectByIndex(2); // 0=Cat, 1=Baby Cat, 2=Big Baby Cat, 3=Avatar

        driver.switchTo().defaultContent();

        // switching to iframe using index
        driver.switchTo().frame(0);

        //finding the frame as a webelement
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frame3);

        //checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();


    }
}
