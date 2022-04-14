package ifConditionals;

import java.util.Scanner;

public class IfIlkHarf {
    public static void main(String[] args) {

        // kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin

        System.out.println("Bir harf giriniz");
        Scanner girilenHarf=new Scanner(System.in);
        char harf=girilenHarf.next().toLowerCase().charAt(0);

        if (harf>='a' && harf<='z')
        {
            System.out.println("Girdiginiz deger :" + harf);
            if (harf=='p')
            {
                System.out.println("Pazartesi,Persembe,Pazar");
            }
            else if (harf=='s')
            {
                System.out.println("Sali");
            }
            else if (harf=='c')
            {
                System.out.println("Carsamba,Cuma,Cumartesi");
            }
            else
            {
                System.out.println("Girdiginiz harf degerine gore gun bulunamamistir");
            }
        }
        else
        {
            System.out.println("Harf girmediniz");
        }
    }
}
