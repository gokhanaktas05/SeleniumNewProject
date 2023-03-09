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

public class C01_Dropdown {
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
    public void selectByIndexTest(){
        //Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken

        //Dogun yilini, ayini, ve gununu su sekilde secer : 2000, January, 10
        //1 ADIM: Locate dropdown element
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));

        //2.ADIM. select objesi olustur
        Select yearDropdown=new Select(year);
        //3. adım:
        yearDropdown.selectByIndex(22);//secenek sırası 0' dan baslar..


        //Ay Secimi>>>
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDropdown=new Select(month);
        monthDropdown.selectByValue("0"); // opptıonun value değeri ile yapılır. 0 ınki januvaery dir

        //Gun Seçimi

        WebElement day= driver.findElement(By.id("day"));
        Select gunDrop=new Select(day);
        gunDrop.selectByVisibleText("10");//case sensetive// aynsı neyse o yazılır.String olarak yazılır




    }
    @Test
    public void printAllTest(){

        //Tum eyalet isimlerini consola yazdıralım
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown=new Select(state);
        List<WebElement>stateList=stateDropdown.getOptions(); //getoptions Web ELEMENT METHODU veriyordu
        for (WebElement eachState:stateList){
            System.out.println(eachState.getText());
           // stateList.stream().forEach(t-> System.out.println(t.getText())); lambda ile
        }
    }
    @Test
    public void getSelectedOptionTest(){  //isSelected()>> boolean return eder.
        //       State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown=new Select(state);
        String varsayılanText=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State",varsayılanText);
        //getOptions()>> listedeli hepsini retur eder//getFirstSelectedOption...>> sadece seçili olannı return eder.

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
  /*
1. What is dropdown? Dropdown nedir?
Dropdown liste olusturmak icin kullanilir.
2. How to handle dropdown elements? Dropdown nasil automate edilir?
-Dropdown'i Locate ederiz
-Select objecti'i olustururum
-Select objecti'i ile istedigim secenegi secerim
NOT: Select object'i olusturma nedenim, dropdownlarin Select class'i ile olusturulmasi
3)Tum dropdown seceneklerini nasıl prınt ederiz
Tum dropdown seceneklerini getOptions() methodu ile listeye koyarız.
sonra secenekleri de loop ile listeye yazdıırız.
4) Bir seceneğin secili oldugunu otomate etmek için ne yapılır?
*/