package day17;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_JSExecutor_Type extends TestBase {
    @Test
    public void typeTest(){
        driver.get("https://www.techproeducation.com");
        waitFor(3);
        typeWithJS(driver.findElement(By.xpath("//input[@type='search']")),"QA" );
    }
}
