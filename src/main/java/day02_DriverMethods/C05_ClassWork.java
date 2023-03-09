package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ClassWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       /* https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3-Delete butonu’nun gorunur oldugunu test edin
        4-Delete tusuna basin
        5-“Add/Remove Elements” yazisinin gorunur oldugunu test edin*/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement add= driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        add.click();
        //*[text()='Add Element']>>> web element text e sahipse(>add element<) sekllinde. bu sekilde de yapılabiilir

        WebElement detelebutonu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (detelebutonu.isDisplayed()){
            System.out.println("Delete butonu görünüyor");
        }else
            System.out.println("Failed");
        Thread.sleep(3000);
        WebElement detelebutonu2=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        detelebutonu2.click();
        Thread.sleep(3000);
        WebElement addremovebutonu=driver.findElement(By.xpath("//h3"));
        if (addremovebutonu.isDisplayed()){
            System.out.println("add/remove butonu görünüyor");
        }else
            System.out.println("add/remove butonu görünmüyor");



    }
}
