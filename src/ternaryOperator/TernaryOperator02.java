package ternaryOperator;

import java.util.Scanner;

public class TernaryOperator02 {
    public static void main(String[] args) {

        // Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        System.out.println("Bir sayi giriniz");
        Scanner alinanSayi1=new Scanner(System.in);
        int sayi1=alinanSayi1.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        Scanner alinanSayi2=new Scanner(System.in);
        int sayi2=alinanSayi2.nextInt();

        int sonuc=(sayi1>sayi2) ? sayi2:sayi1;
        System.out.println(sonuc);

    }
}
