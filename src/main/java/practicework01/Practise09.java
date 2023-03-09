package practicework01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practise09 {
    static List<String> goruntulemeList = new ArrayList<>();
    static List<String>cardList=new ArrayList<>();
    static List<WebElement> phoneNames;
    static List<WebElement> addToCard;
    static List<WebElement> listNames;
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        //click on Phones & PDAs
        driver.findElement(By.xpath("//*[text()='Phones & PDAs']")).click();
        Thread.sleep(2000);
        //get the brandName of phones
        phoneNames = driver.findElements(By.xpath("//h4"));
        getName(phoneNames, goruntulemeList);
        Thread.sleep(2000);
        //        ~ click on add to button for all elements
        addToCard=driver.findElements(By.xpath("//*[text()='Add to Cart']"));
        allClick(addToCard);
        Thread.sleep(2000);
        //click on black total added cart button
        driver.findElement(By.xpath("//*[@id='cart-total']")).click();
       // ~ get the names of list from the cart
       listNames= driver.findElements(By.xpath("//*[@class='text-left']"));
        getName(listNames,cardList);
        //        ~ compare the names from displaying list and cart list
        compareLists(goruntulemeList,cardList);
        System.out.println("oldu");

    }

    public static void compareLists(List<String>a,List<String>b){
        System.out.println(a.equals(b) ? "Listeler aynı":"Listeler farklı");
    }
    public static void getName(List<WebElement> a, List<String> b) throws InterruptedException {
        for (WebElement w : a) {
            b.add(w.getText());
        }
        System.out.println(b);
        Thread.sleep(2000);
    }

    public static void allClick(List<WebElement> a) throws InterruptedException {
        for (WebElement w : addToCard) {
            w.click();
            Thread.sleep(2000);
        }
    }
}