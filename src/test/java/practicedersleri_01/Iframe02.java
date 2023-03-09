package practicedersleri_01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Iframe02 extends TestBase {
    @Test
    public void test02(){
        // ...Exercise 2...
        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
        WebElement text= driver.findElement(By.xpath("//*[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(text.isEnabled());
        // TextBox'a 'Merhaba Dunya' yazin.

       WebElement frame= driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(frame);
        WebElement textbox= driver.findElement(By.xpath("//*[text()='Your content goes here.']"));
        textbox.clear();
        driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Merhaba Dünya");
        // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
        driver.switchTo().parentFrame();
       WebElement pFrame= driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
       Assert.assertTrue(pFrame.isDisplayed());
        System.out.println("Element Selenium Yazısı: "+pFrame.getText());
    }
}
