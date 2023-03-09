package day03xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//       1-C01_TekrarTesti isimli bir class olusturun
//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
//        3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
//        5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle= driver.getTitle();
        if (actualTitle.contains("Spend less")){
            System.out.println("Titie test PASSED");
        }else System.out.println("Title TEST FAİLED ");
//        6 Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
//        7 Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday']")).click();
//        8 Best Seller bolumunden ilk urunu tiklayin
        List<WebElement>bSeller=driver.findElements(By.xpath("//*[@alt='Amazon.com eGift Card']"));
        bSeller.get(0).click();
//        9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//*[@id='gc-mini-picker-amount-1']")).click();
//        10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretTest= driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
        if (ucretTest.getText().equals("$25.00")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED");
//        10-Sayfayi kapatin
        driver.close();



    }


}
