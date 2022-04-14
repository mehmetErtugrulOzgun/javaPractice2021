package ifConditionals;

import java.util.Scanner;

public class IfIkiSayininHesabi {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi isteyip bununla alakali islemi yaptiralim

        System.out.println("Gireceginiz iki sayi icin asagidaki islemlerden " +
                "hangisini yapmak istiyorsaniz ona tiklayiniz");

        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        Scanner alinanIslem=new Scanner(System.in);
        int islem=alinanIslem.nextInt();

        if (islem==1)
        {
            System.out.println("Girdiginiz iki sayinin toplami a+b seklinde toplanacaktir " +
                    "gireceginiz degerleri sirasi ile yaziniz");
            System.out.println("Birinci sayiyi giriniz");
            Scanner alinanSayi1=new Scanner(System.in);
            double sayi1=alinanSayi1.nextDouble();

            System.out.println("Ikinci sayiyi giriniz");
            Scanner alinanSayi2=new Scanner(System.in);
            double sayi2=alinanSayi2.nextDouble();

            System.out.println("Girdiginiz degeler : " + sayi1 + " , " + sayi2);
            System.out.println("Sonuc : " + (sayi1+sayi2));
        }
        else if (islem==2)
        {
            System.out.println("Girdiginiz iki sayinin cikarimi a-b seklinde cikarilacaktir " +
                    "gireceginiz degerleri sirasi ile yaziniz");
            System.out.println("Birinci sayiyi giriniz");
            Scanner alinanSayi1=new Scanner(System.in);
            double sayi1=alinanSayi1.nextDouble();

            System.out.println("Ikinci sayiyi giriniz");
            Scanner alinanSayi2=new Scanner(System.in);
            double sayi2=alinanSayi2.nextDouble();

            System.out.println("Girdiginiz degeler : " + sayi1 + " , " + sayi2);
            System.out.println("Sonuc : " +(sayi1-sayi2));
        }
        else if (islem==3)
        {
            System.out.println("Girdiginiz iki sayinin cikarimi a*b seklinde carpilacaktir" +
                    " gireceginiz degerleri sirasi ile yaziniz:");
            System.out.println("Birinci sayiyi giriniz");
            Scanner alinanSayi1=new Scanner(System.in);
            double sayi1=alinanSayi1.nextDouble();

            System.out.println("Ikinci sayiyi giriniz");
            Scanner alinanSayi2=new Scanner(System.in);
            double sayi2=alinanSayi2.nextDouble();

            System.out.println("Girdiginiz degeler : " + sayi1 + " , " + sayi2);
            System.out.println("Sonuc : " +(sayi1*sayi2));
        }
        else if (islem==4)
        {
            System.out.println("Girdiginiz iki sayinin cikarimi a/b seklinde bolunecektir" +
                    " gireceginiz degerleri sirasi ile yaziniz");
            System.out.println("Birinci sayiyi giriniz");
            Scanner alinanSayi1=new Scanner(System.in);
            double sayi1=alinanSayi1.nextDouble();

            System.out.println("Ikinci sayiyi giriniz");
            Scanner alinanSayi2=new Scanner(System.in);
            double sayi2=alinanSayi2.nextDouble();

            System.out.println("Girdiginiz degeler : " + sayi1 + " , " + sayi2);
            System.out.println("Sonuc : " + (sayi1/sayi2));
        }
        else
        {
            System.out.println("Hatali bir giris yaptiniz");
        }
    }
}
