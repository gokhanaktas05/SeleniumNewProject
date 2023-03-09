package practicework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        String actualTittle=driver.getTitle();
        if (actualTittle.contains("verify")){
            System.out.println("Youtube title testi PASSSED");
        }else
            System.out.println("youtube testi FAİLED "+ actualTittle);

        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains("youtube")){
            System.out.println("Url testi PASSED");
        }else
            System.out.println("Url Testi FAİLED "+actualUrl);

        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        String actualTittle2=driver.getTitle();
        if (actualTittle2.contains("Amazon")){
            System.out.println("Url Testi PASSED");
        }else
            System.out.println("Url Testi FAİLED "+actualTittle2);
        String pageUrl= driver.getCurrentUrl();
        if (pageUrl.contains("https://www.amazon.com/")){
            System.out.println("url testi passed");
        }else
            System.out.println("url testi failed "+pageUrl);




    }
}
