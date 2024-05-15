package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class tables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        //  print all the rows of the table
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row:tableRows){
            System.out.println(row.getText());
        }

        //  print all the rows of the table
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count=0;

        for(WebElement row:column){
            if(row.getText().equalsIgnoreCase("in progress")){
                System.out.println("the row number is "+(count+1));
//                rows
                WebElement rowN = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+(count+1)+"]"));
                System.out.println(rowN.getText());

            }
            count++;
        }

    }
}
