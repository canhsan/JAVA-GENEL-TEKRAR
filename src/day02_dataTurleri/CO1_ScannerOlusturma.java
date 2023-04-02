package day02_dataTurleri;

import java.util.Scanner;

public class CO1_ScannerOlusturma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütgen bir sayı giriniz");
        double sayi= scan.nextDouble();
        System.out.println("Girilen sayının karesi :"+ sayi*sayi);

    }
}
