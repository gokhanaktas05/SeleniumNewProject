package day04Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Day04_RelativeveLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       /* 1https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
) Berlin’i 3 farkli relative locator ile locate edin*/
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
       WebElement nYCity= driver.findElement(By.xpath("//*[@id='pid3_thumb']"));
       WebElement byArea= driver.findElement(By.cssSelector("img[id='pid8_thumb']"));
       WebElement berlinWebelement= driver.findElement(with(By.tagName("li")).below(nYCity).toLeftOf(byArea));
       berlinWebelement.click();

    }
}
