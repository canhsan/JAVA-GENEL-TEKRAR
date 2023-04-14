package day06_IfStatement;

public class C01_Ifbagimsiz {
    public static void main(String[] args) {
        int a=101;
        int b=203;
        if (a>b){
            System.out.println("a sayısı b sayısından büyüktür.");
        }
        if (a<b){
            System.out.println("a sayısı b sayısından küçüktür.");
        }
        if (a%5==0){
            System.out.println("a sayısı 5'in katıdır.");
        }
        if (b>100){
            System.out.println("b sayısı en az  3 basamaklıdır.");
        }
    }
}
