package day05_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice04 {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void nsdfsnf() throws InterruptedException {

//        Given kullanici "https://editor.datatables.net/" sayfasina gider
        driver.get("https://editor.datatables.net/");
        Thread.sleep(2000);
//    Then new butonuna basar
        driver.findElement(By.xpath("//span[.='New']")).click();
        Thread.sleep(2000);
//    And editor firstname kutusuna "<firstName>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_first_name']")).sendKeys("Gokhan");
        Thread.sleep(2000);
//    And editor lastname kutusuna "<lastName>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_last_name']")).sendKeys("AKTAS");
        Thread.sleep(2000);
//    And editor position kutusuna "<position>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_position']")).sendKeys("Automation Tester");
        Thread.sleep(2000);
//    And editor office kutusuna "<office>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_office']")).sendKeys("İlk Konak Butik Otel");
        Thread.sleep(2000);
//    And editor extension kutusuna "<extension>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_extn']")).sendKeys("---");
        Thread.sleep(2000);
//    And editor startdate kutusuna "<startDate>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_start_date']")).sendKeys("2022-10-09");
        Thread.sleep(2000);
//    And editor salary kutusuna "<salary>" bilgileri girer
        driver.findElement(By.xpath("//*[@id='DTE_Field_salary']")).sendKeys("50000");
        Thread.sleep(2000);
//    When Create tusuna basar
        driver.findElement(By.xpath("//*[@class='btn']")).click();
        Thread.sleep(2000);
//    Then Kullanıcının eklendiğini doğrular.
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Gokhan");
        WebElement control= driver.findElement(By.xpath("//*[@class='sorting_1']"));
        Assert.assertTrue("Gokhan", control.isDisplayed());
        Thread.sleep(2000);
//    And Eklediği kullanıcı kaydını siler
        driver.findElement(By.xpath("//*[@id='row_58']")).click();
        driver.findElement(By.xpath("//span[.='Delete']")).click();
        driver.findElement(By.xpath("//*[@class='btn']")).click();
        Thread.sleep(2000);
//    Then Kullanıcinin silindiğini doğrular.
        WebElement actualresult=driver.findElement(By.xpath("//*[@class='dataTables_empty']"));
        String expectedResult="No matching records found";
        Assert.assertTrue(expectedResult.equals(actualresult.getText()));
        Thread.sleep(2000);
    }
    @After
    public void tearDown()  {
        driver.quit();
    }
}