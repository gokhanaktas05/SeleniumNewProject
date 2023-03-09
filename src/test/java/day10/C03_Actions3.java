package day10;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions3 extends TestBase {

    @Test
    public void scrollUpDownTest() {

        //https://techproeducation.com a git
        driver.get("https://techproeducation.com");
        //Sayfanin altına doğru gidelim
        Actions actions=new Actions(driver);
        waitFor(2);
       /* actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();*/
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN);
        waitFor(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();// PAGE DOWN DAN DAHA AZ gider
        //Sonra sayfanın üstüne doğru gidelim
        waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        waitFor(2);

        actions.sendKeys(Keys.ARROW_UP).perform();

    }
}
