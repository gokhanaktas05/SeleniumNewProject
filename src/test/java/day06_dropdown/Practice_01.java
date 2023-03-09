package day06_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice_01 {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1-https://books-pwakit.appspot.com/ adresine gidin.
        driver.get("https://books-pwakit.appspot.com/");
//        2-"BOOKS" başlığının görünür olduğunu doğrulayın
        WebElement actualTitle= driver.findElement(By.cssSelector("a[href=['/']"));
        String expectedTitle="BOOKS";
        Assert.assertEquals("BOOKS",actualTitle);
//        3-Arama çubuğunda "Selenium" u aratın.

//        4-Arama sonuçlarındaki ilk ürün isminin "Selenium" içerdiğini doğrulayın.

    }
}