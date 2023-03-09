package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsandLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına git
        //Search bölümünü locate edelim.
        //Searh bolumunde ıphone aratalım
        driver.get("https://www.amazon.com");
        WebElement serchtestBox = driver.findElement(By.id("twotabsearchtextbox"));

        serchtestBox.sendKeys("Iphone", Keys.ENTER);
/*
Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
findElement(BY.id("attribute degeri")) seklinde yazariz.
 */
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("linkler.size() = " + linkler.size());
        List<WebElement> linkler2 = driver.findElements(By.tagName("input"));
        System.out.println("linkler2 sayısı: " + linkler2.size());

    }

}