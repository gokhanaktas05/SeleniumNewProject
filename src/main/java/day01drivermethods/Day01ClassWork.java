package day01drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
       driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
       System.out.println("Sayfa baslıgı: " +driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
       String actualTittle=driver.getTitle();
       if (actualTittle.contains("Amazon")){
          System.out.println("Tittle Testi PASSED");
        }else
          System.out.println("Tittle Testi FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa adresi: "+driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String curntUrl=driver.getCurrentUrl();
        if (curntUrl.contains("amazon")){
            System.out.println("url testi PASSED");
        }else
            System.out.println("Url testi FAİLED");
        //Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle değeri "+driver.getWindowHandle());
        String sayfaKodlari= driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")){
            System.out.println("source code testi PASSED");
        }else
            System.out.println("source code testi FAİLED");
        driver.close();
    }
}
