package day08_methodOlusturma;

import java.util.Scanner;

public class C05_palindrom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin=scan.nextLine();
        String tersmetin=C04_tersineMetinCevirmeMethodu.tersineMetinCevirmeMethodu(girilenMetin);

        if (girilenMetin.equalsIgnoreCase(tersmetin)){
            System.out.println("Girilen metin palindromdur");

        }else{
            System.out.println("Girilen Metin Palindrom değildir");
        }
    }
}
