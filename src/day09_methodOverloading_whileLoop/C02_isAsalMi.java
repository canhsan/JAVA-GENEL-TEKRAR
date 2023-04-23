package day09_methodOverloading_whileLoop;

public class C02_isAsalMi {
    public static void main(String[] args) {
        boolean sonuc=isAsalMi(21);
        System.out.println(sonuc);
    }

    public static boolean isAsalMi(int sayi) {
        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
        if (sayi % 2 == 0) {
            return true;

        } else if (flag == 0) {
            return true;

        } else {
            return false;

        }
    }
}

