package practicework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfanın konumu "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: "+driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: "+driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: "+driver.manage().window().getSize());
        driver.close();


    }
}
