package practicework01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practise04 {
    public static void main(String[] args) {
        //1-Test01 isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        //5-”Salesforce Apex Questions Bank” icin arama yapiniz
        //6- Kac sonuc bulundugunu yaziniz
        //7-Sayfayi kapatin
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
        List<WebElement> aramaKtusu2= driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaKtusu2.size() = " + aramaKtusu2.size());







    }
}
