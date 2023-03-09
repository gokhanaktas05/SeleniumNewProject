package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day01_ExcelRead {
    @Test
    public void readExcelTest() throws IOException {
//    WORKBOOK (EXCEL DOSYASI) > WORKSHEET/SHEET(SAYFA) >ROW (SATIR)> CELL(VERI HUCRESI)
        String path ="./src/test/java/resources/Capitals.xlsx";
//        String path =".\\src\\test\\java\\resources\\Capitals.xlsx";//WINDOWS
//        DOSYAYI AC
        FileInputStream fileInputStream = new FileInputStream(path);
//        EXCEL DOSYASINI AC /WORKBOOK AC
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        SAYFAYI AC / Sheet1
//        Sheet sheet1 = workbook.getSheetAt(0);//index 0 dan baslar. ilk sayfayi ac
        Sheet sheet1 = workbook.getSheet("Sheet1");// Sheet1 isimli sayfayi ac

//        ILK SATIRA GIT / Row
        Row row1 = sheet1.getRow(0);//ILK SATIRA GIT
//        INK SATIRDAKI ILK VERIYI AL
        Cell cell1 = row1.getCell(0);//ILK HUCREDEKI DATAYI VER
//        O VERIYI YAZDIR
        System.out.println(cell1);
        //        1. SATIR 2. SUTUN
        Cell cell12 = sheet1.getRow(0).getCell(1);
        System.out.println(cell12);

        //3. satır 1. sütun ve o verinin France oldugunu test et
        String cell31=sheet1.getRow(2).getCell(0).toString();
        System.out.println(cell31);
        Assert.assertEquals("France",cell31);

        //Excel deki toplam kullanılan satır sayısını bul
        int toplamSatirSayisi=sheet1.getLastRowNum()+1;// son satır numarası.index 0 dan baslıyor
        System.out.println(toplamSatirSayisi);//11
        //Kullanılan toplam satır sayısını bul
        int kullanılanToplamSatirSayisi=sheet1.getPhysicalNumberOfRows();
        System.out.println(kullanılanToplamSatirSayisi);//1 den baslıyor

        //Country, capitals key ve value ları map e alıp print et
     //   {{USA, D.C} , {FRANCE,PARIS},...}
        Map<String,String>ulkeBaskentleri=new HashMap<>();
        for (int satirSayisi=1;satirSayisi<kullanılanToplamSatirSayisi;satirSayisi++){
            String country = sheet1.getRow(satirSayisi).getCell(0).toString();
            String capital = sheet1.getRow(satirSayisi).getCell(1).toString();
            ulkeBaskentleri.put(country,capital);
        }
        System.out.println(ulkeBaskentleri);


    }
}
