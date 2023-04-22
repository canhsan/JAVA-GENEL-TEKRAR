package day06_IfStatement;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi harf giriniz");
        char krk=scan.next().charAt(0);


        if (krk>='a' && krk<='z'){
            System.out.println(Character.toUpperCase(krk));

        }else {
            System.out.println("Girilen harf:git"+ " "+ krk);
        }

    }
}
