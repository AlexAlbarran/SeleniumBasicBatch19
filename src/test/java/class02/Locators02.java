package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // enter username
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        // enter password
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //click on login
        WebElement button=driver.findElement(By.name("ctl00$MainContent$login_button"));
        button.click();

        // confirm that you have logged in
        WebElement message= driver.findElement(By.className("login_info"));
        // get the text from the webElement
        String text=message.getText();
        // print out
        System.out.println("The text is "+text);

        // get the title of the webPage
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")){
            System.out.println("You have logged in");
        }else{
            System.out.println("You haven't logged in");
        }
    }
}
