package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {
    @Test
    public void hoverOverTest(){


//MANUAL:
//1. Amazon home sayfasina git
    driver.get("https://amazon.com");
//2. Account & list e uzerinde bekle
        Actions actions=new Actions(driver);
      WebElement accountList= driver.findElement(By.id("nav-link-accountList"));
      waitFor(1);
      actions.moveToElement(accountList).perform();

//3.Acilan pencerede Account linkine tokla
        driver.findElement(By.linkText("Account")).click();
//4.Acilan sayfanin Title inin, your Account oldugunu dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}
