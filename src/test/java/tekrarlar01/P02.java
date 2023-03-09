package tekrarlar01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class P02 extends TestBase {
    @Test
    public void test01(){

//       url'ye git: http://demo.guru99.com/popup.php
        driver.get("http://demo.guru99.com/popup.php");
//       ilk pencereyi al
        String windowHandle1=driver.getWindowHandle();
//       "Click Here" butonuna tıklayın
        driver.findElement(By.linkText("Click Here")).click();
//       setteki tüm pencereyi al
        Set<String>windowsHandles=driver.getWindowHandles();
//       diğer pencereye geç
        for (String each: windowsHandles ){
            if (!windowsHandles.equals(windowHandle1)){
                driver.switchTo().window(each);
            }
        }

//       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
        driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("somepne@gmail.com", Keys.ENTER);
//       Gönder düğmesine tıklayarak
//       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
        String actual= driver.findElement(By.xpath("//*[text()='This access is valid only for 20 days.']")).getText();
        String expected="This access is valid only for 20 days.";
        Assert.assertEquals(expected,actual);
//       Tekrar ilk pencereye geç
        driver.switchTo().window(windowHandle1);
//       İlk pencerede olduğunu doğrula
        Assert.assertTrue(driver.getWindowHandle().contains(windowHandle1));


    }
}
