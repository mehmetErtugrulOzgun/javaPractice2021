package ifConditionals;

import java.util.Scanner;

public class IfTamBolunme {
    public static void main(String[] args) {

        // girilen sayinin tek mi cift mi oldugunu anlayan bir kod blogu olusturunuz

        System.out.println("Tek mi cift mi oldugunu kontrol etmek istediginiz tam sayiyi giriniz");

        Scanner alinanSayi=new Scanner(System.in);
        int sayi=alinanSayi.nextInt();
        System.out.println("Girmis oldugunuz sayi : " +sayi);

        if (sayi%2==0)
        {
            System.out.println("Girdiginiz deger cifttir");
        }
        else
        {
            System.out.println("Girdiginiz sayi tektir");
        }
    }
}