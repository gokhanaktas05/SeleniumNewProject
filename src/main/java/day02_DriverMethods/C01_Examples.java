package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*Amazon,facebook ve youtube  sayfasına git,
        Amazona tekrar dön
        *
        * */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().back();
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else
            System.out.println("Url testi FAİLED ");
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        //istediğimiz sekilde oldugunu test edelim
        Dimension actualYeniSize=driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 &&actualYeniSize.getHeight()==600){
            System.out.println("size test passed");
        }else
            System.out.println("size test failed");
        Point actualYeniKonum=driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 &&actualYeniKonum.getY()==50){
            System.out.println("konum testi passed");
        }else
            System.out.println("konum testi failed");
        driver.close();

    }
}
