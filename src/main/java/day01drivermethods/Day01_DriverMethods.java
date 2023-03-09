package day01drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();// Bos bir Browser actık...
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa Baslıgı: "+driver.getTitle());
        System.out.println("Sayfa url'i: "+driver.getCurrentUrl());
      //  System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz




    }
}
