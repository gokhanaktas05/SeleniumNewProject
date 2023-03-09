package tekrarlar01;

import org.junit.Test;

import java.util.Scanner;

public class Examples_01 {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime isteyip ve bu kelimenin ilk harfini yazdır.

        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Lütfen bir kelime giriniz");

        char ilkHarf= scan.next().charAt(0);

        System.out.println("Kelimenin ilk harfi : " + ilkHarf);
*/

     /*   System.out.println("Lütfen ağırlığınızı kilo olarak girin");

        double ağırlık= scan.nextDouble();

        System.out.println("lütfen boyunuzu cm olarak girin");

        double boy= scan.nextDouble();

        double vke= ağırlık*10000/ (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: " + vke);

        if (vke>30){
            System.out.println("Obez");
        }
        else if (vke>=25){
            System.out.println("Kilolu");
                    }
        else if (vke>=20){
            System.out.println("Normal");
        }
       else System.out.println("Zayıf");
        }
*/
        System.out.println("Lütfen cinsiyetinizi giriniz.");
        String cinsiyet = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz.");
        double yas = scan.nextDouble();

        if (yas < 0 || yas > 90) {
            System.out.println("Girilen yaş geçersiz.");
        } else if (!(cinsiyet.equalsIgnoreCase("Kadın") || cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet geçersiz.");
        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas > 60) {
            System.out.println("Emekli olabilirsin.");

        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas < 60) {
            System.out.println("Emekli olmak için" + (60 - yas) + "yıl daha çalışman gerekir");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas >= 65) {
            System.out.println("Emekli olabilirsin.");

        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas < 65) {
            System.out.println("Emekli olmak için" + (65 - yas) + "yıl daha çalışman gerekir.");

        }

    }
}










