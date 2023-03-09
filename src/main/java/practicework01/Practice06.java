package practicework01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
        WebElement eposta= driver.findElement(By.xpath("//input[@id='email']"));
        eposta.sendKeys("fnsdgnd");
        WebElement paasword= driver.findElement(By.xpath("//input[@id='pass']"));
        paasword.sendKeys("djbdgjad");
        driver.findElement(By.xpath("//button[@name='login']")).click();


    }
}
