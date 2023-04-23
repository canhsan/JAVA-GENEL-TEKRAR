package day08_methodOlusturma;

public class C03_methodOlusturma {
    public static void main(String[] args) {
        int sonuc=faktöryelHesaplayanMethod(5);
        System.out.println(sonuc);


    }
    public static int faktöryelHesaplayanMethod(int sayi){
        int faktöryel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktöryel *=i;

        }
        return faktöryel;
    }
}
