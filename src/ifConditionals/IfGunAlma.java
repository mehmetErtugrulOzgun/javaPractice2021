package ifConditionals;

import java.util.Locale;
import java.util.Scanner;

public class IfGunAlma {
    public static void main(String[] args) {

        // kullanicidan gun ismi alip o gunun haftaici mi yoksa haftasonu mu oldugunu yazdirin

        System.out.println("Bir gun ismi giriniz");
        Scanner gunIsmiAlma=new Scanner(System.in);
        String gunIsmi=gunIsmiAlma.nextLine().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar"))
        {
            System.out.println("Girdiginiz gun haftasonudur.");
        }
        else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
        gunIsmi.equals("persembe") || gunIsmi.equals("cuma"))
        {
            System.out.println("Girdiginiz gun haftaicidir");
        }
        else
        {
            System.out.println("Gecersiz bir gun girdiniz");
        }

    }
}
