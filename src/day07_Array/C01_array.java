package day07_Array;

import java.util.Arrays;

public class C01_array {
    public static void main(String[] args) {
        int[] sayilar={1,2,3};
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));
        int rakamlar[]=new int[6];
        System.out.println(Arrays.toString(rakamlar));


        sayilar[0]=100;
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar[0]);



        String str="hasan hatice bahadır mahir";
        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String [] kelimeler2=str.split("a");
        System.out.println(Arrays.toString(kelimeler2));

        String [] kelimeler3=str.split("");
        System.out.println(Arrays.toString(kelimeler3));
        System.out.println(Arrays.equals(sayilar, rakamlar));


    }
}
