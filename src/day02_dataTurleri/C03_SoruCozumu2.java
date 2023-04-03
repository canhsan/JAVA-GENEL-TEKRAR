package day02_dataTurleri;

import java.util.Scanner;

public class C03_SoruCozumu2 {
    public static void main(String[] args) {
         /*
             Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
             girilen bilgiler : J Doe, 44
         */

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        char ilkharf=scan.next().charAt(0);

        System.out.println("Lütfen soy adınızı giriniz.");
        String soyAd=scan.next();

        System.out.println("Lütfen yaşınız giriniz");
        double yas=scan.nextDouble();

        /*     System.out.println("İsminiz: " + ilkharf +
                "\n"+ "Soy adınız: "
                + soyAd +
                "\n"+"Yaşınız: " + yas);

         */
        System.out.println(ilkharf+" "+ soyAd+", "+yas);


    }
}
