package ifConditionals;

import java.util.Scanner;

public class IfHarfNotunaCevirme {
    public static void main(String[] args) {

        // 100luk sistemde girilen notu harf notuna cevirme

        System.out.println("Bir not degeri giriniz");

        Scanner alinanNot=new Scanner(System.in);
        int girilenNot=alinanNot.nextInt();

        if (girilenNot>=90)
        {
            System.out.println("Ogrenci aa ile gecmistir");
        }
        else if (girilenNot>=80)
        {
            System.out.println("Ogrenci ba ile gecmistir");
        }
        else if (girilenNot>=70)
        {
            System.out.println("Ogrenci bb ile gecmistir");
        }
        else if (girilenNot>=60)
        {
            System.out.println("Ogrenci cb ile gecmistir");
        }
        else if (girilenNot>=50)
        {
            System.out.println("Ogrenci cc ile gecmistir");
        }
        else if (girilenNot>=40)
        {
            System.out.println("Ogrenci dc ile gecmistir");
        }
        else if (girilenNot>=30)
        {
            System.out.println("Ogrenci dd ile gecmistir");
        }
        else if (girilenNot>=0)
        {
            System.out.println("Ogrenci kalmistir");
        }
        else
        {
            System.out.println("Gecersiz bir not degeri girdiniz");
        }


    }
}
