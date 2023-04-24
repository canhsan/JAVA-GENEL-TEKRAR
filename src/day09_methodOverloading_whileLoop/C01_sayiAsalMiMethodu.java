package day09_methodOverloading_whileLoop;

public class C01_sayiAsalMiMethodu {
    public static void main(String[] args) {
        sayiAsalMiMethodu(23);
        sayiAsalMiMethodu(2);
        sayiAsalMiMethodu(35);
        sayiAsalMiMethodu(145);

    }

    public static void sayiAsalMiMethodu(int sayi) {
        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;

            }

        }
        if (sayi % 2 == 0) {
            System.out.println("Girilen " + sayi + " sayısı Asal bir sayıdır.");

        } else if (flag == 0) {
            System.out.println("Girilen " + sayi + " sayısı Asal bir sayıdır.");

        } else {
            System.out.println("Girilen " + sayi + " saysı Asal bir sayı değildir.");

        }

    }
}