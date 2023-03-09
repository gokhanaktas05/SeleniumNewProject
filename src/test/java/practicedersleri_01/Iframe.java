package practicedersleri_01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Iframe extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // ...Exercise 1...
        // https://html.com/tags/iframe sayfasına gidiniz
        driver.get("https://html.com/tags/iframe");
        // Videoyu görecek kadar asagiya ininiz
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        // Videoyu izlemek icin Play tusuna basiniz
        ///önce ıframe locate edilir
        WebElement ıframe= driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(ıframe);
        WebElement oynat= driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        oynat.click();
        // Videoyu calistirdiginizi test ediniz
        WebElement youtubeyazisi=driver.findElement(By.xpath("//*[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
        Assert.assertTrue(youtubeyazisi.isDisplayed());
        // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
        driver.switchTo().parentFrame();
        WebElement powerfull= driver.findElement(By.xpath("//*[text()='Powerful, but easy to misuse']"));
        Assert.assertTrue(powerfull.isDisplayed());


    }
}
