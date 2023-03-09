package day11;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_JavaFaker  {

    @Test
    public void javaFakerTest(){
        //Faker objesi olustur
    Faker faker=new Faker();
    //2. Faker objesi ile fake data olustur
        String fName=faker.name().firstName();
        System.out.println(fName);
    // last name datası
    String lName=faker.name().lastName();
        System.out.println(lName);
    //Kullanıcı adı
    String userName=faker.name().username();
        System.out.println(userName);
    //meslek ismi
        System.out.println(faker.name().title());
    //adres
        System.out.println(faker.address().city());
    //eyalet
        System.out.println(faker.address().state());
    //full adres
        System.out.println(faker.address().fullAddress());
    // cep no
        System.out.println(faker.phoneNumber().cellPhone());
    // e mail
        System.out.println(faker.internet().emailAddress());
    // posta code
        System.out.println(faker.address().zipCode());
    //rasgele 10 haneli no alabiliriz
        System.out.println(faker.number().digits(15));
        /*
TEST DATA : kullanici adi, sifre, tel no, e-mail, sehir, kredi kart no,...
Test datalari kimden alinir?
1- BA-Business Analyst (Acceptance Criteria'lari yazar)
2- Test Lead
3- Manual Tester
4- Tech Lead & Team Lead & DEV Lead
5- Developer
6- Database
7- API call'lar
8- Documentations. Ornegin, API swagger dokumani.
9- Java Faker da fake data almak icin kullaniyoruz.
NERDEN GELMEZ : kullanicidan alinmaz, scrum master,..
 */

    }
}
