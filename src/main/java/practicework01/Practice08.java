package practicework01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice08 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. "https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna "standard_user" yazdirin
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        //3. Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
        //4. Login tusuna basin
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();
        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//*[@class='shopping_cart_badge']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
       WebElement a= driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
       String a2="Sauce Labs Backpack";
       if (a.isDisplayed()){
           System.out.println("sepete eklendi");
       }else System.out.println("Sepete Eklenmedi");
        //9. Sayfayi kapatin
        driver.close();

    }
}
