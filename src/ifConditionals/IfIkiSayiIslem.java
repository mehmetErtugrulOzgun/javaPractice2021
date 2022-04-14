package ifConditionals;
import java.util.Scanner;

public class IfIkiSayiIslem {

    // Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
    //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
    //isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
    //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

    public static void main(String[] args) {

        System.out.println("Ilk degerinizi giriniz");
        Scanner girilenA=new Scanner(System.in);
        double a=girilenA.nextDouble();

        System.out.println("Ikinci degerinizi giriniz");
        Scanner girilenB=new Scanner(System.in);
        double b=girilenB.nextDouble();

        System.out.println("Girdiginiz degerler sirasi ile : " + a + " " + b);
        if (a>0 && b>0)
        {
            System.out.println("Iki sayinin toplami = " +(a+b));
        }
        else if ((a<0 && b>0) || (a>0 && b<0))
        {
            System.out.println("Farkli isarette olduklari icin islem yapamazsin");
        }
        else if (a<0 && b<0)
        {
            System.out.println("Iki sayinin carpimi = " + (a*b));
        }
        else
        {
            System.out.println("Sayilardan en az birine sifir girdiniz");
        }
    }
}
