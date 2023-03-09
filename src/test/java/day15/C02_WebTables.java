package day15;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C02_WebTables extends TestBase {
    @Test
    public void table1print() {
        //    https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");
//    Create a class: WebTables
//    Task 1 : Table1’i print edin
        String table1 = driver.findElement(By.xpath("//*[@id='table1']")).getText();
        System.out.println("Table1 Verileri");
        System.out.println(table1);
        List<WebElement> tumVeriler = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement veri : tumVeriler) {
            System.out.println(veri.getText());
//    Task 2 : 3. Row’ datalarını print edin
//    Task 3 : Son row daki dataları print edin
//    Task 4 : 5. Column datalarini print edin
//    Task 5 : Iki parametreli bir Java metot oluşturalım: printData
//    Parameter 1 = row numarasi
//    Parameter 2 = column numarasi
//    printData(2,3);  => 2nd row, 3rd column daki datayı print etsin
        }
    }
public static Logger logger= LogManager.getLogger(C02_WebTables.class.getName());
    @Test
    public void row3Print() {
        //    Task 2 : 3. Row’ datalarını print edin
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> row3Elements = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        row3Elements.forEach(veri -> System.out.println(veri.getText()));
    }
    //    Task 4 : 5. Column datalarini print edin
    @Test
    public void sutun5Test(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> sutun5 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
        sutun5.forEach(veri-> System.out.println(veri.getText()));
    }

    public void printData(int satir,int sutun){
        driver.get("https://the-internet.herokuapp.com/tables");
        String myXpath = "//table[@id='table1']//tbody//tr["+satir+"]//td["+sutun+"]";
        System.out.println(driver.findElement(By.xpath(myXpath)).getText());
    }
    @Test
    public void printDataTest(){
        printData(2,3);//fbach@yahoo.com

        printData(1,2);//john

//        task 5 : Iki parametreli bir Java metot oluşturalım: printData
//        Parameter 1 = row numarasi
//        Parameter 2 = column numarasi
//        printData(2,3); => 2nd satir, 3rd sutun daki datayı print etsin
    }
}