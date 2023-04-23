package day08_methodOlusturma;

public class C04_tersineMetinCevirmeMethodu {
    public static void main(String[] args) {
        System.out.println(tersineMetinCevirmeMethodu("metin hasan"));
        System.out.println(tersineMetinCevirmeMethodu("hatice"));

    }

    public static String tersineMetinCevirmeMethodu(String metin) {
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        return tersMetin;

    }
}
