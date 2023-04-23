package day08_methodOlusturma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_methodOlusturma {
    public static void main(String[] args) {
        //ikiSayiyiTopla();
        //ikiSayiyiTopla();
        //C03_methodOlusturma.faktöryelHesaplayanMethod(5);
        int sonuc=C03_methodOlusturma.faktöryelHesaplayanMethod(5);
        System.out.println(sonuc);
    }

    public static void ikiSayiyiTopla() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplanmak üzere iki sayı giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("iki sayının toplamı :" + (sayi1 + sayi2));
    }

}
