package day09_methodOverloading_whileLoop;

public class C03_methodOverLoading {
    public static void main(String[] args) {
        String kelime="Bu iş olacak başka yolu yok";
        System.out.println(kelime.replace("Bu iş", "Java"));
        System.out.println(kelime.replace('i', 'a'));
        System.out.println(kelime.replaceAll("Bu iş olacak başka yolu yok", "hasan olacak dedim sana Allahın İzni ile...."));
    }
}
