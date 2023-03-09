package tekrarlar01;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class P01 extends TestBase {
    @Test
    public void testCookie(){
        driver.get("https://www.amazon.com");
       // 1.toplam cookie sayisini bul
        Set<Cookie>amazonCookie=driver.manage().getCookies();
        System.out.println("amazonCookieSayisi = " + amazonCookie.size());
        // tum cokkie leri yazdiralim
       // amazonCookie.forEach(t-> System.out.println(t.getName()));
        for (Cookie w:amazonCookie){
            System.out.println("Cookies = " + w.getName());
        }
      //  4. Yeni bir cookie ekle
        Cookie addCookie=new Cookie("amazonŞifre","KSDFAKF");
        driver.manage().addCookie(addCookie);
        System.out.println("addCookie = " + addCookie);
        System.out.println(amazonCookie.size());
       // 5. Bir Cookie yi ismiyle sil
        driver.manage().deleteCookie(addCookie);
      //  6. Tum cookie leri sil
        driver.manage().deleteAllCookies();
        amazonCookie.forEach(t-> System.out.println(t.getName()));

    }
}
