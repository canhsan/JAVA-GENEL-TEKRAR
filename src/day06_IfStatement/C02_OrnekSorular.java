package day06_IfStatement;

import java.util.Scanner;

public class C02_OrnekSorular {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
         “Sayi 5’in tam kati” yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scan.nextInt();
         //if (sayi%5==0){
            // System.out.println("sayı 5'in tam katıdır");
             /*
                Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
                sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
              */
        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");

         }
        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }


    }
}
