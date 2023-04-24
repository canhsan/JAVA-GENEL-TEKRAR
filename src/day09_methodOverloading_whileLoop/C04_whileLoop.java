package day09_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = " ";
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4) {
            flag=0;
            System.out.println("lütfen bir şifre giriniz");
            sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;

            } else {
                System.out.println("lütfen ilk karekteri küçük olarak giriniz");

            }
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;

            }else{
                System.out.println("lütfen son karekteri büyük olarak giriniz");
            }
            if (sifre.contains(" ")) {
                System.out.println("Şifre boşluk içermemelidir");
            } else {
                flag++;

            }
            if (sifre.length()>=8) {
                flag++;

            } else {
                System.out.println("Şifre 8 karakterden büyük olmalıdır");
            }
            denemeSayisi++;
        }

        System.out.println("Tebrikler! " + denemeSayisi + " denemede başarılı olarak kayıt yapıldı");

    }

}
/*
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sifre;
    int flag = 0;
    int denemeSayisi = 0;

    while (flag != 4) {
        flag=0;
        System.out.println("Lütfen bir şifre giriniz:");
        sifre = scan.nextLine();

        if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            flag++;
        } else {
            System.out.println("Lütfen ilk karakteri küçük olarak giriniz.");
        }

        if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
            flag++;
        } else {
            System.out.println("Lütfen son karakteri büyük olarak giriniz.");
        }

        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemelidir.");
        } else {
            flag++;
        }

        if (sifre.length() >= 8) {
            flag++;
        } else {
            System.out.println("Şifre 8 karakterden büyük olmalıdır.");
        }
        denemeSayisi++;
    }
    System.out.println("Tebrikler! " + denemeSayisi + " denemede başarılı olarak kayıt yapıldı.");
}

 */