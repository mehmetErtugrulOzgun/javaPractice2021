package ternaryOperator;

import java.util.Scanner;

public class TernaryOperator03 {
    public static void main(String[] args) {

        // Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        System.out.println("Bir tam sayi girin");
        Scanner alinanSayi=new Scanner(System.in);
        int sayi=alinanSayi.nextInt();

        String sonuc=((sayi/2==0)) ? "sayi cifttir" : "sayi tektir";

        System.out.println(sonuc + " https://www.youtube.com/watch?v=Ao93WNWqhBg");
    }
}