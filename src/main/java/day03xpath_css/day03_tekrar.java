package day03xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day03_tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                //Ödev
        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //-Arama kutusunu locate ediniz
       WebElement aramakutusu= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String tagname=aramakutusu.getTagName();
        String expectedTagname="input";
        if (tagname.equals(expectedTagname)){
            System.out.println("Tagname Testi PASSED "+tagname);
        }else System.out.println("Tagname Testi FAİLED "+tagname);
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String nameAttribute=aramakutusu.getAttribute("name");
        String expectedAttribute="field-keywords";
        if (nameAttribute.equals(expectedAttribute)){
            System.out.println("PASSED");
        }else System.out.println("FAİLED");

        //-Sayfayı kapatınız
        driver.close();
    }
}
