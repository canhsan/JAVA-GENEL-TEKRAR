package day02_dataTurleri;

import java.util.Scanner;

public class C05_SoruCozumu4 {
    public static void main(String[] args) {
        /*
              Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
              degerlerini degistirin(swap).
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lütfen bir sayı giriniz");
        int sayi2= scan.nextInt();


        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Sayı 1'in yeni hali:"+ sayi1);
        System.out.println("Sayı 2'nin yeni hali:"+ sayi2);


    }
}
