package ternaryOperator;

import java.util.Scanner;

public class TernaryOperator05 {
    public static void main(String[] args) {

        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
        //sayinin karesini yazdirin

        System.out.println("Bir sayi giriniz");
        Scanner alinanSayi=new Scanner(System.in);
        int sayi=alinanSayi.nextInt();

        String sonuc=(sayi>0) ? "Sayi pozitif" : String.valueOf((sayi*sayi));
        System.out.println(sonuc);
    }
}