package day02_dataTurleri;

import java.util.Scanner;

public class C04_SoruCozumu3 {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
         */
        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen sayı1'i giriniz");
        int sayi1=scan.nextInt();

        System.out.println("Lütfen sayı2'yi giriniz");
        int sayi2=scan.nextInt();

        int temp=0;

        temp=sayi2;

        sayi2=sayi1;

        sayi1=temp;
        System.out.println("Sayı1'in yeni değeri:"+sayi1);
        System.out.println("Sayı2'in yeni değeri:"+sayi2);



    }
}
