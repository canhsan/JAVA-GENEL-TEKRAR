package day03_DataCasting;

public class C02_ExpilicitNarrowing {
    public static void main(String[] args) {

        byte sayi1 = 127;
        short sayi2 = 30000;
        int sayi3 = 10;
        long sayi4=1555000888;
        double sayi5=30.25000;
        float sayi6=12.4187963F;


        sayi6=sayi1;
        sayi1=(byte)sayi6;


    }



}
