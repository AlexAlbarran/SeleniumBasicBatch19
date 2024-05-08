package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

    WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
    textBox.clear();  // will clear any text in the box
    textBox.sendKeys("abracadabra");

        // check if the radio button1 is selected
        // if no click on it
        // and confirm if it is selected

        WebElement rb1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean selectionState=rb1.isSelected();
        if(!selectionState){
            rb1.click();
        }
        // confirmation
        System.out.println("the radio button is selected "+rb1);

        // confirm that if the radiobutton2 is disabled, by printing out on the console
        WebElement rb2 = driver.findElement(By.xpath("//input[@value='option2']"));
        System.out.println("the status of the radio button2 being enabled is "+rb2.isEnabled());

        // confirm that the radio button3 is not displayed
        WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));
        System.out.println("the status of display of radio button3 is "+rb3.isDisplayed());

        WebElement text=driver.findElement(By.xpath("//div[@id='textElement']"));
        System.out.println(text.getText());

        WebElement attribute=driver.findElement(By.xpath("//div[@id='attributeElement']"));
        System.out.println(attribute.getAttribute("data-custom-attribute"));

    }
}
