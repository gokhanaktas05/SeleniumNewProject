package day06_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_Practice01 {
    WebDriver driver;

    //eger test sınıfında birden fazla method olusturulmussa @before kullannılması gerekir.before class değil.
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    @Test
    public void testFromSelect(){
        WebElement yil= driver.findElement(By.xpath("//*[@id='year']"));
        Select yilobje=new Select(yil);
        yilobje.selectByIndex(36);

        WebElement ay= driver.findElement(By.xpath("//*[@id='month']"));
        Select objeay=new Select(ay);
        objeay.selectByVisibleText("August");

        WebElement gun= driver.findElement(By.xpath("//*[@id='day']"));
        Select objegun=new Select(gun);
        objegun.selectByVisibleText("16");

        WebElement state= driver.findElement(By.xpath("//*[@id='state']"));
        Select objeState=new Select(state);
        List<WebElement>stateList=objeState.getOptions();
        for (WebElement w:stateList){
            System.out.println(w.getText());
        }
        //       State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        WebElement verifyState= driver.findElement(By.xpath("//*[@id='state']"));
        Select dropState=new Select(verifyState);
        String actualState=dropState.getFirstSelectedOption().getText();
        String expectedState="Select a State";
        Assert.assertEquals(expectedState,actualState);
    }

}