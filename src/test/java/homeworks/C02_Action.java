package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Action extends TestBase {
    @Test
    public void test01(){
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2. "Hover over Me First" kutusunun ustune gelin
        WebElement kutu= driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(kutu).perform();
waitFor(3);
        //3. "Link 1" e tiklayi
        driver.findElement(By.linkText("Link 1")).click();
        //4. Popup mesajini yazdirin
      String popup=  driver.switchTo().alert().getText();
        System.out.println("popup = " + popup);

        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //6. "Click and hold" kutusuna basili tutun
        WebElement hold= driver.findElement(By.xpath("//*[@id='click-box']"));
        actions.clickAndHold(hold).perform();
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(hold.getText());
        //8. "Double click me" butonunu cift tiklayin
        WebElement doubleClick=driver.findElement(By.xpath("//*[text()='Double Click Me!']"));
        actions.doubleClick(doubleClick).perform();
        //9. "Double click me" butonunun renk değiştridiğini doğrulayın
        WebElement yesil=driver.findElement(By.xpath("//*[@id='double-click']"));
        Assert.assertTrue(yesil.isEnabled());
    }
}
