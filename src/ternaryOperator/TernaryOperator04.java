package ternaryOperator;

import java.util.Scanner;

public class TernaryOperator04 {
    public static void main(String[] args) {

        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        System.out.println("Bir sayi giriniz");
        Scanner alinanSayi=new Scanner(System.in);
        int sayi=alinanSayi.nextInt();

        int sonuc=(sayi>0) ? sayi : -sayi;
        System.out.println(sonuc);
    }
}