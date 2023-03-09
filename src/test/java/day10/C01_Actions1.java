package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends TestBase {
    @Test
    public void test01() {
        //    Class: Actions1
//    Method: rightClick
//    https://the-internet.herokuapp.com/context_menu  sitesine gidin
driver.get("https://the-internet.herokuapp.com/context_menu");
//    Kutuya sag tıklayın
        waitFor(3);
        Actions actions=new Actions(driver);
//    Alert’te cikan yazinin “You selected a context menu” oldugunu
//    test edin
       WebElement kutu= driver.findElement(By.id("hot-spot"));
        actions.contextClick(kutu).perform();
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());
//    Tamam diyerek alert’i kapatın
        waitFor(3);
        driver.switchTo().alert().accept();
    }
}