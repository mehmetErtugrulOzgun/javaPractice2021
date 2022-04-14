package ifConditionals;

import java.util.Scanner;

public class IfKareDikdortgen {
    public static void main(String[] args) {

        // kullanicidan iki kenar boyutu alinarak
        // alinan degerlere gore girdigi degerin dikdortgen mi yoksa kare mi oldugunu anlama

        System.out.println("1.kenar uzunlugunu giriniz");
        Scanner kenarAlma1=new Scanner(System.in);
        int kenar1=kenarAlma1.nextInt();

        System.out.println("2.kenar uzunlugunu giriniz");
        Scanner kenarAlma2=new Scanner(System.in);
        int kenar2= kenarAlma2.nextInt();

        if (kenar1==kenar2 && (kenar1>0 && kenar2>0))
        {
            System.out.println("Girdiginiz degerlere gore sekliniz karedir");
        }
        else if (kenar1!=kenar2 && (kenar1>0 && kenar2>0))
        {
            System.out.println("Girdiginiz degelere gore sekliniz dikdortgendir");
        }
        else
        {
            System.out.println("Gecersiz bir deger girdiniz");
        }
    }
}
