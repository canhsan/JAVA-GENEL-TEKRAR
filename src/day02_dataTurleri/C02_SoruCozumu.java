package day02_dataTurleri;

import java.util.Scanner;

public class C02_SoruCozumu {
    public static void main(String[] args) {
        /*
         Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
         Isminiz : John
         Soyisminiz : Doe
         Yasiniz : 44
         Kaydiniz basariyla tamamlanmistir.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isiminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("lütfen soy isminizi giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        System.out.println("İsminiz: " + isim + "\n" +
                            "Soy isminiz: " + soyIsim + "\n" +
                            "Yaşınız: " + yas +"\n"+
                            "Kaydınız başarı ile tamamlanmıştır.");


    }
}
