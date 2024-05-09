package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // find the element  with the select tag
        WebElement DD= driver.findElement(By.xpath("//select[@id='select-demo']"));
        // create select class object
        Select sel=new Select(DD);

        // select by index
        sel.selectByIndex(3);

        // slowed down for observation
        Thread.sleep(2000);

        //select by value
        sel.selectByValue("Sunday");

        // slowed down for observation
        Thread.sleep(2000);

        //select by visible text
        sel.selectByVisibleText("Monday");

        // multiple drop downs
        WebElement multipleDD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        // create select class object
        Select select1=new Select(multipleDD);

        // select class
        select1.selectByValue("Florida");

        //select by visible text
        select1.selectByVisibleText("New York");

        // select by index
        select1.selectByIndex(0);

        // options in multi-select
        select1.deselectByIndex(0);

        System.out.println("The dropdown2 is multi-select "+select1.isMultiple());
        System.out.println("The dropdown1 is multi-select "+sel.isMultiple());

        // returns all options in a list
        List<WebElement> allOptions=select1.getOptions();



    }
}
