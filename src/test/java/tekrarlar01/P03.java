package tekrarlar01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
public class P03 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void iframeTest() {
//   1) https://the-internet.herokuapp.com/iframe sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
//   2) sayfadaki toplam iframe sayisini bulunuz.
        List<WebElement> iframeSayisi=driver.findElements(By.tagName("iframe"));
        System.out.println("iframeSayisi.size() = " + iframeSayisi.size());
//   3)Sayfa basliginda 'Editor' yazisini icerdigini test edelim.
        Assert.assertFalse(driver.getTitle().contains("Editor"));
//  4)Prargraftaki yaziyi silelim
       driver.switchTo().frame(0).findElement(By.xpath("(//p[text()='Your content goes here.'])")).clear();
//  5)Sonrasinda paragrafa "iframein icindeyim " yazisini yazdiralim
        driver.findElement(By.id("tinymce")).sendKeys("iframin içindeyim");
//  6)Alt kisimdaki yazinin 'Elemental Selenium' yazisini icerdigini test edelim
        driver.switchTo().parentFrame();
        String a=driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText();
        Assert.assertTrue(a.contains("Elemental Selenium"));
    }
}