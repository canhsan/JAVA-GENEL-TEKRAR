package day07_Array;

import java.util.ArrayList;
import java.util.List;

public class C02_arrayList {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(10);
        sayilar.add(20);
        System.out.println(sayilar);
        List<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(1);
        sayilar2.add(100);
        sayilar2.add(250);
        System.out.println(sayilar2.contains(sayilar));
        System.out.println(sayilar2.addAll(sayilar));
        System.out.println(sayilar2);


        int[] sayi1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> yeniSayi = new ArrayList<>();

        for (int each : sayi1

        ) {
            yeniSayi.add(each);

        }

        System.out.println(yeniSayi);
    }
}
