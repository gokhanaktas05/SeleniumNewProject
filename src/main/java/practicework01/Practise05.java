package practicework01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practise05 {
    public static void main(String[] args) {
//        C01_TekrarTesti isimli bir class olusturun
//        2- https://www.google.com/ adresine gidin
//        3- cookies uyarisini kabul ederek kapatin
//        4Sayfa basliginin “Google” ifadesi icerdigini test edin
//        5Arama cubuguna “Nutella” yazip aratin
//        6Bulunan sonuc sayisini yazdirin
//        7sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//        8Sayfayi kapatin
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Test Passed");
        }else System.out.println("Title Test FAİLED");
        WebElement nutella=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        nutella.sendKeys("Nutella");
        nutella.submit();
        List<WebElement> aramaSonucYazisi = driver.findElements(By.xpath("//*[@id='result-stats']"));
        System.out.println("Arama Sonuc Yazisi = " + aramaSonucYazisi.get(0).getText());
        String[] sayi=aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println(sayi[1]);
       String sayi2=aramaSonucYazisi.get(0).getText().split(" ")[1].replaceAll("//D","");










    }
}
